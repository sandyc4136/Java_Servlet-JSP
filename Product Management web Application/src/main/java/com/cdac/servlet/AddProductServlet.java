package com.cdac.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.jdbc.ProductLoader;
import com.cdac.jdbc.Products;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int product_id=Integer.parseInt(request.getParameter("product_id"));
		String product_name=request.getParameter("product_name");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int price=Integer.parseInt(request.getParameter("price"));
		String purchase_date_str=request.getParameter("purchase_date");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Date purchase_date = null;
		try {
			purchase_date = dateFormat.parse(purchase_date_str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Products product=new Products();
		
		product.setProduct_id(product_id);
		product.setProduct_name(product_name);
		product.setQuantity(quantity);
		product.setPrice(price);
		product.setPurchase_date(purchase_date);
		
		ProductLoader loader=new ProductLoader();
		
		try {
			loader.loadProducts(product);
			
		} catch (ClassNotFoundException e) {
			  
			e.printStackTrace();
		}
		response.sendRedirect("ProductDataLoader");
	}

	
}
