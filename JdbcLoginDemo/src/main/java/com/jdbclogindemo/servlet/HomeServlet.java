package com.jdbclogindemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			
			String uname = (String) session.getAttribute("USERNAME");
			String session_id = session.getId();
			String sid = "";
			
			Cookie[] arr = request.getCookies();
			for(Cookie c : arr) {
				if(c.getName().equals("JSESSIONID"))
					sid = c.getValue();
			}
			
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("<head>");
			pw.println("<title>Home Page</title>");
			pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
			pw.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
			pw.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>");
			pw.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<div class=\"container\">");
			pw.println("<h1 style=\"color:green;text-align:center\">Welcome "
					+ uname + " to your home page </h1>");
			
			pw.println("<h2 style=\"color:slateblue;text-align:center\">"
					+ "Your session id : " + session_id + "</h2>");
			
			pw.println("<h2 style=\"color:tomato;text-align:center\">"
					+ "Your session id : " + sid + "</h2>");
			
			pw.println("<p>Click <a href=\"logout\">here</a> "
					+ "to log out</p>");
			pw.println("</div>");
			pw.println("</body>");
			pw.println("</html>");
		}
		else {
			response.sendRedirect("error?msg=notloggedin");
		}
	}
}










