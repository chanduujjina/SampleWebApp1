package com.demo.web.practice.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		 resp.setContentType("text/html");  
		String name = req.getParameter("name");
		
		PrintWriter writer = resp.getWriter();
		writer.print("<a href='servlet4?name="+name+"'>click</a>");  
		
		writer.close();
		//http://localhost:7777/SampleWebApp1/servlet1?name=chandu
	}

}
