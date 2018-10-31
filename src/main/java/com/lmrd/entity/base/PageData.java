package com.lmrd.entity.base;

import java.util.List;

/**
 * 分页数据实体类
 * @param <T>
 * @author uimagine
 */
public class PageData<T> {
	private static final long serialVersionUID = 1L;
	
	// Fields
	
	private int pageNum;// 当前页
	private int pageSize;// 每页显示的记录条数
	private int size;// 当前页的数量
	private int startRow;// 记录开始索引
	private int endRow;// 记录结束索引
	private long total;// 总记录数
	private int pages;// 总记录页数
	private List<T> data;// 分页数据
	private int firstPage;// 第一页
	private int prePage;// 上一页
	private int nextPage;// 下一页
	private int lastPage;// 最后一页
	private boolean isFirstPage = false;// 是否为第一页
	private boolean isLastPage = false;// 是否为最后一页
	private boolean hasPreviousPage = false;// 是否有上一页
	private boolean hasNextPage = false;// 是否有下一页
	private int navigatePages = 5;// 导航页码数
	private int[] navigatepageNums;// 所有导航页号

	// Custom Constructor
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PageData(List<T> list) {
		if (list instanceof Pagination) {
			Pagination page = (Pagination) list;
			this.pageNum = page.getPageNum();
			this.pageSize = page.getPageSize();
			this.total = page.getTotal();
			this.pages = page.getPages();
			this.data = page;
			this.size = page.size();
			// 由于结果是>startRow的，所以实际的需要+1
			this.startRow = page.getStartRow() + 1;
			// 计算实际的endRow（最后一页的时候特殊）
			this.endRow = this.startRow - 1 + this.size;
			// 计算导航页
			calcNavigatepageNums();
			// 计算前后页，第一页，最后一页
			calcPage();
			// 判断页面边界
			judgePageBoudary();
		}
	}

	/**
	 * 计算导航页
	 */
	private void calcNavigatepageNums() {
		// 当总页数小于或等于导航页码数时
		if (pages <= navigatePages) {
			navigatepageNums = new int[pages];
			for (int i = 0; i < pages; i++) {
				navigatepageNums[i] = i + 1;
			}
		} else { // 当总页数大于导航页码数时
			navigatepageNums = new int[navigatePages];
			int startNum = pageNum - navigatePages / 2;
			int endNum = pageNum + navigatePages / 2;

			if (startNum < 1) {
				startNum = 1;
				// (最前navigatePages页
				for (int i = 0; i < navigatePages; i++) {
					navigatepageNums[i] = startNum++;
				}
			} else if (endNum > pages) {
				endNum = pages;
				// 最后navigatePages页
				for (int i = navigatePages - 1; i >= 0; i--) {
					navigatepageNums[i] = endNum--;
				}
			} else {
				// 所有中间页
				for (int i = 0; i < navigatePages; i++) {
					navigatepageNums[i] = startNum++;
				}
			}
		}
	}

	/**
	 * 计算前后页，第一页，最后一页
	 */
	private void calcPage() {
		if (navigatepageNums != null && navigatepageNums.length > 0) {
			firstPage = navigatepageNums[0];
			lastPage = navigatepageNums[navigatepageNums.length - 1];
			if (pageNum > 1) {
				prePage = pageNum - 1;
			}
			if (pageNum < pages) {
				nextPage = pageNum + 1;
			}
		}
	}

	/**
	 * 判定页面边界
	 */
	private void judgePageBoudary() {
		isFirstPage = pageNum == 1;
		isLastPage = pageNum == pages && pageNum != 1;
		hasPreviousPage = pageNum > 1;
		hasNextPage = pageNum < pages;
	}

	// Property accessors
	
	public int getPageNum() {
		return pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public long getTotal() {
		return total;
	}

	public int getPages() {
		return pages;
	}

	public List<T> getData() {
		return data;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public int getPrePage() {
		return prePage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public boolean isFirstPage() {
		return isFirstPage;
	}

	public boolean isLastPage() {
		return isLastPage;
	}

	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public int getNavigatePages() {
		return navigatePages;
	}

	public int[] getNavigatepageNums() {
		return navigatepageNums;
	}

	/**
	 * 重写toString()
	 */
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("PageInfo{");
		sb.append("pageNum=").append(pageNum);
		sb.append(", pageSize=").append(pageSize);
		sb.append(", size=").append(size);
		sb.append(", startRow=").append(startRow);
		sb.append(", endRow=").append(endRow);
		sb.append(", total=").append(total);
		sb.append(", pages=").append(pages);
		sb.append(", data=").append(data);
		sb.append(", firstPage=").append(firstPage);
		sb.append(", prePage=").append(prePage);
		sb.append(", nextPage=").append(nextPage);
		sb.append(", lastPage=").append(lastPage);
		sb.append(", isFirstPage=").append(isFirstPage);
		sb.append(", isLastPage=").append(isLastPage);
		sb.append(", hasPreviousPage=").append(hasPreviousPage);
		sb.append(", hasNextPage=").append(hasNextPage);
		sb.append(", navigatePages=").append(navigatePages);
		sb.append(", navigatepageNums=");
		if (navigatepageNums == null)
			sb.append("null");
		else {
			sb.append('[');
			for (int i = 0; i < navigatepageNums.length; ++i)
				sb.append(i == 0 ? "" : ", ").append(navigatepageNums[i]);
			sb.append(']');
		}
		sb.append('}');
		return sb.toString();
	}
}
