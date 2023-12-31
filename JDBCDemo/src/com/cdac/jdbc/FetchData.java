package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

//import com.mysql.cj.jdbc.Driver;

public class FetchData {
	public static void main(String args[]) {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136");
			String sql="select * from tbl_product where price >= ?";
			PreparedStatement stmt=conn.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter thr price based on which products will be displayed");
			double basePrice = sc.nextDouble();
			
			stmt.setDouble(1, basePrice); //substituting ? with the actual data
			
			ResultSet rs = stmt.executeQuery();
				while(rs.next())  {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				int quantity = rs.getInt("quantity");
				System.out.println(id + " , " + name + " , " + price + " , " + quantity);
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();		
			}
		finally {
			try { conn.close(); } catch(Exception e) {}
		}
	}
} 
