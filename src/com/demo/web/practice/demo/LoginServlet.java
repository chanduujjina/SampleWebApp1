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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demo.web.practice.dto.UserDetails;
import com.demo.web.practice.service.UserDetailService;

@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Logger log = LogManager.getLogger(LoginServlet.class.getName());
	

	public void init() {
		
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	
		//get the data from req
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		req.getRequestDispatcher("link.html").include(req, resp);
		
		if(userName.equalsIgnoreCase("chandu") && password.equals("chandu")) {
			req.getRequestDispatcher("welcome.html").include(req, resp);
			
		}
		else {
			req.getRequestDispatcher("error.html").include(req, resp);
		}
		
		
	}

}
