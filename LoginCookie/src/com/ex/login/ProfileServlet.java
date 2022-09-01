package com.ex.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		req.getRequestDispatcher("link.html").include(req, res);
		Cookie ck[] = req.getCookies();
		if (ck != null) {
			String name = ck[0].getValue();
			if (!name.equals("") || name != null) {
				out.println("<b>Welcome to Profile</b>");
				out.println("<br>Welcome , " + name);
			}

		} else {
			out.println("Please login frist");
			req.getRequestDispatcher("login.html").include(req, res);
		}
		out.close();
	}
}
