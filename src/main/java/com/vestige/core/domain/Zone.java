package com.vestige.core.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ashutosh.sharma
 */

@Document
public class Zone {

	@Id
	private String id;

	private Integer zoneId;

	private String zoneName;

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
