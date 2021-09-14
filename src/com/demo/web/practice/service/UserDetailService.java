package com.demo.web.practice.service;

import java.sql.SQLException;

import com.demo.web.practice.dao.UserDetailDao;
import com.demo.web.practice.dto.UserDetails;

public class UserDetailService {
	
	private UserDetailDao dao = new UserDetailDao();
	public void createUser(UserDetails userDetails) throws ClassNotFoundException, SQLException {
		 dao.persistUser(userDetails);
	}

}
