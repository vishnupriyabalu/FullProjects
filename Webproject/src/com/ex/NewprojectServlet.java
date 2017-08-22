package com.ex;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class NewprojectServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		String uname=req.getParameter("uname");
		String password=req.getParameter("password");
		if((uname.equals("vishnu"))&&(password.equals("priya")))
		{
			resp.getWriter().println("Welcome"+uname);
		}
		
	}
}
