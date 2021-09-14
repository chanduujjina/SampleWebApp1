package com.demo.web.practice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.web.practice.dto.UserDetails;

public class UserDetailDao {
	
	

	public void persistUser(UserDetails userDetails) throws ClassNotFoundException, SQLException {
		
		String inserQuery = "insert into user (userName,gender,phone,email) values(?,?,?,?)";
		Connection connection = DBUtility.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(inserQuery);
		preparedStatement.setString(1, userDetails.getUserName());
		preparedStatement.setString(2, userDetails.getGender());
		preparedStatement.setString(3, userDetails.getPhoneNumber());
		preparedStatement.setString(4, userDetails.getEmailId());
		
		preparedStatement.execute();
		
	}

}
