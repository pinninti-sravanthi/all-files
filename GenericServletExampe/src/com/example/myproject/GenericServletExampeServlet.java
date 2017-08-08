package com.example.myproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


@SuppressWarnings("serial")
public class GenericServletExampeServlet extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		   PrintWriter pwriter=res.getWriter();
		   pwriter.print("<html>");
		   pwriter.print("<body>");
		   pwriter.print("<h2>Generic Servlet Example</h2>");
		   pwriter.print("<p>Hello BeginnersBook Readers!</p>");
		   pwriter.print("</body>");
		   pwriter.print("</html>");
	}
}
