package com.cdac.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register.cdac")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// reading the data sent by the server
		
		String name=request.getParameter("name");
		String DOB=request.getParameter("dob");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Ayesha@4136");
			String sql="insert into customer(name, DOB, city, email, password) values (?, ?, ?, ?, ?)";
			PreparedStatement stmt=conn.prepareStatement(sql);
			 
			// substituting the values
			
			stmt.setString(1, name);
			stmt.setString(2, DOB);
			stmt.setString(3, city);
			stmt.setString(4, email);
			stmt.setString(5, password);
			
			stmt.executeUpdate(sql);
			
			ResultSet res = stmt.executeQuery();
			
			if(res.next()) {
				response.sendRedirect("welcome.html");
			}
			else
				response.sendRedirect("Register.html");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
	}

}
