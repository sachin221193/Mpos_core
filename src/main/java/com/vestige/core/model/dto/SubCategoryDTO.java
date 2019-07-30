package com.vestige.core.model.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/**
 * A DTO for the SubCategory entity.
 */
public class SubCategoryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1615033221137859111L;

	private String id;

	@NotNull
	private Integer subCategoryId;

	@NotNull
	private Integer categoryId;

	@NotNull
	private String name;

	private Boolean isChildAvailable;

	private String details;
	
	private String imageUrl;
	
	private Boolean status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Boolean getIsChildAvailable() {
		return isChildAvailable;
	}

	public void setIsChildAvailable(Boolean isChildAvailable) {
		this.isChildAvailable = isChildAvailable;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		SubCategoryDTO subCategoryDTO = (SubCategoryDTO) o;
		if (subCategoryDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), subCategoryDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "SubCategoryDTO [id=" + id + ", subCategoryId=" + subCategoryId + ", categoryId=" + categoryId
				+ ", name=" + name + ", isChildAvailable=" + isChildAvailable + ", details=" + details + ", imageUrl="
				+ imageUrl + "]";
	}
}
