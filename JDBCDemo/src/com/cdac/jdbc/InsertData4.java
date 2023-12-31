 package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData4 {
	public static void main(String args[]){
		Connection conn = null;
				
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136");
					String sql="insert into tbl_product (name, price, quantity) values (?, ?, ?)";
					PreparedStatement stmt=conn.prepareStatement(sql);
				
					// substituting ? with actual data
					
					stmt.setString(1, "Motoral E30");
					stmt.setDouble(2, 29000);
					stmt.setInt(3, 77);
					stmt.executeUpdate();
					System.out.println("record inserted....");
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
