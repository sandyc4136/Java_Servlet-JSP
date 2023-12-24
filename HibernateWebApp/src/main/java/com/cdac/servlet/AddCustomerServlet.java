package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.CustomerDao;
import com.cdac.entity.Customer;

/**
 * Servlet implementation class AddCustomerServlet
 */
public class AddCustomerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer customer = new Customer();
		customer.setName(request.getParameter("name"));
		customer.setEmail(request.getParameter("email"));
		customer.setCity(request.getParameter("city"));
		String date_str=request.getParameter("dateOfBirth");
		LocalDate date=LocalDate.parse(date_str);
		customer.setDateOfBirth(date);
		//customer.setDateOfBirth(null); TODO: set the dob
		
		CustomerDao dao = new CustomerDao();
		dao.add(customer);
		
		PrintWriter out = response.getWriter();
		out.write("<h1>Customer added!</h1>");
	}

}
 