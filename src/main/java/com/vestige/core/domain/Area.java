package com.vestige.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author ashutosh.sharma
 *
 */

@Document
public class Area {

	@Id
	private String id;

	private Integer areaId;

	private String areaName;
	
	public Area() {
	}

	public Area(Integer areaId,String areaName) {
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
