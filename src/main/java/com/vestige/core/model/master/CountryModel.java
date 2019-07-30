package com.vestige.core.model.master;

public class CountryModel {

	private String id;

	private Integer countryCode;

	private String countryName;

	public CountryModel() {
	}
	
	public CountryModel(String id,Integer countryCode,String countryName) {
		this.id=id;
		this.countryCode=countryCode;
		this.countryName=countryName;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryId=" + countryCode + ", countryName=" + countryName + "]";
	}

}
