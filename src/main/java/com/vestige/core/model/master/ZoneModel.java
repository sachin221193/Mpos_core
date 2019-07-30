package com.vestige.core.model.master;

/**
 * @author ashutosh.sharma
 */

public class ZoneModel {

	private String id;

	private Integer zoneId;

	private String zoneName;

	public ZoneModel() {
	}
	
	public ZoneModel(String id,Integer zoneId,String zoneName) {
		this.id=id;
		this.zoneId=zoneId;
		this.zoneName=zoneName;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getZoneId() {
		return zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	@Override
	public String toString() {
		return "Zone [id=" + id + ", zoneId=" + zoneId + ", zoneName=" + zoneName + "]";
	}

}
