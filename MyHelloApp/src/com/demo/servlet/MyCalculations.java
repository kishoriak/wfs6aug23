package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyCalculations
 */
@WebServlet("/addition")
public class MyCalculations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int no1=Integer.parseInt(request.getParameter("n1"));
		int no2=Integer.parseInt(request.getParameter("n2"));
		out.println("<h1>Addition :"+(no1+no2) +"</h1>");
	}

}
