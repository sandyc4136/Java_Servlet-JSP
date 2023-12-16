package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.cj.jdbc.Driver;

public class DBInfo {
	public static void main(String args[]) {
		Connection conn = null;
		
		try {
			//  // Load the Driver //  //
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // forName() is a function of reflection API
			
			 //// OR ////
			
//			Driver d=new Driver();
			
			
			// Establish connection with the database  
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136");
			System.out.println("Yayyyy, I got connected");
		}catch(ClassNotFoundException e) {
		System.out.println("Please check the no. of glasses o-o");
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
