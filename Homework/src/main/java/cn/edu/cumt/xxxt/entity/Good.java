package cn.edu.cumt.xxxt.entity;

public class Good {
	private String good_num;
	private String good_name;
	private Integer price;
	private String catagory_sn;
	private Integer count;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getGood_num() {
		return good_num;
	}
	public void setGood_num(String good_num) {
		this.good_num = good_num;
	}
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getCatagory_sn() {
		return catagory_sn;
	}
	public void setCatagory_sn(String catagory_sn) {
		this.catagory_sn = catagory_sn;
	}
}
