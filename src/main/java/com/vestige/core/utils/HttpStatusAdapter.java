package com.vestige.core.utils;

import org.zalando.problem.Status;
import org.springframework.http.HttpStatus;

public class HttpStatusAdapter {
	public static Status get5xStatus(int status) {
		Status retStatus = Status.INTERNAL_SERVER_ERROR;
		switch(status) {
		case 501:
			retStatus = Status.NOT_IMPLEMENTED;
			break;
		case 502:
			retStatus =  Status.BAD_GATEWAY;
			break;
		case 503:
			retStatus =  Status.SERVICE_UNAVAILABLE;
			break;
		case 504:
			retStatus =  Status.GATEWAY_TIMEOUT;
			break;
		default:
			retStatus =  Status.INTERNAL_SERVER_ERROR;

			break;

		}
		return retStatus;
	}
	
	public static Status get4xStatus(int status) {
		Status retStatus = Status.BAD_REQUEST;
		switch(status) {
		case 401:
			retStatus = Status.UNAUTHORIZED;
			break;
		case 402:
			retStatus =  Status.BAD_GATEWAY;
			break;
		case 403:
			retStatus =  Status.FORBIDDEN;
			break;
		case 404:
			retStatus =  Status.NOT_FOUND;
			break;
		case 405:
			retStatus =  Status.METHOD_NOT_ALLOWED;
			break;
		case 406:
			retStatus =  Status.NOT_ACCEPTABLE;
			break;
		case 408:
			retStatus =  Status.REQUEST_TIMEOUT;
			break;
		case 423:
			retStatus =  Status.LOCKED;
			break;
		default:
			retStatus =  Status.BAD_REQUEST;
			break;
			
		}
		return retStatus;
	}
	
	public static Status get5xStatus(HttpStatus status) {
		return get5xStatus(status.value());
	}
	
	public static Status get4xStatus(HttpStatus status) {
		return get4xStatus(status.value());
	}

}
