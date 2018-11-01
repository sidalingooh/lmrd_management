package com.lmrd.util.tag;


import com.lmrd.entity.base.PageData;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

/**
 * 分页自定义标签
 * 
 * @param <T>
 * @author LiuSiGuang
 */
public class PageTag4top<T> extends BodyTagSupport {

	/**
	 * default SerialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// Fields

	private String url;// 请求URL
	private int pageSize = 5;// 每页要显示的记录数
	private int pageNo = 1; // 当前页号
	private int total; // 总记录数
	private String formName;// Form名称
	private boolean showEnd = false;
	private String cputName;

	private List<T> data;

	public PageTag4top() {

	}

	public PageTag4top(PageData<T> page) {
		this.data = page.getData();
		this.pageSize = page.getPageSize();
		this.total = Integer.parseInt(page.getTotal() + "");
		this.pageNo = page.getPageNum();
	}

	public int doStartTag() throws JspException {
		int pageCount = (total + pageSize - 1) / pageSize; // 计算总页数

		// 拼写要输出到页面的HTML文本
		StringBuilder sb = new StringBuilder();
		/*sb.append("<div class='paging' style='display: block;'>");

		sb.append("<div class='page' style='margin:20px auto; '>");
		
		sb.append("<div class='page-infor'>");
		sb.append("第<span>"+pageNo+"</span>页 共<span>"+pageCount+"</span>页 每页<span>"+pageSize+"</span>项");
		sb.append("</div>");*/
		
		
		/*sb.append("<p class=\"inall\">每页" + pageSize + "项</p>\r\n");
		sb.append("<p class=\"pagenumber\">\r\n");
		sb.append("<span>" + pageNo + "</span>/<span>" + pageCount
				+ "</span></p>\r\n");*/
		// sb.append(" <div class=\"box-bottom\">\r\n");
		if (total == 0) {
			// sb.append("<strong>没有可显示的项目</strong>\r\n");
		} else {
			showEnd = true;
			// 页号越界处理
			if (pageNo > pageCount) {
				pageNo = pageCount;
			}
			if (pageNo < 1) {
				pageNo = 1;
			}
			if (StringUtils.isBlank(formName)) {
				formName = "qPagerForm";
			}
			sb.append("<form style=\"float:left;\" method=\"post\" action=\"")
					.append(this.url)
					.append("\" name=\"" + formName + "\">\r\n");
			// sb.append("<ul class=\"pagination\"> \r\n");
			// 获取请求中的所有参数
			HttpServletRequest request = (HttpServletRequest) pageContext
					.getRequest();
			Enumeration<String> enumeration = request.getParameterNames();
			String name = null; // 参数名
			String value = null; // 参数值
			// 把请求中的所有参数当作隐藏表单域
			while (enumeration.hasMoreElements()) {
				name = enumeration.nextElement();
				value = request.getParameter(name);
				// 去除页号
				if (StringUtils.isNotBlank(cputName)) {
					if (name.equals(cputName)) {
						if (null != value && !"".equals(value)) {
							pageNo = Integer.parseInt(value);
						}
						continue;
					} else if (name.equals("pageNo")) {
						continue;
					}

				} else {
					if (name.equals("pageNo")) {
						if (null != value && !"".equals(value)) {
							pageNo = Integer.parseInt(value);
						}
						continue;
					}
				}

				sb.append("<input type=\"hidden\" name=\"").append(name)
						.append("\" value=\"").append(value).append("\"/>\r\n");
			}

			// 把当前页号设置成请求参数 如果自定义页号名为空 使用默认pageNo
			if (StringUtils.isNotBlank(cputName)) {
				sb.append("<input type=\"hidden\" name=\"").append(cputName)
						.append("\" value=\"").append(pageNo)
						.append("\"/>\r\n");
			} else {
				sb.append("<input type=\"hidden\" name=\"").append("pageNo")
						.append("\" value=\"").append(pageNo)
						.append("\"/>\r\n");
			}

			// 上一页处理
			/*sb.append("第<span>"+pageNo+"</span>页/共<span>"+pageCount+"</span>页");*/
			//sb.append("<a class=\"number\">第()页/共()页</a>");

			if (pageNo == 1) {
				sb.append("<a href=\"javascript:;\" title=\"首页\" class=\"layui-laypage-prev layui-disabled\" >首页</a>");
				sb.append("<a href=\"javascript:;\" title=\"上一页\" class=\"layui-laypage-prev layui-disabled\" >上一页</a>");
			} else {
				sb.append("<a class=\"layui-laypage-prev\" href=\"javascript:;\" title=\"首页\" onclick=\"javascript:turnOverPage"
						+ formName + "(")
						.append(1)
						.append(")\">首页</a>");
				sb.append("<a href=\"javascript:;\" title=\"上一页\" class=\"layui-laypage-prev\" onclick=\"javascript:turnOverPage"
						+ formName + "(")
						.append((pageNo - 1))
						.append(")\">上一页</a>");
			}

			// 如果前面页数过多,显示"..."
			int start = 1;
			 if (this.pageNo > 4) {
			 start = this.pageNo - 1;
			 sb.append("<a class=\"number\" href=\"javascript:;\" onclick=\"javascript:turnOverPage" + formName
			 + "(1)\">1</a>\r\n");
			 sb.append("<a class=\"number\" href=\"javascript:;\" onclick=\"javascript:turnOverPage" + formName
			 + "(2)\">2</a>\r\n");
			 }
			// // 显示当前页附近的页
			int end = this.pageNo + 1;
			if (end > pageCount) {
				end = pageCount;
			}
			 for (int i = start; i <= end; i++) {
			 if (pageNo == i) { // 当前页号不需要超链接
				 sb.append(
						 "<span class=\"layui-laypage-curr\" href=\"javascript:;\"><em class=\"layui-laypage-em\"></em><em>").append(i).append("</em></span>\r\n");
			 } else {
			 sb.append(
			 "<a class=\"number\" href=\"javascript:;\" onclick=\"javascript:turnOverPage" + formName
			 + "(").append(i).append(")\">").append(i)
			 .append("</a>\r\n");
			 }
			 }
			 // 如果后面页数过多,显示"..."
			 /*if (end < pageCount - 2) {
			 sb.append("<span class=\"page_pn\">&hellip;</span>\r\n");
			 }*/
			 if (end < pageCount - 1) {
			 sb.append("<a class=\"number\"  href=\"#\" onclick=\"javascript:turnOverPage" + formName + "(")
			 .append(pageCount - 1).append(")\">")
			 .append(pageCount - 1).append("</a>\r\n");
			 }
			 if (end < pageCount) {
			 sb.append("<a class=\"number\"  href=\"#\" onclick=\"javascript:turnOverPage" + formName + "(")
			 .append(pageCount).append(")\">").append(pageCount)
			 .append("</a>\r\n");
			 }

			// 下一页处理
			if (pageNo == pageCount) {
				sb.append("<a href=\"javascript:;\" title=\"下一页\" class=\"layui-laypage-next layui-disabled\" >下一页</a>");
				// 尾页处理
				sb.append("<a href=\"javascript:;\" title=\"尾页\" class=\"layui-laypage-next layui-disabled\" >尾页</a>");
			} else {
				sb.append("<a href=\"javascript:;\" title=\"下一页\" class=\"layui-laypage-next\" onclick=\"javascript:turnOverPage"
						+ formName + "(")
						.append((pageNo + 1))
						.append(")\">下一页</a>");
				// 尾页处理
				sb.append("<a href=\"javascript:;\" title=\"尾页\" class=\"layui-laypage-next\" onclick=\"javascript:turnOverPage"
						+ formName + "(")
						.append(pageCount)
						.append(")\">尾页</a>");
			}

			sb.append("<div class=\"clear\"></div></form>");
		}

