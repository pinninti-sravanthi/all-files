package com.example.SignUpForm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
//import javax.jdo.annotations.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
//import com.google.appengine.api.datastore.Query;

public class SignUpFormServlet21 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		/*
		 * PrintWriter out = resp.getWriter(); HttpSession session =
		 * req.getSession(false); String n=(String)session.getAttribute("name");
		 * out.print("hello "+n);
		 * 
		 * 
		 * if (session != null) { session.invalidate();
		 */
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String userName = req.getParameter("userName");
		out.print("Hello " + userName);


		String email =(req.getParameter("email"));
		String userPass = req.getParameter("userPass");
		String phonenumber = req.getParameter("phonenumber");
		
		System.out.println(email);
		SignUpFormjdo signupformobjectjdo = new SignUpFormjdo(userName,email,userPass,phonenumber);
		PersistenceManager pm = PMF.get().getPersistenceManager();
	

		
		try {
			    	pm.makePersistent(signupformobjectjdo);
			   
		}finally {
			pm.close();
		}
	}

}