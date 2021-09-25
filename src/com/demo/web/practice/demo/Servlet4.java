package com.demo.web.practice.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet4")
public class Servlet4 extends HttpServlet{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		  System.out.println(req.getParameter("name"));
		 PrintWriter  writer =resp.getWriter();
		String name =  req.getParameter("name");
		 writer.write("<html>");
		 writer.write("<body>");
		 writer.write("<h1>"+name+"</h1>");
		 writer.write("</body>");
		 writer.write("</html>");
		
	  }

}
