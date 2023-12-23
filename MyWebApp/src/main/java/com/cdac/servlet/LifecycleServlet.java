package com.cdac.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

/**
 * Servlet implementation class LifecycleServlet
 */
@WebServlet(urlPatterns = "/LifecycleServlet" , loadOnStartup = 1)
public class LifecycleServlet extends HttpServlet {
	
//	public void init() {
//		System.out.println("init called.....");
//	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("service called......");
	}
//	
//	public void destroy() {
//		System.out.println("destroy called.....");
//	}
//	

}
