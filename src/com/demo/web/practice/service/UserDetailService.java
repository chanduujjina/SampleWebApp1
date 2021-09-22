package com.demo.web.practice.service;

import java.sql.SQLException;

import com.demo.web.practice.dao.UserDetailDao;
import com.demo.web.practice.dto.UserDetails;
import com.demo.web.practice.exception.UserDetailExeption;

public class UserDetailService {
	
	private UserDetailDao dao = new UserDetailDao();
	public void createUser(UserDetails userDetails) throws UserDetailExeption  {
		 dao.persistUser(userDetails);
	}
	
	public UserDetails getUserByUserName(String userName,String password) throws ClassNotFoundException, SQLException {
	return dao.getUserByUserName(userName,password);	
	}
	

}
