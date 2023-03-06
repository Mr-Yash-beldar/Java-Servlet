package com.form;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.*;
public class SuccessServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException , ServletException
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("This is Success Servlet");
		out.println("<h2>Successfully Registered......");
	}

}
