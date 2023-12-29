
package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductLoader {
	
	
	  public static Connection getConnection(){  
		  Connection conn=null; 
	        try{  
	            Class.forName("com.mysql.cj.jdbc.Driver");  
	            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136"); 
	        }catch(SQLException e){
	        	e.printStackTrace();
	        } 
	        catch (ClassNotFoundException e) {
	    		e.printStackTrace();  
	        }
	        return conn;  
	    }  
	
	// To insert Products
	public void loadProducts(Products product) throws ClassNotFoundException {
		
		try {
			Connection conn=ProductLoader.getConnection();
			String insert_Sql="insert into Products (product_id, product_name, quantity, Price, Purchase_date) values (?,?,?,?,?);";
			PreparedStatement stmt=conn.prepareStatement(insert_Sql);
			
			
				stmt.setInt(1, product.getProduct_id());
				stmt.setString(2, product.getProduct_name());
				stmt.setInt(3, product.getQuantity());
				stmt.setInt(4, product.getPrice());
				stmt.setDate(5, new java.sql.Date(product.purchase_date.getTime()));
			
				stmt.executeUpdate(); 
				conn.close(); 
			}
		catch(SQLException e) {
			e.printStackTrace();	
			}
		
	}
	
	
	// To select Product
	public Products selectProduct(int product_id) throws SQLException{
		Products product=null;
		
		try {
			Connection conn=ProductLoader.getConnection();
			String select_Sql="select product_id, product_name, quantity, price, purchase_date from Products where product_id=?;";
			PreparedStatement stmt=conn.prepareStatement(select_Sql);
			
			stmt.setInt(1, product_id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				String product_name=rs.getString("product_name");
				int quantity=rs.getInt("quantity");
				int price=rs.getInt("price");
				Date purchase_date=rs.getDate("purchase_date");
				Products p=new Products(product_id, product_name,quantity, price, purchase_date);
				}
			conn.close();
			}catch(SQLException e) {
				e.printStackTrace();	
				}
		return product;
	}
	
	// To select product List
	
	public List<Products> selectAllProducts() {

		List<Products> list = new ArrayList<Products>();
		
		
			try {
				Connection conn=ProductLoader.getConnection();
				String select_Sql="select * from Products;";
				PreparedStatement stmt=conn.prepareStatement(select_Sql);
		
//				System.out.println(stmt);
				
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int product_id=rs.getInt("product_id");
				String product_name=rs.getString("product_name");
				int quantity=rs.getInt("quantity");
				int price=rs.getInt("price");
				Date purchase_date=rs.getDate("purchase_date");
				Products p=new Products(product_id, product_name,quantity, price, purchase_date);
				list.add(p);
				}
			conn.close();
			} 
			catch( SQLException e) {
				e.printStackTrace();	
				}
			return list;
	}

	
	// To Update products
	
	public void updateProduct(Products product) throws ClassNotFoundException {
		
		try {
			Connection conn=ProductLoader.getConnection();
			String update_Sql="Update Products set  product_name=?, quantity=?, Price=?, Purchase_date=? where product_id=? ;";
			PreparedStatement stmt=conn.prepareStatement(update_Sql);
			
			
			stmt.setString(1, product.getProduct_name());
			stmt.setInt(2, product.getQuantity());
			stmt.setInt(3, product.getPrice());
			stmt.setDate(4, new java.sql.Date(product.purchase_date.getTime()));
			stmt.setInt(5, product.getProduct_id());
			stmt.executeUpdate(); 
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();	
			}
		
	}
	
	// To delete Product
	
	public void deleteProduct(int product_id) throws SQLException{
		
		try {
			Connection conn=ProductLoader.getConnection();
			String delete_Sql="delete from Products where  product_id=?;";
			PreparedStatement stmt=conn.prepareStatement(delete_Sql);
			
			stmt.setInt(1, product_id);
			stmt.executeUpdate(); 
			conn.close(); 
			}
		catch(SQLException e) {
			e.printStackTrace();	
			}
	}
	
}
	
