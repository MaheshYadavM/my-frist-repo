package com.exp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServelet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int k=0;
		try{
		 k =  (int) req.getAttribute("k");
		}catch(Exception e){
			e.printStackTrace();
		}
	
		// int k=Integer.parseInt(req.getParameter("k")); redirect
		
		PrintWriter out = res.getWriter();
		out.println("Result  is :  " + k);
//		String p=String.valueOf(k);
//		if (p.equalsIgnoreCase(p)) {
//			out.println("Result  is :  " + p);
//			
//		} else {
//			
//			out.println("enter valid opton");
//			 RequestDispatcher rd1=req.getRequestDispatcher("/index.html");
//   	     rd1.forward(req, res);
//		}

		res.setContentType("index.html");
		out = res.getWriter();
		String n = req.getParameter("num1");
		out.println("welcome " + n);
		out.close();

	}
}
