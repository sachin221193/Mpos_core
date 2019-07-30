package com.vestige.core.model.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the AdminNotification entity.
 */
public class AdminNotificationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8618403741558458121L;

	private String id;

	private Long distributorId;

	private String notificationMessage;
	
	private String notificationMode;
	
    private Boolean isDisplayed; 

	private Instant createdOn;

	private Boolean isRead;

	private Long createdBy;

	private Long modifiedBy;

	private Instant modifiedOn;
	
	private String title;
	
	private Boolean isActive;

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

	public Boolean getIsRead() {
		return isRead;
	}

	public String getNotificationMessage() {
		return notificationMessage;
	}

	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Boolean isIsRead() {
		return isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Instant getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Instant modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getNotificationMode() {
		return notificationMode;
	}

	public void setNotificationMode(String notificationMode) {
		this.notificationMode = notificationMode;
	}

	public Boolean getIsDisplayed() {
		return isDisplayed;
	}

	public void setIsDisplayed(Boolean isDisplayed) {
		this.isDisplayed = isDisplayed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		AdminNotificationDTO adminNotificationDTO = (AdminNotificationDTO) o;
		if (adminNotificationDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), adminNotificationDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "AdminNotificationDTO{" + "id=" + getId() + ", distributorId='" + getDistributorId() + "'"
				+ ", notificationMessage='" + getNotificationMessage() + "'" + ", createdOn='" + getCreatedOn() + "'"
				+ ", notificationMode='" + getNotificationMode() + "'" + ", isDisplayed='" + getIsDisplayed() + "'" + ", title= '" + getTitle()+ "'" 
				+ ", isRead='" + isIsRead() + "'" + ", createdBy=" + getCreatedBy() + ", modifiedBy=" + getModifiedBy()
				+ ", modifiedOn='" + getModifiedOn() + "'" + "}";
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}
