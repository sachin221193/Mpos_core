package com.vestige.core.model.master;

/**
 * 
 * @author ashutosh.sharma
 *
 */
public class LocationModel {

	private String id;

	private Integer locationId;

	private String locationName;

	public LocationModel() {
	}
	
	public LocationModel(String id,Integer locationId,String locationName) {
		this.id=id;
		this.locationId=locationId;
		this.locationName=locationName;
	}
	
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
