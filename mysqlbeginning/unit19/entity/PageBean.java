package start.unit19.entity;

import java.util.List;

public class PageBean {

	private int total;
	private int page;
	private int size;
	private List<Book> list;
	
	public PageBean() {
		super();
	}
	

	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getTotal() {
		return total;
	}
	

	public void setTotal(int total) {
		this.total = total;
	}
	

	public List<Book> getList() {
		return list;
	}
	

	public void setList(List<Book> list) {
		this.list = list;
	}
	
}
