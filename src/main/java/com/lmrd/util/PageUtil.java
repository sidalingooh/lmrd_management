package com.lmrd.util;


import com.lmrd.entity.base.Pagination;
import com.foundationdb.sql.StandardException;
import com.foundationdb.sql.parser.OrderByList;
import com.foundationdb.sql.parser.SQLParser;
import com.foundationdb.sql.parser.StatementNode;
import com.foundationdb.sql.unparser.NodeToString;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import net.sf.jsqlparser.JSQLParserException;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.*;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * MyBatis分页拦截器
 * ClassName: PageUtil 
 * @Description: TODO
 * @author LiuSiGuang
 * @date 2017年10月12日 上午11:41:32
 */
@Intercepts(@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class,ResultHandler.class }))
@SuppressWarnings("rawtypes")
public class PageUtil implements Interceptor {

	// Fields

	public static final ObjectFactory DEFAULT_OBJECT_FACTORY = new DefaultObjectFactory();
	public static final ObjectWrapperFactory DEFAULT_OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();
	private static final ReflectorFactory DEFAULT_REFLECTOR_FACTORY = new DefaultReflectorFactory();
	public static final MetaObject NULL_META_OBJECT = MetaObject.forObject(NullObject.class, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY,DEFAULT_REFLECTOR_FACTORY);

	private static class NullObject {

	}

	/**
	 * 反射对象，增加对低版本Mybatis的支持
	 * 
	 * @param object
	 * @return
	 */
	public static MetaObject forObject(Object object) {
		return MetaObject.forObject(object, DEFAULT_OBJECT_FACTORY, DEFAULT_OBJECT_WRAPPER_FACTORY,DEFAULT_REFLECTOR_FACTORY);
	}

	/**
	 * 解析 - 去掉order by 语句
	 */
	private static class UnParser extends NodeToString {
		private static final SQLParser PARSER = new SQLParser();

		public String removeOrderBy(String sql) throws StandardException {
			/*StatementNode stmt = PARSER.parseStatement(sql);
			System.out.println("sql:"+sql);
			System.out.println("stmt:"+toString(stmt));
			return toString(stmt);*/
			SqlServerParse ssp = new SqlServerParse();
			try {
				return ssp.removeOrderBy(sql);
			} catch (JSQLParserException e) {

				e.printStackTrace();
				return sql;
			}


			/*Statement stmt = CCJSqlParserUtil.parse(sql);
			Select select = (Select) stmt;
			SelectBody selectBody = select.getSelectBody();
			processSelectBody(selectBody);
			return select.toString();*/

		}

		@Override
		protected String orderByList(OrderByList node) throws StandardException {
			// order by中如果包含参数就原样返回
			// 这里建议order by使用${param}这样的参数
			// 这种形式的order by可以正确的被过滤掉，并且支持大部分的数据库
			String sql = nodeList(node);
			if (sql.indexOf('$') > -1) {
				return "ORDER BY " + sql.replaceAll("\\$\\d+", "?");
			}
			return "";
		}
	}

	// SQL反解析
	private static final UnParser UNPARSER = new UnParser();
	// SQL缓存
	private static final Cache<Integer, String> COUNT_CACHE = CacheBuilder.newBuilder().maximumSize(500).expireAfterWrite(30, TimeUnit.MINUTES).build();
	private static final String BOUND_SQL = "sqlSource.boundSql.sql";
	private static final ThreadLocal<Pagination> LOCAL_PAGE = new ThreadLocal<Pagination>();
	private static final List<ResultMapping> EMPTY_RESULTMAPPING = new ArrayList<ResultMapping>(0);

	// 数据库方言
	private static String dialect = "";
	// RowBounds参数offset作为PageNum使用 - 默认不使用
	private static boolean offsetAsPageNum = false;
	// RowBounds是否进行count查询 - 默认不查询
	private static boolean rowBoundsWithCount = false;
	// 当设置为true的时候，如果pagesize设置为0（或RowBounds的limit=0），就不执行分页
	private static boolean pageSizeZero = false;

	/**
	 * 开始分页
	 * @param pageNum 当前页码
	 * @param pageSize 每页显示记录条数
	 */
	public static void startPage(int pageNum, int pageSize) {
		startPage(pageNum, pageSize, true);
	}

	/**
	 * 开始分页
	 * @param pageNum 当前页码
	 * @param pageSize 每页显示记录条数
	 * @param count 是否进行count查询
	 */
	private static void startPage(int pageNum, int pageSize, boolean count) {
		LOCAL_PAGE.set(new Pagination(pageNum, pageSize, count));
	}

