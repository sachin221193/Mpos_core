package com.vestige.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author ashutosh.sharma
 *
 */
@Document
public class HierarchyLevel {

	@Id
	private String id;

	private Integer hierarchyLevelId;

	private String hierarchyLevelName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getHierarchyLevelId() {
		return hierarchyLevelId;
	}

	public void setHierarchyLevelId(Integer hierarchyLevelId) {
		this.hierarchyLevelId = hierarchyLevelId;
	}

	public String getHierarchyLevelName() {
		return hierarchyLevelName;
	}

	public void setHierarchyLevelName(String hierarchyLevelName) {
		this.hierarchyLevelName = hierarchyLevelName;
	}

	@Override
	public String toString() {
		return "HierarchyLevel [id=" + id + ", hierarchyLevelId=" + hierarchyLevelId + ", hierarchyLevelName="
				+ hierarchyLevelName + "]";
	}

}
