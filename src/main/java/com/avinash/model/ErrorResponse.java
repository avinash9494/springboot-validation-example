package com.avinash.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "error")
public class ErrorResponse {

	private String errorMessage;
	
	private List<String> errorDetails;
	
	public ErrorResponse(String errorMessage, List<String> errorDetails) {
		super();
		this.errorMessage = errorMessage;
		this.errorDetails = errorDetails;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(List<String> errorDetails) {
		this.errorDetails = errorDetails;
	}
	
	
}
