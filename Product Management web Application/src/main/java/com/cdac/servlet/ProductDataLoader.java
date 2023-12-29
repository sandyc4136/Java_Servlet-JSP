package com.cdac.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.cdac.jdbc.ProductLoader;
import com.cdac.jdbc.Products;

/**
 * Servlet implementation class ProductDataLoader
 */
@WebServlet("/ProductDataLoader")
public class ProductDataLoader extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProductLoader loader=new ProductLoader();
		List<Products> P=loader.selectAllProducts();
		HttpSession session = request.getSession();
		session.setAttribute("currentP", P);
		response.sendRedirect("form.jsp");
	}
}
