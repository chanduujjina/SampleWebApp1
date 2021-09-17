package com.demo.web.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demo.web.practice.dao.UserDetailDao;
import com.demo.web.practice.dto.UserDetails;
import com.demo.web.practice.exception.UserDetailExeption;
import com.demo.web.practice.exception.UserValidationException;
import com.demo.web.practice.service.UserDetailService;
import com.demo.web.practice.validation.UserDetailValidation;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	
	static Logger log = LogManager.getLogger(RegisterServlet.class.getName());

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void	init() {
		System.out.println("inside AdvancedServlet init method");
	}
	
	@Override
	public void	doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String emailId = req.getParameter("emailId");
		String userName = firstName+"_"+lastName;
		
		UserDetails userDetails = new UserDetails(firstName,lastName,gender,phone,userName,emailId);
		UserDetailValidation userDetailValidation = new UserDetailValidation();
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html>");
		printWriter.write("<body>");
		UserDetailService service = new UserDetailService();
		
		try {
			userDetailValidation.validateUserDetail(userDetails);
			service.createUser(userDetails);
			log.debug(userName+" account created successfully");
			printWriter.write("welcome "+userName+" account created successfully");
		}
		catch (UserValidationException e1) {
			printWriter.write(e1.getMessage());
		}
		catch (UserDetailExeption e) {
			
			printWriter.write(e.getMessage());
		}
		printWriter.write("</body>");
		printWriter.write("</html>");
	}

}
