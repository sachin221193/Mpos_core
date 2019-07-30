package com.vestige.core.model.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


public class LanguageDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8832293650522759124L;

	private String id;

	private String code;

	private String languageName;

	private Long createdBy;

	private Instant createdOn;

	private Long modifiedBy;

	private Instant modifiedOn;

	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		LanguageDTO languageDTO = (LanguageDTO) o;
		if (languageDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), languageDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "LanguageDTO{" +
	            "id=" + getId() +
	            ", code='" + getCode() + "'" +
	            ", languageName='" + getLanguageName() + "'" +
	            ", createdBy='" + getCreatedBy() + "'" +
	            ", createdOn='" + getCreatedOn() + "'" +
	            ", modifiedBy='" + getModifiedBy() + "'" +
	            ", modifiedOn='" + getModifiedOn() + "'" +
	            "}";
	}

	
}
