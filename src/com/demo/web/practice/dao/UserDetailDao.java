package com.demo.web.practice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demo.web.practice.dto.UserDetails;
import com.demo.web.practice.exception.UserDetailExeption;


public class UserDetailDao {
	
	static Logger log = LogManager.getLogger(UserDetailDao.class.getName());

	public void persistUser(UserDetails userDetails) throws UserDetailExeption {
		log.info("inside persistUser method");
		
		log.debug(userDetails);
		String inserQuery = "insert into user (userName,gender,phone,email,password) values(?,?,?,?,?)";
		try {
			Connection connection = DBUtility.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(inserQuery);
			preparedStatement.setString(1, userDetails.getUserName());
			preparedStatement.setString(2, userDetails.getGender());
			preparedStatement.setString(3, userDetails.getPhoneNumber());
			preparedStatement.setString(4, userDetails.getEmailId());
			preparedStatement.setString(5, userDetails.getPassword());
			
			preparedStatement.execute();
		} catch (SQLException sqlex) {
			log.error(sqlex);
			if(sqlex instanceof SQLIntegrityConstraintViolationException) {
				throw new UserDetailExeption("User already created for given data",sqlex);
			}
		
			throw new UserDetailExeption("error in creating user",sqlex);
		} catch (ClassNotFoundException ex) {
			log.error(ex.getMessage());
			throw new UserDetailExeption("error in creating user",ex);
		}
		
	}
	public UserDetails getUserByUserName(String userName,String password) throws ClassNotFoundException, SQLException {
		Connection connection = DBUtility.getConnection();
		String fetchQuery = "select * from user where userName =? and password =?";
		PreparedStatement preparedStatement = connection.prepareStatement(fetchQuery);
		preparedStatement.setString(1, userName);
		preparedStatement.setString(2, password);
		preparedStatement.execute();
		ResultSet resultSet = preparedStatement.getResultSet();
		UserDetails detail = null;
		while(resultSet.next()) {
			detail = new UserDetails(null, null,resultSet.getString("gender"),resultSet.getString("phone"),
					resultSet.getString("userName"),resultSet.getString("email"), resultSet.getString("password"));
		}
		return detail;
	}

}
