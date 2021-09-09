package com.demo.web.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/advanced")
public class AdvancedServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void	init() {
		System.out.println("inside AdvancedServlet init method");
	}
	
	public void	service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("inside AdvancedServlet service method");
		
		String name = req.getParameter("name");
		String surName = req.getParameter("surName");
		
		System.out.println("welcome "+name+" "+surName);
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.write("<html>");
		printWriter.write("<body>");
		printWriter.write("welcome "+name+" "+surName);
		printWriter.write("</body>");
		printWriter.write("</html>");
		
        
	}

}
