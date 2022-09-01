package com.exp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String opt = req.getParameter("opt");
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		int i = Integer.parseInt(num1);
		int j = Integer.parseInt(num2);
		String m = "enter valid";
		int k=0;
		/*
		 * PrintWriter out=res.getWriter(); out.println(" result is "+k);
		 */

		// session Management
		// res.sendRedirect("sq?k="+k); redirect
		// req.setAttribute("k", k);

		// ReqestDispatcher and redirect
		PrintWriter out = res.getWriter();

		if (opt.equalsIgnoreCase("add")) {
			 k = i + j;
			req.setAttribute("k", k);
		} else if (opt.equalsIgnoreCase("sub")) {
			 k = i - j;
			req.setAttribute("k", k);
		} else if (opt.equalsIgnoreCase("mul")) {
			 k = i * j;
			req.setAttribute("k", k);
		} else if (opt.equalsIgnoreCase("div")) {
			 k = i / j;
			req.setAttribute("k", k);
		}else{
			out.print("invalid operation");
			 RequestDispatcher rd1=req.getRequestDispatcher("/index.html");
  	     rd1.forward(req, res);
		}
		
		

		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.include(req, res);

	}

}
