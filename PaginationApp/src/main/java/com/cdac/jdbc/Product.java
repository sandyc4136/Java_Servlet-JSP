package com.cdac.jdbc;

public class Product {
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	
	public Product() {
		// default constructor
	}
	public Product(int id, String name, double price, int quantity) { 
		// parameterized constructor to initialize the Product object with specific values.
		
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// getter and setter methods for each attribute
	
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

// Overall, this class provides a blueprint for creating Product objects, 
// each representing a product with an ID, name, price, and quantity. 
// The getters and setters enable controlled access to the attributes, promoting encapsulation.
