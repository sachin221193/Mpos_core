package com.vestige.core.model.master;

/**
 * 
 * @author ashutosh.sharma
 *
 */

public class AreaModel {

	private String id;

	private Integer areaId;

	private String areaName;

	public AreaModel() {
	}

	public AreaModel(String id, Integer areaId, String areaName) {
		this.id = id;
		this.areaId = areaId;
		this.areaName = areaName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public String toString() {
		return "Area [id=" + id + ", areaId=" + areaId + ", areaName=" + areaName + "]";
	}

}
