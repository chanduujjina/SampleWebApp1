package com.demo.web.practice;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.demo.web.practice.exception.UserValidationException;
@WebFilter("/login")
public class MyFilter implements Filter{
	
	public void init(FilterConfig config) throws ServletException {
		
		
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		try {
			validateCredentails(userName,password);
			//happy path
			chain.doFilter(req, resp);//it will navigate our request and response to next resource
		} catch (UserValidationException e) {
				// error flow
			RequestDispatcher dispather = req.getRequestDispatcher("error.html");
			dispather.forward(req, resp);
		}
		
	}
	
	



	private void validateCredentails(String userName, String password) throws UserValidationException {
		
		if(userName.isEmpty()) {
			throw new UserValidationException("userName should not be empty");
		}
		else {
			if(!userName.matches("^[a-zA-Z0-9]*$")){
				throw new UserValidationException("userName should be alpha numeric");
			}
		}
		if(password.isEmpty()) {
			throw new UserValidationException("password should not be empty");
		}
	}

	@Override
	public void destroy() {
		
		
	}

	
	
	
}
