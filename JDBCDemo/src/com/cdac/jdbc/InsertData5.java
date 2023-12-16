package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData5 {
	public static void main(String args[]) {
		
			Connection conn = null;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136");
					String sql="insert into tbl_product (name, price, quantity) values (?, ?, ?)";
					PreparedStatement stmt=conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
					
					Scanner sc=new Scanner(System.in);
					String ans=""; 
					do {
						System.out.println("Enter product name");
						String name=sc.nextLine();
						System.out.println("Enter price of the product");
						double price= Double.parseDouble(sc.nextLine());
						System.out.println("Enter quantity of the product");
						int quantity=Integer.parseInt(sc.nextLine());
						
						// substituting ? with actual data
						
						stmt.setString(1, name);
						stmt.setDouble(2, price);
						stmt.setInt(3, quantity);
						stmt.executeUpdate();
						
						int id=0;
						ResultSet res=stmt.getGeneratedKeys();
						
						if(res.next()) {
							id=res.getInt(1);
						}
						System.out.println("Record inserted...., product id is " + id);
						System.out.println("Do you wish to continue (y/n)");
						ans=sc.nextLine();
						} while(ans.equals("y"));
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
