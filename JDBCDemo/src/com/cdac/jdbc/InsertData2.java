package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData2 {
	public static void main(String args[]){
		Connection conn = null;
				
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136");
					Statement stmt=conn.createStatement();
				// collecting data from user
					
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter product name");
					String name=sc.nextLine();
					System.out.println("Enter price of the product");
					double price= Double.parseDouble(sc.nextLine());
					System.out.println("Enter quantity of the product");
					int quantity=Integer.parseInt(sc.nextLine());
					String sql="insert into tbl_product (name, price, quantity) values ('" + name + "'," + price + "," + quantity + ")";
					stmt.executeUpdate(sql);   // this function will execute all the DML operations (Insert, update , delete )
 
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
