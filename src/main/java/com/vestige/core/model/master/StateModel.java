package com.vestige.core.model.master;

public class StateModel {

	private String id;

	private Integer stateCode;

	private String stateName;

	public StateModel() {
	}

	public StateModel(String id,Integer stateCode,String stateName) {
		this.id=id;
		this.stateCode=stateCode;
		this.stateName=stateName;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getStateCode() {
		return stateCode;
	}

	public void setStateCode(Integer stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", stateId=" + stateCode + ", stateName=" + stateName + "]";
	}

}
