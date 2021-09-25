package com.demo.web.practice.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet5")
public class Servlet5 extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  @Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		  System.out.println(req.getParameter("name"));
		  System.out.println(req.getParameter("password"));
	
		String name =  req.getParameter("name");
		String password = req.getParameter("password");
		
		//get the session from HttpServletRequest
		
		HttpSession session = req.getSession();
		session.setAttribute("userName", name);
		
		session.setAttribute("password", password);
		
		//get request dispather from HttpServletRequest
		
		RequestDispatcher rd =req.getRequestDispatcher("servlet6");
		rd.forward(req, resp);
	  }

}
