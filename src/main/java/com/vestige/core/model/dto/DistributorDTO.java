
package com.vestige.core.model.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A DTO for the Distributor entity.
 */
public class DistributorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private Long distributorId;

	@NotNull
	private Long uplineDistributorId;

	private String title;

	@NotNull
	@Size(max = 50)
	private String firstName;

	@Size(max = 50)
	private String lastName;

	@NotNull
	private Instant dob;

	private String coDistributorTitle;

	@Size(max = 50)
	private String coDistributorFirstName;

	@Size(max = 50)
	private String coDistributorLastName;

	private Instant coDistributorDob;

	private String telephoneNumber;

	private String mobileNumber;

	private String faxNumber;

	private String emailId;

	@NotNull
	private Instant registrationDate;

	private Instant activationDate;

	@NotNull
	private Double minFirstPurchaseAmount;

	@NotNull
	@Size(max = 10)
	private String status;

	@NotNull
	private String panNumber;

	private String kitOrderNo;

	private String kitInvoiceNo;

	private String firstOrderTaken;

	private String remarks;

	@Size(max = 100)
	private String userName;

	@Size(max = 100)
	private String serialNo;

	@Size(max = 100)
	private String password;

	private Double allInvoiceAmountSum;

	private String uploadedPanNumber;

	private String uploadedAddressProof;

	private String uploadedCancelledCheque;

	private double lastMonthSelfPv;

	private List<DistributorAddressDTO> distributorsAddress;

	private double lastMonthTotalPv;

	private double lastMonthTotalCumPv;

	private Integer hierarchyLevelId;

	private Integer bankId;

	private Integer locationId;

	private Integer zoneId;

	@JsonIgnore
	private Instant createdOn;

	@JsonIgnore
	private Long createdBy;

	
	private Instant modifiedOn;

	@JsonIgnore
	private Long modifiedBy;

	private String gender;

	private String aadharNumber;

	private String bankName;

	private String ifscCode;

	private String accountNumber;

	private Integer storeLocation;

	private String activeDeliveryType;

	private String shippingPincode;

	private Boolean isKyc;

	private String date;

	private String time;

	private String referralCode;
	
	private String imageName;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Integer getZoneId() {
		return zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public Integer getHierarchyLevelId() {
		return hierarchyLevelId;
	}

	public void setHierarchyLevelId(Integer hierarchyLevelId) {
		this.hierarchyLevelId = hierarchyLevelId;
	}

	public List<DistributorAddressDTO> getDistributorsAddress() {
		return distributorsAddress;
	}

	public void setDistributorsAddress(List<DistributorAddressDTO> distributorsAddress) {
		this.distributorsAddress = distributorsAddress;
	}

	public double getLastMonthSelfPv() {
		return lastMonthSelfPv;
	}

	public void setLastMonthSelfPv(double lastMonthSelfPv) {
		this.lastMonthSelfPv = lastMonthSelfPv;
	}

	public double getLastMonthTotalPv() {
		return lastMonthTotalPv;
	}

	public void setLastMonthTotalPv(double lastMonthTotalPv) {
		this.lastMonthTotalPv = lastMonthTotalPv;
	}

	public double getLastMonthTotalCumPv() {
		return lastMonthTotalCumPv;
	}

	public void setLastMonthTotalCumPv(double lastMonthTotalCumPv) {
		this.lastMonthTotalCumPv = lastMonthTotalCumPv;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public Long getUplineDistributorId() {
		return uplineDistributorId;
	}

	public void setUplineDistributorId(Long uplineDistributorId) {
		this.uplineDistributorId = uplineDistributorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Instant getDob() {
		return dob;
	}

	public void setDob(Instant dob) {
		this.dob = dob;
	}

	public String getCoDistributorTitle() {
		return coDistributorTitle;
	}

	public void setCoDistributorTitle(String coDistributorTitle) {
		this.coDistributorTitle = coDistributorTitle;
	}

	public String getCoDistributorFirstName() {
		return coDistributorFirstName;
	}

	public void setCoDistributorFirstName(String coDistributorFirstName) {
		this.coDistributorFirstName = coDistributorFirstName;
	}

	public String getCoDistributorLastName() {
		return coDistributorLastName;
	}

	public void setCoDistributorLastName(String coDistributorLastName) {
		this.coDistributorLastName = coDistributorLastName;
	}

	public Instant getCoDistributorDob() {
		return coDistributorDob;
	}

	public void setCoDistributorDob(Instant coDistributorDob) {
		this.coDistributorDob = coDistributorDob;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Instant getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Instant registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Instant getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Instant activationDate) {
		this.activationDate = activationDate;
	}

	public Double getMinFirstPurchaseAmount() {
		return minFirstPurchaseAmount;
	}

	public void setMinFirstPurchaseAmount(Double minFirstPurchaseAmount) {
		this.minFirstPurchaseAmount = minFirstPurchaseAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getKitOrderNo() {
		return kitOrderNo;
	}

	public void setKitOrderNo(String kitOrderNo) {
		this.kitOrderNo = kitOrderNo;
	}

	public String getKitInvoiceNo() {
		return kitInvoiceNo;
	}

	public void setKitInvoiceNo(String kitInvoiceNo) {
		this.kitInvoiceNo = kitInvoiceNo;
	}

	public String getFirstOrderTaken() {
		return firstOrderTaken;
	}

	public void setFirstOrderTaken(String firstOrderTaken) {
		this.firstOrderTaken = firstOrderTaken;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getAllInvoiceAmountSum() {
		return allInvoiceAmountSum;
	}

	public void setAllInvoiceAmountSum(Double allInvoiceAmountSum) {
		this.allInvoiceAmountSum = allInvoiceAmountSum;
	}

	public String getUploadedPanNumber() {
		return uploadedPanNumber;
	}

	public void setUploadedPanNumber(String uploadedPanNumber) {
		this.uploadedPanNumber = uploadedPanNumber;
	}

	public String getUploadedAddressProof() {
		return uploadedAddressProof;
	}

	public void setUploadedAddressProof(String uploadedAddressProof) {
		this.uploadedAddressProof = uploadedAddressProof;
	}

	public String getUploadedCancelledCheque() {
		return uploadedCancelledCheque;
	}

	public void setUploadedCancelledCheque(String uploadedCancelledCheque) {
		this.uploadedCancelledCheque = uploadedCancelledCheque;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Instant getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Instant modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public Integer getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(Integer storeLocation) {
		this.storeLocation = storeLocation;
	}

	public String getActiveDeliveryType() {
		return activeDeliveryType;
	}

	public void setActiveDeliveryType(String activeDeliveryType) {
		this.activeDeliveryType = activeDeliveryType;
	}

	public String getShippingPincode() {
		return shippingPincode;
	}

	public void setShippingPincode(String shippingPincode) {
		this.shippingPincode = shippingPincode;
	}

	public Boolean getIsKyc() {
		return isKyc;
	}

	public void setIsKyc(Boolean isKyc) {
		this.isKyc = isKyc;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}
	
	public String getImageName() {
		return imageName;
	}
	
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "DistributorDTO [id=" + id + ", distributorId=" + distributorId + ", uplineDistributorId="
				+ uplineDistributorId + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", coDistributorTitle=" + coDistributorTitle + ", coDistributorFirstName="
				+ coDistributorFirstName + ", coDistributorLastName=" + coDistributorLastName + ", coDistributorDob="
				+ coDistributorDob + ", telephoneNumber=" + telephoneNumber + ", mobileNumber=" + mobileNumber
				+ ", faxNumber=" + faxNumber + ", emailId=" + emailId + ", registrationDate=" + registrationDate
				+ ", activationDate=" + activationDate + ", minFirstPurchaseAmount=" + minFirstPurchaseAmount
				+ ", status=" + status + ", panNumber=" + panNumber + ", kitOrderNo=" + kitOrderNo + ", kitInvoiceNo="
				+ kitInvoiceNo + ", firstOrderTaken=" + firstOrderTaken + ", remarks=" + remarks + ", userName="
				+ userName + ", serialNo=" + serialNo + ", password=" + password + ", allInvoiceAmountSum="
				+ allInvoiceAmountSum + ", uploadedPanNumber=" + uploadedPanNumber + ", uploadedAddressProof="
				+ uploadedAddressProof + ", uploadedCancelledCheque=" + uploadedCancelledCheque + ", lastMonthSelfPv="
				+ lastMonthSelfPv + ", distributorsAddress=" + distributorsAddress + ", lastMonthTotalPv="
				+ lastMonthTotalPv + ", lastMonthTotalCumPv=" + lastMonthTotalCumPv + ", hierarchyLevelId="
				+ hierarchyLevelId + ", bankId=" + bankId + ", locationId=" + locationId + ", zoneId=" + zoneId
				+ ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", modifiedOn=" + modifiedOn
				+ ", modifiedBy=" + modifiedBy + ", gender=" + gender + ", aadharNumber=" + aadharNumber + ", bankName="
				+ bankName + ", ifscCode=" + ifscCode + ", accountNumber=" + accountNumber + ", storeLocation="
				+ storeLocation + ", activeDeliveryType=" + activeDeliveryType + ", shippingPincode=" + shippingPincode
				+ ", isKyc=" + isKyc + ", date=" + date + ", time=" + time + ", referralCode=" + referralCode + "]";
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
