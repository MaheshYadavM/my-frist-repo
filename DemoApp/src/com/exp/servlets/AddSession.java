package com.exp.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddSession extends HttpServlet{
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
	   int i=Integer.parseInt(req.getParameter("num3"));
 	  int j=Integer.parseInt(req.getParameter("num4"));
 	  int k=i+j;
 	     k=k*k;
 	     HttpSession session=req.getSession();
 	     session.setAttribute("k", k);
 	     res.sendRedirect("mm");
   }
}
