package com.vestige.core.vm;

public class MailVM {

	private String emailId;

	private String firstName;
	
	private String lastName;
	
	private String mobileNo;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

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

	@Override
	public String toString() {
		return "MailVM [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName +  ", mobileNo=" + mobileNo + "]";
	}
	
}
