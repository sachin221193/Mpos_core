package com.vestige.core.model.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the State entity.
 */
public class StateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7510633624460640050L;

	private String id;

	private Integer stateId;

	private String stateCode;

	private String stateName;

	private Integer countryId;

	private Integer sortOrder;

	private Boolean status;

	private Integer zoneId;

	private Boolean isState;

	private Integer parentId;

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

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public Boolean getStatus() {
		return status;
	}

	public Boolean getIsState() {
		return isState;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Boolean isStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getZoneId() {
		return zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public Boolean isIsState() {
		return isState;
	}

	public void setIsState(Boolean isState) {
		this.isState = isState;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		StateDTO stateDTO = (StateDTO) o;
		if (stateDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), stateDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "StateDTO{" + "id=" + getId() + ", stateId=" + getStateId() + ", stateCode=" + getStateCode()
				+ ", stateName='" + getStateName() + "'" + ", countryId=" + getCountryId() + ", sortOrder="
				+ getSortOrder() + ", status='" + isStatus() + "'" + ", zoneId=" + getZoneId() + ", isState='"
				+ isIsState() + "'" + ", parentId=" + getParentId() + ", createdBy=" + getCreatedBy() + ", createdOn='"
				+ getCreatedOn() + "'" + ", updatedBy=" + getUpdatedBy() + ", updatedOn='" + getUpdatedOn() + "'" + "}";
	}
}
