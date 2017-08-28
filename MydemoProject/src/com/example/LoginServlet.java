package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;

import com.google.appengine.api.datastore.DatastoreServiceFactory;

import com.google.appengine.api.datastore.Entity;

import com.google.appengine.api.datastore.KeyFactory;

import com.google.appengine.api.datastore.PreparedQuery;

import com.google.appengine.api.datastore.Query;

import com.google.appengine.api.datastore.Query.Filter;

import com.google.appengine.api.datastore.Query.FilterOperator;

import com.google.appengine.api.datastore.Query.FilterPredicate;

import com.google.apphosting.datastore.EntityV4.Key;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello!!");
		
		String uname=req.getParameter("uname");
		String password=req.getParameter("password");
		
		
		
		com.google.appengine.api.datastore.DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();



		Query q = new Query("User").setFilter(new FilterPredicate("username", FilterOperator.EQUAL,uname ));

		PreparedQuery pq = datastore.prepare(q);

		com.google.appengine.api.datastore.Entity storedUser = pq.asSingleEntity();

		

		String storedPassword = (String) storedUser.getProperty("password");

		

		String storedUserName = (String) storedUser.getProperty("username");

		HttpSession s = req.getSession();

		s.setAttribute("username", storedUserName);

		

		if (storedPassword.equals(password)) {

			try {
				req.getRequestDispatcher("/mydemoproject").include(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} 
		
		else {

			PrintWriter out = null;
			out.print("<h2><center>Sorry UserName or Password Does not match</center><h2>");

			try {
				req.getRequestDispatcher("/index.html").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			
			
		
		}
		
		
	}
}