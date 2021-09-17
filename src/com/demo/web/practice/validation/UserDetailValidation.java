package com.demo.web.practice.validation;

import com.demo.web.practice.dto.UserDetails;
import com.demo.web.practice.exception.UserValidationException;

public class UserDetailValidation {
	
	public void validateUserDetail(UserDetails userDetails) throws UserValidationException {
		
		if(!userDetails.getFirstName().matches("^[a-zA-Z]*$")) {
			throw new UserValidationException(" first name is should be alphabetial");
		}
		
		if(!userDetails.getLastName().matches("^[a-zA-Z]*$")) {
			throw new UserValidationException(" last name is should be alphabetial");
		}
		
		if(userDetails.getPhoneNumber() != null) {
			if(userDetails.getPhoneNumber().length() != 10) {
				throw new UserValidationException("phone number must contain 10 digit");
			}
		}
		
		if(userDetails.getEmailId()!=null) {
			if(!userDetails.getEmailId().contains("@")&& !userDetails.getEmailId().contains(".com")) {
				throw new UserValidationException("phone number must contain 10 digit");
			}
		}
		
	}

}
