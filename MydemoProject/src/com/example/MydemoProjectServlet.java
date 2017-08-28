package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MydemoProjectServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();

		HttpSession session = req.getSession();

		String name = (String) session.getAttribute("username");
		
		out.print("Welcome " + name );

		/*try {
			req.getRequestDispatcher("/Logout.html").include(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */

	}
}
