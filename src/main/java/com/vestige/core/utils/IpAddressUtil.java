package com.vestige.core.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class IpAddressUtil {

	private static final Logger log = LoggerFactory.getLogger(IpAddressUtil.class);

	
	private IpAddressUtil() {
	}

	public static String getIpAddress(){
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			log.error("error found while getting system ip : {}",e);
		}
		return "";
	}
	
}
