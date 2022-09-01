package com.session.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServ
 */
@WebServlet("/SecondServ")
public class SecondServ extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String exp1 = req.getParameter("frist_exp");
		String skills1 = req.getParameter("frist_skills");
		HttpSession hs = req.getSession();

		hs.setAttribute("exphs", exp1);
		hs.setAttribute("skillshs", skills1);
		out.println("<html><title>Second Servlet</title><body bgcolor=\"orange\"><center>");
		out.println("<form name=\"second\" action=\"./test3\" method=\"post\"><table bgcolor=\"lightblue\">");
		out.println("<tr><th>Enter Expected salary : </th><td><input type=\"text\" name=\"second_sal\"value=\"\">");
		out.println(
				"</td></tr><tr><th>Enter prefered location : </th><td><input type=\"text\" name=\"second_loc\"value=\"\">");
		out.println(
				"</td></tr><table><tr><td align=\"center\"><input type=\"submit\" name=\"second_submit\"value=\"Submit\">");
		out.println("</td></tr></table></table></from></center></body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
