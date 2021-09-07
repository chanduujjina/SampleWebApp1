package com.demo.web.practice;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void	init() {
		System.out.println("inside init method");
	}
	
	public void	service(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("inside service method");
	}
	
	

}
