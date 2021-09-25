package com.demo.web.practice.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demo.web.practice.dto.UserDetails;
import com.demo.web.practice.service.UserDetailService;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Logger log = LogManager.getLogger(LogoutServlet.class.getName());
	

	public void init() {
		
		
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	
		//get http session from request object
		   resp.setContentType("text/html");  
		   PrintWriter  writer =resp.getWriter();
		req.getRequestDispatcher("link.html").include(req, resp);
		
		HttpSession session = req.getSession();
		session.invalidate();
		
		
			
		 writer.print("You are successfully logged out!");  
         
		 writer.close();  
		
		
		
		
	}

}
