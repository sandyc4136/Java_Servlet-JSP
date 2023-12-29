package com.cdac.jdbc;

//import java.sql.Date;
import java.util.Date;
//import java.time.LocalDate;

public class Products {
	public int product_id;
	public String product_name;
	public int quantity;
	public int price;
	public Date purchase_date;
	
	
	public Products(int product_id, String product_name, int quantity, int price, Date purchase_date) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.quantity = quantity;
		this.price = price;
		this.purchase_date = purchase_date;
	}
	
	
	public Products() {
		super();
	}


	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
}
