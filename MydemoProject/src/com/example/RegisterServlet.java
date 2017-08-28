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


@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello!!");
		
		String reguname=req.getParameter("uname"); 
		String regname=req.getParameter("name"); 
		String regpassword=req.getParameter("password");
		   
		
		
		Entity u = new Entity("User", reguname);

		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

		Query q = new Query("User").setFilter(new FilterPredicate("username", FilterOperator.EQUAL, regname));

		PreparedQuery pq = datastore.prepare(q);

		Entity result = pq.asSingleEntity();

		PrintWriter out;
		if (result == null) {

			u.setProperty("username", reguname);

			u.setProperty("password", regpassword);

			u.setProperty("Name", regname);



			datastore.put(u);



			u.getKey().getName();

			com.google.appengine.api.datastore.Key k = KeyFactory.createKey("User", reguname);



			HttpSession s = req.getSession();

			s.setAttribute("username", reguname);



			System.out.println("<h3><center>Successfully registered</center></h3>");

			try {
				req.getRequestDispatcher("/mydemoproject").include(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("<h3><center>Username already exists \n </center><h3>");

			System.out.println("<h3><center> Register with some other name or Login with your password</center><h3>\n\n");

			try {
				req.getRequestDispatcher("/Login.html").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
		
	}
}