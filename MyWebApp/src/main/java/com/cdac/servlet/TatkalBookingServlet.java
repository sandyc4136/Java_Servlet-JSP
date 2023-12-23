package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TatkalBookingServlet
 */
@WebServlet("/TatkalBookingServlet")
public class TatkalBookingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		LocalTime time=LocalTime.now();
		if(time.getHour() >= 10 && time.getHour() < 12) {
			out.write("<h1> you are on time, please proceed with the booking!</h1>");
		}
		else
			out.write("<h1>you are late, please come tomorrow at 10 AM to book the ticket </h1>");
	}

}
