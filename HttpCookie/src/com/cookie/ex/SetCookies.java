package com.cookie.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookies
 */
@WebServlet("/SetCookies")
public class SetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SetCookies() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Cookie c1 = new Cookie("Telangana", "Hyderabsd");
		Cookie c2 = new Cookie("AndraPradesh", "Anthapuram");
		
		res.addCookie(c1);
		res.addCookie(c2);
		
		Cookie c3 = new Cookie("TamailaNadu", "Chennai");
		Cookie c4 = new Cookie("Karnataka", "Bengaluru");

		c3.setMaxAge(1800);
		req.removeAttribute(c3.getName());
		req.removeAttribute(c3.getValue());
		
		c4.setMaxAge(100);

		res.addCookie(c3);
		res.addCookie(c4);
    
		out.println("Set Cookie");
		
		RequestDispatcher rd = req.getRequestDispatcher("test2");
		rd.forward(req, res);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}

}
