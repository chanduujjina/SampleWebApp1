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

@WebServlet("/servlet7")
public class Servlet7 extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  @Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		  
		 //get request dispather from HttpServletRequest
		 RequestDispatcher rd = req.getRequestDispatcher("test2.html");
		 //navigate to html by using RequestDispatcher forward
		rd.forward(req, resp);
		
	  }

}
