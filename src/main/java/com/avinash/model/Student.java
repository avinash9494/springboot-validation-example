package com.avinash.model;

import javax.validation.constraints.Pattern;

public class Student {

	@Pattern(regexp = "([A-Za-z]*)", message = "Invalid characters present in first name, please check and enter again!")
	private String firstName;
	
	@Pattern(regexp = "([A-Za-z]*)", message = "Invalid characters present in last name, please check and enter again!")
	private String lastName;
	
	@Pattern(regexp = "([0-9]*)", message = "Invalid characters present in student id, please check and enter again!")
	private String studentId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
}
