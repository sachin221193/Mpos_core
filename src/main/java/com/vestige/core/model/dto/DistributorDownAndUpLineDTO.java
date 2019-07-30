package com.vestige.core.model.dto;

public class DistributorDownAndUpLineDTO {

	private String sNo;

	private String upline;

	private String distributorId;

	private String designation;

	private String uplineId;

	private String distributorStatus;

	private String bonusPercent;

	private String prevCumPv;

	private String exclPv;

	private String selfPv;

	private String groupPv;

	private String totalPv;

	private String totalCumPv;

	private String totalCumBv;

	private String selfBv;

	private String totalBv;

	private String groupBv;

	private String exclBv;

	private String prevCumBv;

	private String distributorName;

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getUpline() {
		return upline;
	}

	public void setUpline(String upline) {
		this.upline = upline;
	}

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getUplineId() {
		return uplineId;
	}

	public void setUplineId(String uplineId) {
		this.uplineId = uplineId;
	}

	public String getDistributorStatus() {
		return distributorStatus;
	}

	public void setDistributorStatus(String distributorStatus) {
		this.distributorStatus = distributorStatus;
	}

	public String getBonusPercent() {
		return bonusPercent;
	}

	public void setBonusPercent(String bonusPercent) {
		this.bonusPercent = bonusPercent;
	}

	public String getPrevCumPv() {
		return prevCumPv;
	}

	public void setPrevCumPv(String prevCumPv) {
		this.prevCumPv = prevCumPv;
	}

	public String getExclPv() {
		return exclPv;
	}

	public void setExclPv(String exclPv) {
		this.exclPv = exclPv;
	}

	public String getSelfPv() {
		return selfPv;
	}

	public void setSelfPv(String selfPv) {
		this.selfPv = selfPv;
	}

	public String getGroupPv() {
		return groupPv;
	}

	public void setGroupPv(String groupPv) {
		this.groupPv = groupPv;
	}

	public String getTotalPv() {
		return totalPv;
	}

	public void setTotalPv(String totalPv) {
		this.totalPv = totalPv;
	}

	public String getTotalCumPv() {
		return totalCumPv;
	}

	public void setTotalCumPv(String totalCumPv) {
		this.totalCumPv = totalCumPv;
	}

	public String getTotalCumBv() {
		return totalCumBv;
	}

	public void setTotalCumBv(String totalCumBv) {
		this.totalCumBv = totalCumBv;
	}

	public String getSelfBv() {
		return selfBv;
	}

	public void setSelfBv(String selfBv) {
		this.selfBv = selfBv;
	}

	public String getTotalBv() {
		return totalBv;
	}

	public void setTotalBv(String totalBv) {
		this.totalBv = totalBv;
	}

	public String getGroupBv() {
		return groupBv;
	}

	public void setGroupBv(String groupBv) {
		this.groupBv = groupBv;
	}

	public String getExclBv() {
		return exclBv;
	}

	public void setExclBv(String exclBv) {
		this.exclBv = exclBv;
	}

	public String getPrevCumBv() {
		return prevCumBv;
	}

	public void setPrevCumBv(String prevCumBv) {
		this.prevCumBv = prevCumBv;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	@Override
	public String toString() {
		return "DistributorDownAndUpLineModel [sNo=" + sNo + ", upline=" + upline + ", distributorId=" + distributorId
				+ ", designation=" + designation + ", uplineId=" + uplineId + ", distributorStatus=" + distributorStatus
				+ ", bonusPercent=" + bonusPercent + ", prevCumPv=" + prevCumPv + ", exclPv=" + exclPv + ", selfPv="
				+ selfPv + ", groupPv=" + groupPv + ", totalPv=" + totalPv + ", totalCumPv=" + totalCumPv
				+ ", totalCumBv=" + totalCumBv + ", selfBv=" + selfBv + ", totalBv=" + totalBv + ", groupBv=" + groupBv
				+ ", exclBv=" + exclBv + ", prevCumBv=" + prevCumBv + ", distributorName=" + distributorName + "]";
	}

}
