package com.vestige.core.model.dto;

public class ResetPasswordVM {
	private String userId;
	private Integer otp;
	private String newPassword;

	public ResetPasswordVM(String userId, Integer otp, String newPassword) {
		this.userId = userId;
		this.otp = otp;
		this.newPassword = newPassword;
	}

	public ResetPasswordVM() {

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
