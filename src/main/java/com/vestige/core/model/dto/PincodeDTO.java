package com.vestige.core.model.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * A DTO for the Pincode entity.
 */
@JsonInclude(Include.NON_NULL)
public class PincodeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8832293650522759124L;

	private String id;

	private String pincode;

	private CountryDTO country;

	private StateDTO state;

	private CityDTO city;

	private ZoneDTO zone;

	private Integer subZoneId;

	private Integer areaId;

	private Long createdBy;

	private Instant createdOn;

	private Long updatedBy;

	private Instant updatedOn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Integer getSubZoneId() {
		return subZoneId;
	}

	public void setSubZoneId(Integer subZoneId) {
		this.subZoneId = subZoneId;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
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

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public StateDTO getState() {
		return state;
	}

	public void setState(StateDTO state) {
		this.state = state;
	}

	public CityDTO getCity() {
		return city;
	}

	public void setCity(CityDTO city) {
		this.city = city;
	}

	public ZoneDTO getZone() {
		return zone;
	}

	public void setZone(ZoneDTO zone) {
		this.zone = zone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		PincodeDTO pincodeDTO = (PincodeDTO) o;
		if (pincodeDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), pincodeDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "PincodeDTO [id=" + id + ", pincode=" + pincode + ", country=" + country + ", state=" + state + ", city="
				+ city + ", zone=" + zone + ", subZoneId=" + subZoneId + ", areaId=" + areaId + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn
				+ "]";
	}

}
