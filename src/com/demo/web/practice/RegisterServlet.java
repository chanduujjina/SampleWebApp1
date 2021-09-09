package com.demo.web.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void	init() {
		System.out.println("inside AdvancedServlet init method");
	}
	
	@Override
	public void	doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name = req.getParameter("firstName");
		String surName = req.getParameter("lastName");
		String phone = req.getParameter("phone");
		
		
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.write("<html>");
		printWriter.write("<body>");
		printWriter.write("welcome "+name+" "+surName +"account created successfully");
		printWriter.write("</body>");
		printWriter.write("</html>");
	}

}
