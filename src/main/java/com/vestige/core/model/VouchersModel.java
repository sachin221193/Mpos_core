package com.vestige.core.model;

import java.time.Instant;

/**
 * 
 * @author soahn.maurya
 *
 * this model use for distributors Vouchers
 */

public class VouchersModel {
	
	private String voucherNo;
	private String voucherStatus;
	private String invoiceNo;
	private Instant invoiceDate;
	private Instant validTill;
	
	
	public String getVoucherNo() {
		return voucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}
	public String getVoucherStatus() {
		return voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Instant getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Instant invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Instant getValidTill() {
		return validTill;
	}
	public void setValidTill(Instant validTill) {
		this.validTill = validTill;
	}
}
