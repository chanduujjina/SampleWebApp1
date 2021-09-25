package com.demo.web.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demo.web.practice.dto.UserDetails;
import com.demo.web.practice.service.UserDetailService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Logger log = LogManager.getLogger(LoginController.class.getName());
	UserDetailService service  = null;

	public void init() {
		service = new UserDetailService();
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	
		//get the data from req
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		
		PrintWriter printWriter = resp.getWriter();
		try {
		
			printWriter.write("<html>");
			printWriter.write("<body>");
			UserDetails userDetails= service.getUserByUserName(userName,password);
			if(userDetails!=null) {
				log.info("login success");
				printWriter.write("login is sucess");
			}
			else {
				printWriter.write("Invalid credentails try again");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printWriter.write("</body>");
		printWriter.write("</html>");
		
	}

}
