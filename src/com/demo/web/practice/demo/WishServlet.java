package com.demo.web.practice.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/wish")
public class WishServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  
		  //validate the request
		 HttpSession session=req.getSession(false);  
		 resp.setContentType("text/html");  
	     PrintWriter out=resp.getWriter(); 
	     req.getRequestDispatcher("link.html").include(req, resp);
		if(session!=null) {
			req.getRequestDispatcher("welcome.html").include(req, resp);
		}
		
		else {
			 out.print("Please login first");  
			req.getRequestDispatcher("login1.html").include(req, resp);
		}
		 
		  
		
	  }

}
