package com.vestige.core.model.master;

/**
 * 
 * @author ashutosh.sharma
 *
 */

public class CityModel {

	private String id;

	private Integer cityCode;

	private String cityName;

	public CityModel() {
	}
	
	public CityModel(String id,Integer cityCode,String cityName) {
		this.id=id;
		this.cityCode=cityCode;
		this.cityName=cityName;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCityCode() {
		return cityCode;
	}

	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityId=" + cityCode + ", cityName=" + cityName + "]";
	}

}
