package com.lmrd.entity.base;

import org.apache.ibatis.session.RowBounds;

import java.util.ArrayList;
import java.util.List;

/**
 * MyBatis分页对象实体
 * @param <E>
 * @author uimagine
 */
public class Pagination<E> extends ArrayList<E> {
	
	/**
	 * default SerialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// Fields
	
	private static final int NO_SQL_COUNT = -1;// 不进行count查询
	private static final int SQL_COUNT = 0;// 进行count查询
	private int pageNum;// 当前页码
	private int pageSize;// 每页显示记录条数
	private int startRow;// 记录开始索引
	private int endRow;// 记录结束索引
	private long total;// 记录总数
	private int pages;// 记录总页数

	// Custom Constructor
	public Pagination(int pageNum, int pageSize) {
		this(pageNum, pageSize, SQL_COUNT);
	}

	// Custom Constructor
	public Pagination(int pageNum, int pageSize, boolean count) {
		this(pageNum, pageSize, count ? Pagination.SQL_COUNT : Pagination.NO_SQL_COUNT);
	}

	// Custom Constructor
	public Pagination(int pageNum, int pageSize, int total) {
		super(pageSize > -1 ? pageSize : 0);
		// 分页合理化，针对不合理的页码自动处理
		if (pageNum < 0) {
			pageNum = 1;
		}
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.total = total;
		calculateStartAndEndRow();
	}

	// Custom Constructor
	public Pagination(RowBounds rowBounds, boolean count) {
		this(rowBounds, count ? Pagination.SQL_COUNT : Pagination.NO_SQL_COUNT);
	}

	// Custom Constructor
	public Pagination(RowBounds rowBounds, int total) {
		super(rowBounds.getLimit() > -1 ? rowBounds.getLimit() : 0);
		this.pageSize = rowBounds.getLimit();
		this.startRow = rowBounds.getOffset();
		// RowBounds方式默认不求count总数，如果想求count,可以修改这里为SQL_COUNT
		this.total = total;
		this.endRow = this.startRow + this.pageSize;
	}
	
	// Property accessors

	public List<E> getResult() {
		return this;
	}

	public int getPages() {
		return pages;
	}

	public int getEndRow() {
		return endRow;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		// 分页合理化，针对不合理的页码自动处理
		this.pageNum = pageNum < 0 ? 1 : pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartRow() {
		return startRow;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
		if (pageSize > 0) {
			pages = (int) (total / pageSize + ((total % pageSize == 0) ? 0 : 1));
		} else {
			pages = (int) total;
		}
		// 分页合理化，针对不合理的页码自动处理
		if (pageNum > pages) {
			pageNum = pages;
			calculateStartAndEndRow();
		}
	}

	/**
	 * 计算起止行号
	 */
	private void calculateStartAndEndRow() {
		this.startRow = this.pageNum > 0 ? (this.pageNum - 1) * this.pageSize
				: 0;
		this.endRow = this.pageNum * this.pageSize;
	}

	public boolean isCount() {
		return this.total > NO_SQL_COUNT;
	}

	/**
	 * 重写toString()
	 */
	@Override
	public String toString() {
		return "Page{" + "pageNum=" + pageNum + ", pageSize=" + pageSize + ", startRow=" + startRow + ", endRow=" + endRow + ", total=" + total + ", pages=" + pages + '}';
	}
}