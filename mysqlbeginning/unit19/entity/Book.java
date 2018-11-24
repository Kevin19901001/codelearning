package start.unit19.entity;

public class Book {

	private int id;
	private String name;
	private double price;
	private String remark;
	private String sn;
	
	public Book() {
		super();
	}
	

	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	

	public double getPrice() {
		return price;
	}
	

	public void setPrice(double price) {
		this.price = price;
	}
	

	public String getRemark() {
		return remark;
	}
	

	public void setRemark(String remark) {
		this.remark = remark;
	}
	

	public String getSn() {
		return sn;
	}
	

	public void setSn(String sn) {
		this.sn = sn;
	}
	
}
