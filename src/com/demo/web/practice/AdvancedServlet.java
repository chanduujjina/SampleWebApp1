package com.demo.web.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/advanced")
public class AdvancedServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Logger log = LogManager.getLogger(AdvancedServlet.class.getName());
	
	public void	init() {
		log.info("inside AdvancedServlet init method");
	}
	
	public void	service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		log.info("inside AdvancedServlet service method");
		
		String name = req.getParameter("name");
		String surName = req.getParameter("surName");
		
		log.info("welcome "+name+" "+surName);
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.write("<html>");
		printWriter.write("<body>");
		printWriter.write("welcome "+name+" "+surName);
		printWriter.write("</body>");
		printWriter.write("</html>");
		
        
	}

}
