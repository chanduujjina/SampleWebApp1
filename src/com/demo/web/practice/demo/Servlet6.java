package com.demo.web.practice.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet6")
public class Servlet6 extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  @Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		  
		  HttpSession session = req.getSession();
		String userName =  (String) session.getAttribute("userName");
		String password =  (String) session.getAttribute("password");
		
		 PrintWriter  writer =resp.getWriter();
		
		 writer.write("<html>");
		 writer.write("<body>");
		 writer.write("<h1>"+userName+"</h1>");
		 writer.write("<h1>"+password+"</h1>");
		 writer.write("</body>");
		 writer.write("</html>");
		
	  }

}
