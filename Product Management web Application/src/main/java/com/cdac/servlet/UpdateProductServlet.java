package com.cdac.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.jdbc.ProductLoader;
import com.cdac.jdbc.Products;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String product_name=request.getParameter("product_name");
		int product_id=Integer.parseInt(request.getParameter("product_id"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int price=Integer.parseInt(request.getParameter("price"));
		String purchase_date_str=request.getParameter("purchase_date");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Date purchase_date = null;
		try {
			purchase_date = dateFormat.parse(purchase_date_str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Products product=new Products( product_id,product_name, quantity, price, purchase_date);
		
		ProductLoader loader=new ProductLoader();
		try {
			loader.updateProduct(product);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("form.jsp");
	}

}
