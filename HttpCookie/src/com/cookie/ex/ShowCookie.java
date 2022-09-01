package com.cookie.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowCookie
 */
@WebServlet("/ShowCookie")
public class ShowCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		PrintWriter out=res.getWriter();
		String title="Active Cookies";
		out.println("<html><head><title>"+title+"</title></head></html>");
		out.println("<table border=\"1\" align=\"center\">");
		out.println("<tr><th>Cookie Name</th><th>Cookie Value</th></tr>");
		Cookie ck[]=req.getCookies();
		if(ck!=null){
			for(int i=0;i<ck.length;i++){
				out.println("<tr><td>"+ck[i].getName()+"</td><td>"+ck[i].getValue()+"</td></tr>");
			}
			
		}
		else{
			pw.print("Not Set Cookie ");
		}
		out.println("</table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
