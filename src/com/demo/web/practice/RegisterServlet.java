package com.demo.web.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.web.practice.dao.UserDetailExeption;
import com.demo.web.practice.dto.UserDetails;
import com.demo.web.practice.service.UserDetailService;

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
		UserDetailService service = new UserDetailService();
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String emailId = req.getParameter("emailId");
		String userName = firstName+"_"+lastName;
		
		UserDetails userDetails = new UserDetails(firstName,lastName,gender,phone,userName,emailId);
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html>");
		printWriter.write("<body>");
		try {
			service.createUser(userDetails);
			printWriter.write("welcome "+userName+" account created successfully");
		} catch (UserDetailExeption e) {
			printWriter.write("Error in creating user acount");
		}
		printWriter.write("</body>");
		printWriter.write("</html>");
	}

}
