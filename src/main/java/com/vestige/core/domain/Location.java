package com.vestige.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author ashutosh.sharma
 *
 */

@Document
public class Location {

	@Id
	private String id;

	private Integer locationId;

	private String locationName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", locationId=" + locationId + ", locationName=" + locationName + "]";
	}

}