	/**
	 * 获取分页参数
	 * @param rowBounds
	 * @return
	 */
	private Pagination getPage(RowBounds rowBounds) {
		Pagination page = LOCAL_PAGE.get();
		// 移除本地变量
		LOCAL_PAGE.remove();
		if (page == null) {
			if (offsetAsPageNum) {
				page = new Pagination(rowBounds.getOffset(), rowBounds.getLimit(),
						rowBoundsWithCount);
			} else {
				page = new Pagination(rowBounds, rowBoundsWithCount);
			}
		}
		return page;
	}

	/**
	 * Mybatis拦截器方法
	 * @param invocation
	 * @return
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		final Object[] args = invocation.getArgs();
		RowBounds rowBounds = (RowBounds) args[2];
		if (LOCAL_PAGE.get() == null && rowBounds == RowBounds.DEFAULT) {
			return invocation.proceed();
		} else {
			// 忽略RowBounds-否则会进行Mybatis自带的内存分页
			args[2] = RowBounds.DEFAULT;
			MappedStatement ms = (MappedStatement) args[0];
			Object parameterObject = args[1];
			BoundSql boundSql = ms.getBoundSql(parameterObject);
			// 分页信息
			Pagination page = getPage(rowBounds);
			// pageSizeZero的判断
			if (pageSizeZero && page.getPageSize() == 0) {
				// 执行正常（不分页）查询
				Object result = invocation.proceed();
				// 得到处理结果
				page.addAll((List) result);
				// 这种情况相当于pageSize=total
				page.setPageSize(page.size());
				// 仍然要设置total
				page.setTotal(page.size());
				// 返回结果仍然为Page类型 - 便于后面对接收类型的统一处理
				return page;
			}
			// 创建一个新的MappedStatement
			MappedStatement qs = newMappedStatement(ms, new BoundSqlSqlSource(
					boundSql));
			// 将参数中的MappedStatement替换为新的qs，防止并发异常
			args[0] = qs;
			MetaObject msObject = forObject(qs);
			String sql = (String) msObject.getValue(BOUND_SQL);
			// 简单的通过total的值来判断是否进行count查询
			if (page.isCount()) {
				// 求count - 重写sql
				msObject.setValue(BOUND_SQL, getCountSql(sql));
				// 查询总数
				Object result = invocation.proceed();
				// 设置总数
				page.setTotal((Integer) ((List) result).get(0));
				if (page.getTotal() == 0) {
					return page;
				}
			}
			// pageSize>0的时候执行分页查询，pageSize<=0的时候不执行相当于可能只返回了一个count
			if (page.getPageSize() > 0) {
				// 分页sql - 重写sql
				msObject.setValue(BOUND_SQL, getPageSql(sql, page));
				// 恢复类型
				msObject.setValue("resultMaps", ms.getResultMaps());
				// 执行分页查询
				Object result = invocation.proceed();
				// 得到处理结果
				page.addAll((List) result);
			}
			// 返回结果
			return page;
		}
	}

	/**
	 * 获取总数sql - 如果要支持其他数据库，修改这里就可以
	 * @param sql
	 * @return
	 */
	private String getCountSql(final String sql) {
		try {
			return COUNT_CACHE.get(sql.hashCode(), new Callable<String>() {
				@Override
				public String call() throws Exception {
					if (sql.toUpperCase().contains("ORDER")) {
						return "select count(0) from ("
								+ UNPARSER.removeOrderBy(sql) + ") tmp_count";
					} else {
						return "select count(0) from (" + sql + ") tmp_count";
					}
				}
			});
		} catch (Exception e) {
			return "select count(0) from (" + sql + ") tmp_count";
		}
	}

	/**
	 * 获取分页sql - 如果要支持其他数据库，修改这里就可以
	 * @param sql
	 * @param page
	 * @return
	 */
	private String getPageSql(String sql, Pagination page) {
		StringBuilder pageSql = new StringBuilder(200);
		if ("postgresql".equals(dialect)) {
			pageSql.append("select * from (");
			pageSql.append(sql);
			pageSql.append(") as tmp_page LIMIT " + page.getPageSize()
					+ " OFFSET " + page.getStartRow());
		} else if ("mysql".equals(dialect)) {
			pageSql.append("select * from (");
			pageSql.append(sql);
			pageSql.append(") as tmp_page limit " + page.getStartRow() + ","
					+ page.getPageSize());
		} else if ("hsqldb".equals(dialect)) {
			pageSql.append(sql);
			pageSql.append(" LIMIT " + page.getPageSize() + " OFFSET "
					+ page.getStartRow());
		} else if ("oracle".equals(dialect)) {
			pageSql.append("select * from ( select temp.*, rownum row_id from ( ");
			pageSql.append(sql);
			pageSql.append(" ) temp where rownum <= ").append(page.getEndRow());
			pageSql.append(") where row_id > ").append(page.getStartRow());
		}
		return pageSql.toString();
	}

