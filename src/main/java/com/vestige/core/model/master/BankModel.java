package com.vestige.core.model.master;

/**
 * 
 * @author ashutosh.sharma
 *
 */
public class BankModel {

	private String id;

	private Integer bankId;

	private String bankName;

	public BankModel() {
	}
	
	public BankModel(String id, Integer bankId, String bankName) {
		this.id=id;
		this.bankId=bankId;
		this.bankName=bankName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", bankId=" + bankId + ", bankName=" + bankName + "]";
	}

}
