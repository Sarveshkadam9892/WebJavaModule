package com.jdbclogindemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/logout")
public class LogoutControllerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		if(session != null) {
			session.setAttribute("USERNAME", null);
			session.invalidate();
			response.sendRedirect("success?msg=logoutsuccess");
		}
		else {
			response.sendRedirect("error?msg=notloggedin");
		}
	}
}










