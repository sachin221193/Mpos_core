package com.vestige.core.model.dto;

public class LoginVM {
	private String username;
	private String password;
	private String otp;

	public LoginVM(String username, String password, String otp) {
		this.username = username;
		this.password = password;
		this.otp = otp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public LoginVM() {

	}
}
