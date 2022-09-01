package request.dispatcher.servlet.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * Servlet implementation class EmployeeLogin
 */
@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String email = req.getParameter("useremail");
		String password = req.getParameter("userpassword");
		RequestDispatcher requestDispatcher ;
	
	
		 	
		
		if(password.equals("admin@123") &&email.equals("admin@fourServe.com")){
			
			 requestDispatcher=req.getRequestDispatcher("welcomePage");
			requestDispatcher.forward(req, res);
		}
		else{
			out.println(" Sorry invalid username and password ");
			 requestDispatcher=req.getRequestDispatcher("/index.html");
			 requestDispatcher.include(req, res);
		}
		
	}

}
