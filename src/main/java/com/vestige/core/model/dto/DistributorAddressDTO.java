package com.vestige.core.model.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/**
 * A DTO for the DistributorAddress entity.
 */
public class DistributorAddressDTO implements Serializable {

	private static final long serialVersionUID = 4196482451233802056L;

	private String id;

	private Long distributorId;

	private String addressType;

	@NotNull
	private Boolean isDefault;

	private String contactName;

	private String contactNumber;

	private ZoneDTO zone;

	private PincodeDTO pincode;

	private String address1;

	private String address2;

	private String address3;

	private String address4;

	private Integer cityId;

	private String cityName;

	private Integer stateId;

	private String stateName;

	private Integer countryId;

	private String countryName;

	private Boolean isDeleted;

	private Long createdBy;

	private Instant createdOn;

	private Long updatedBy;

	private Instant updatedOn;

	private Long deletedBy;

	private Instant deletedOn;
	
	private String website;
	
	private String fax;
	
	private String email;
	
	private Long addressId;
	
	private String locationCode;
	
	/**
	 * Entries for Store-Pickup-Address
	 * 
	 */
	private String locationName;
	
	private Integer locationId;
	
	private String timings;
	
    private String distance;
    
    private Boolean isOnlinePayment = Boolean.FALSE;
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Boolean isIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Instant getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Instant updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Long getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(Long deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Instant getDeletedOn() {
		return deletedOn;
	}

	public void setDeletedOn(Instant deletedOn) {
		this.deletedOn = deletedOn;
	}

	public PincodeDTO getPincode() {
		return pincode;
	}

	public void setPincode(PincodeDTO pincode) {
		this.pincode = pincode;
	}

	public ZoneDTO getZone() {
		return zone;
	}

	public void setZone(ZoneDTO zone) {
		this.zone = zone;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFax() {
		return fax;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public Boolean getIsOnlinePayment() {
		return isOnlinePayment;
	}

	public void setIsOnlinePayment(Boolean isOnlinePayment) {
		this.isOnlinePayment = isOnlinePayment;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		DistributorAddressDTO distributorAddressDTO = (DistributorAddressDTO) o;
		if (distributorAddressDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), distributorAddressDTO.getId());
	}

	@Override
	public String toString() {
		return "DistributorAddressDTO [id=" + id + ", distributorId=" + distributorId + ", addressType=" + addressType
				+ ", isDefault=" + isDefault + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ ", zone=" + zone + ", pincode=" + pincode + ", address1=" + address1 + ", address2=" + address2
				+ ", address3=" + address3 + ", address4=" + address4 + ", cityId=" + cityId + ", cityName=" + cityName
				+ ", stateId=" + stateId + ", stateName=" + stateName + ", countryId=" + countryId + ", countryName="
				+ countryName + ", isDeleted=" + isDeleted + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + ", deletedBy=" + deletedBy + ", deletedOn="
				+ deletedOn + ", website=" + website + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
}