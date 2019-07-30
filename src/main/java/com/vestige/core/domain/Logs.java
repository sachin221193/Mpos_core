package com.vestige.core.domain;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author ashutosh.sharma
 *
 */
@Document(collection = "logs")
public class Logs {

	@Id
	private String id;

	private String request;

	private String log;

	private String apiName;
	
	private String apiId;

	private Instant logTime;

	private String apiType;

	private String systemIp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiId() {
		return apiId;
	}
	
	public void setApiId(String apiId) {
		this.apiId = apiId;
	}
	
	public Instant getLogTime() {
		return logTime;
	}

	public void setLogTime(Instant logTime) {
		this.logTime = logTime;
	}

	public String getApiType() {
		return apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	public String getSystemIp() {
		return systemIp;
	}

	public void setSystemIp(String systemIp) {
		this.systemIp = systemIp;
	}

}
