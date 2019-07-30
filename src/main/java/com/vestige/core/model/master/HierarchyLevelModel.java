package com.vestige.core.model.master;

/**
 * 
 * @author ashutosh.sharma
 *
 */
public class HierarchyLevelModel {

	private String id;

	private Integer hierarchyLevelId;

	private String hierarchyLevelName;

	public HierarchyLevelModel() {
	}
	
	public HierarchyLevelModel(String id, Integer hierarchyLevelId, String hierarchyLevelName) {
		this.id=id;
		this.hierarchyLevelId=hierarchyLevelId;
		this.hierarchyLevelName=hierarchyLevelName;
	}

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
