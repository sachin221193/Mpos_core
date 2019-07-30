package com.vestige.core.model.dto;

import java.io.Serializable;

public class DeclinedProductRatingDto implements Serializable{

	public DeclinedProductRatingDto() {
	}

	public DeclinedProductRatingDto(String subject,String message,String to) {
		this.subject = subject;
		this.message = message;
		this.to = to;
	}

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -354747804929602946L;

	private String subject;
	
	private String message;
	
	private String to;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
}
