package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		HttpSession session = req.getSession();

		session.invalidate();  

		out.print("<h4>You are successfully logged out!</h4>");  

		req.getRequestDispatcher("index.html").forward(req, resp);

		out.close(); 
}
}