	private class BoundSqlSqlSource implements SqlSource {
		BoundSql boundSql;

		public BoundSqlSqlSource(BoundSql boundSql) {
			this.boundSql = boundSql;
		}

		public BoundSql getBoundSql(Object parameterObject) {
			return boundSql;
		}
	}

	/**
	 * 由于MappedStatement是一个全局共享的对象，因而需要复制一个对象来进行操作，防止并发访问导致错误
	 * @param ms
	 * @param newSqlSource
	 * @return
	 */
	private MappedStatement newMappedStatement(MappedStatement ms,
											   SqlSource newSqlSource) {
		MappedStatement.Builder builder = new MappedStatement.Builder(
				ms.getConfiguration(), ms.getId() + "_PageHelper",
				newSqlSource, ms.getSqlCommandType());
		builder.resource(ms.getResource());
		builder.fetchSize(ms.getFetchSize());
		builder.statementType(ms.getStatementType());
		builder.keyGenerator(ms.getKeyGenerator());
		if (ms.getKeyProperties() != null && ms.getKeyProperties().length != 0) {
			StringBuilder keyProperties = new StringBuilder();
			for (String keyProperty : ms.getKeyProperties()) {
				keyProperties.append(keyProperty).append(",");
			}
			keyProperties.delete(keyProperties.length() - 1,
					keyProperties.length());
			builder.keyProperty(keyProperties.toString());
		}
		builder.timeout(ms.getTimeout());
		builder.parameterMap(ms.getParameterMap());
		// 由于resultMaps第一次需要返回int类型的结果，所以这里需要生成一个resultMap - 防止并发错误
		List<ResultMap> resultMaps = new ArrayList<ResultMap>();
		ResultMap resultMap = new ResultMap.Builder(ms.getConfiguration(),
				ms.getId(), int.class, EMPTY_RESULTMAPPING).build();
		resultMaps.add(resultMap);
		builder.resultMaps(resultMaps);
		builder.resultSetType(ms.getResultSetType());
		builder.cache(ms.getCache());
		builder.flushCacheRequired(ms.isFlushCacheRequired());
		builder.useCache(ms.isUseCache());
		return builder.build();
	}

	/**
	 * 只拦截Executor
	 * @param target
	 * @return
	 */
	@Override
	public Object plugin(Object target) {
		if (target instanceof Executor) {
			return Plugin.wrap(target, this);
		} else {
			return target;
		}
	}

	/**
	 * 设置属性值
	 * @param p
	 */
	public void setProperties(Properties p) {
		dialect = p.getProperty("dialect");
		if (dialect == null || "".equals(dialect)) {
			throw new RuntimeException("Mybatis分页插件PageHelper无法获取dialect参数!");
		}
		// offset作为PageNum使用
		String offset = p.getProperty("offsetAsPageNum");
		if (offset != null && "TRUE".equalsIgnoreCase(offset)) {
			offsetAsPageNum = true;
		}
		// RowBounds方式是否做count查询
		String withcount = p.getProperty("rowBoundsWithCount");
		if (withcount != null && "TRUE".equalsIgnoreCase(withcount)) {
			rowBoundsWithCount = true;
		}
		// 当设置为true的时候，如果pagesize设置为0（或RowBounds的limit=0），就不执行分页
		String sizeZero = p.getProperty("pageSizeZero");
		if (sizeZero != null && "TRUE".equalsIgnoreCase(sizeZero)) {
			pageSizeZero = true;
		}
	}
	
	
	private static void pageWater(Integer pageNo, Integer pageSize, HttpServletRequest request, int total) {
        Integer totalPage = null;
        if (total % pageSize > 0) { // 不能整除
            totalPage = total / pageSize + 1;
        } else { // 能够整除
            totalPage = total / pageSize;
        }
        if (total == 0) {
            totalPage = 1;
        }
        if (pageNo > totalPage) {
            pageNo = 1;
        }
        request.setAttribute("pageNo", pageNo);
        request.setAttribute("totalPage", totalPage);
    }
}
