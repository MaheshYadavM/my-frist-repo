package com.ex.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		req.getRequestDispatcher("link.html").include(req, res);
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		if (password.equals("admin123")) {
			out.println("You are successfully loged in!");
			out.println("<br>Welcome " + name);

			Cookie ck = new Cookie("name", name);
			res.addCookie(ck);

		} else {
			out.println(" User name and Password error! ");
			req.getRequestDispatcher("login.html").include(req, res);
		}
		out.close();
	}
}
