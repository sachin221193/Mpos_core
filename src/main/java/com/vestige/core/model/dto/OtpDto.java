package com.vestige.core.model.dto;

import java.io.Serializable;
import java.time.Instant;

public class OtpDto implements Serializable {

	public OtpDto(String otp, String email) {
		this.otp = otp;
		this.email = email;
	}
	
	public OtpDto(String otp, String email, String createdOn) {
		this.otp = otp;
		this.email = email;
		this.createdOn = createdOn;
	}

	public OtpDto() {}
	/**
	 * 
	 */
	private static final long serialVersionUID = -7152172626899796730L;

	private String otp;

	private String email;
	
	private String createdOn;

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

}
