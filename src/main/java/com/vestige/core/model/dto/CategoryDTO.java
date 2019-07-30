package com.vestige.core.model.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/**
 * A DTO for the Category entity.
 */
public class CategoryDTO implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	@NotNull
	private Integer categoryId;

	@NotNull
	private String name;

	private String shortName;

	private String description;

	@NotNull
	private Instant createdOn;

	@NotNull
	private Instant modifiedOn;

	@NotNull
	private Long createdBy;

	@NotNull
	private Long modifiedBy;

	private List<SubCategoryDTO> subCategory;
	
	private String imageUrl;
	
	private Boolean status;

	public List<SubCategoryDTO> getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(List<SubCategoryDTO> subCategory) {
		this.subCategory = subCategory;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public Instant getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Instant modifiedOn) {
		this.modifiedOn = modifiedOn;
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

		CategoryDTO categoryDTO = (CategoryDTO) o;
		if (categoryDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), categoryDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "CategoryDTO [id=" + id + ", categoryId=" + categoryId + ", name=" + name + ", shortName=" + shortName
				+ ", description=" + description + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn
				+ ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", subCategory=" + subCategory
				+ ", imageUrl=" + imageUrl + "]";
	}
}
