package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello.cdac") // Url pattern or servlet mapping
public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Welcome to Servlets</h1>");
		LocalDate date=LocalDate.now();
		out.write("<h2>Today's date is " + date + "</h2>");
		out.write("</body></html>");
	}

}