		// 输出统计数据

				sb.append("<span class='layui-laypage-skip'>\r\n").append("到第")
				//.append("<span id=\"kkpager_gopage_wrap\">")

				.append("<input type=\"text\" id=\"btn_go_input\" onkeyup=\"this.value=this.value.replace(/\\D/g,'')\" onafterpaste=\"this.value=this.value.replace(/\\D/g,'')\" onfocus=\"focus_gopage();\" onkeypress=\"return keypress_gopage(event);\" onblur=\"blur_gopage();\" value=\""+pageNo+"\" hidefocus=\"true\" class=\"layui-input\">")
				.append("页")
				.append("<input type=\"button\" id=\"btn_go\" onclick=\"turnOverPage"
						+ formName
						+ "($('#btn_go_input').val())\" value=\"确定\" style=\"display: none;\" class=\"layui-laypage-btn\">")
				.append("&nbsp;&nbsp;&nbsp;第" + pageNo + "页")
				.append("/")
				.append("共" + pageCount + "页 共" + total + "条").append("</span>");

		// 输出统计数据
		// sb.append("&nbsp;共<strong>").append(total).append("</strong>项")
		// .append(",<strong>").append(pageCount)
		// .append("</strong>页&nbsp;\r\n");
		// 把生成的HTML输出到响应中
		/*sb.append("</div>");
		sb.append("</div>");*/
		try {
			pageContext.getOut().println(sb.toString());
		} catch (IOException e) {
			throw new JspException(e);
		}
		return EVAL_BODY_INCLUDE; //
	}

	public int doEndTag() throws JspException {
		StringBuilder sb = new StringBuilder();
		int pageCount = 0;
		if (showEnd) {
			pageCount = (total + pageSize - 1) / pageSize; // 计算总页数
			if (StringUtils.isBlank(formName)) {
				formName = "qPagerForm";
			}
			sb.append("</ul>\r\n");
			sb.append("</form>\r\n");
			// sb.append("</div>\r\n");
			// sb.append("</div>\r\n");
			// 生成提交表单的JS
			sb.append("<script language=\"javascript\">\r\n");
			sb.append("  function turnOverPage" + formName + "(no){\r\n");
			sb.append("    if(no>").append(pageCount).append("){");
			sb.append("      no=").append(pageCount).append(";}\r\n");
			sb.append("    if(no<1){no=1;}\r\n");
			if (StringUtils.isNotBlank(cputName)) {
				sb.append("    document." + formName + "." + cputName
						+ ".value=no;\r\n");
			} else {
				sb.append("    document." + formName + ".pageNo.value=no;\r\n");
			}
			sb.append("    document." + formName + ".submit();\r\n");
			sb.append("  }\r\n");
			sb.append("</script>\r\n");
		}

		// sb.append("<div class=\"fenye_count\">共<span>" + pageCount
		// + "</span>页</div>\r\n");
		try {
			pageContext.getOut().println(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}

	// Property accessors

	public String getCputName() {
		return cputName;
	}

	public void setCputName(String cputName) {
		this.cputName = cputName;
	}

	public String getFormName() {
		if (StringUtils.isBlank(formName)) {
			formName = "qPagerForm";
		}
		return formName;
	}

	public void setFormName(String formName) {
		if (StringUtils.isBlank(formName)) {
			formName = "qPagerForm";
		} else {
			this.formName = formName;
		}
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getUrl() {
		return url;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public int getTotal() {
		return total;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}