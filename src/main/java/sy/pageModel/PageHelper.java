package sy.pageModel;

/**
 * EasyUI 分页帮助类
 * 
 * @author 郭冬冬
 * 
 */
public class PageHelper implements java.io.Serializable {

	/** 开始位置 */
	private int page;// 当前页
	/** 每页记录数 */
	private int rows;// 每页显示记录数
	/** 根据哪个字段排序 */
	private String sort;// 排序字段
	/** 正序还是倒序 (ASC/DESC) */
	private String order;// 正序还是倒序 (ASC/DESC)

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}
