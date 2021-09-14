package com.demo.web.practice.dto;

public class UserDetails {
	
	public UserDetails(String firstName, String lastName, String gender, String phoneNumber, String userName,
			String emailId) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.emailId = emailId;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", userName=" + userName + ", emailId=" + emailId + "]";
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private String phoneNumber;
	
	private String userName;
	
	private String emailId;
	

}
