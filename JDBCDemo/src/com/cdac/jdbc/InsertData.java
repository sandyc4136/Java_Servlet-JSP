package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String args[]){
		Connection conn = null;
				
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136");
//					System.out.println("Yayyyy, I got connected");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate("insert into tbl_product (name, price, quantity) values ('Nothing phone 1', 39000, 20)");
					System.out.println("Record inserted");
				}
				catch(SQLException e) {
					System.out.println("Something went wrong with MySQL");
					e.printStackTrace();		
					}
				finally {
					try { conn.close(); } catch(Exception e) {}
				}
	}
}
