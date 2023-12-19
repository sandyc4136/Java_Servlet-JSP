package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDataLoader {
	
	// The ProductDataLoader class is a Java class responsible for loading a list of products from a MySQL database
	
	public List<Product> loadProducts(int offset) { // accepts offset - starting point of result 
		// The method returns a list of Product objects.
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // loads the MySQL JDBC driver.
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136"); //establishes a connection to the MySQL database.
			String sql="select * from tbl_product limit 5 offset ?";
			
			PreparedStatement stmt=conn.prepareStatement(sql); // PreparedStatement is used to safely pass parameters to the SQL query.
			stmt.setInt(1,offset);
			ResultSet rs=stmt.executeQuery();  
			
			List<Product> list = new ArrayList<>();
			
			// The ResultSet obtained from the above executed query is processed within a while loop
			
			//For each row in the result set, it extracts the values of columns (ID, name, price, quantity) and creates a Product object.
				while(rs.next()){
					int id=rs.getInt(1);
					String name=rs.getString(2);
					double price=rs.getDouble(3);
					int quantity=rs.getInt(4);
					Product p=new Product(id, name, price, quantity);
					list.add(p);
				}
				return list; // The method returns the list of Product objects retrieved from the database.
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();	
					return null; // instead we should throw exception
					
				}
			finally {
				try { conn.close(); } catch(Exception e) {}
			}
	}
}
