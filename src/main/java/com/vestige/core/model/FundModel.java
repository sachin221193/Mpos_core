package com.vestige.core.model;

/**
 * 
 * @author Tarsem.Kumar
 * @description Distributor car funds model
 *
 */
public class FundModel {

	private String businessMonth;
	private String opening;
	private String paid;
	private String balance;
	private String newFund;
	private String remarks;

	public String getBusinessMonth() {
		return businessMonth;
	}

	public void setBusinessMonth(String businessMonth) {
		this.businessMonth = businessMonth;
	}

	public String getOpening() {
		return opening;
	}

	public void setOpening(String opening) {
		this.opening = opening;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getNewFund() {
		return newFund;
	}

	public void setNewFund(String newFund) {
		this.newFund = newFund;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "FundModel [businessMonth=" + businessMonth + ", opening=" + opening + ", paid=" + paid
				+ ", balance=" + balance + ", newFund=" + newFund + ", remarks=" + remarks + "]";
	}

}
