package com.demo.web.practice.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  @Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  
		  String userName = req.getParameter("name");
		  String password = req.getParameter("password");
		  
		  //get request dispatcher from HttpServletRequest
		  
		  RequestDispatcher rd =req.getRequestDispatcher("servlet2");
		  rd.forward(req, resp);
	  }

}
	