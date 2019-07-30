package com.vestige.core.utils;

public class NumberUtil {
	
	public static Double getDoubleValue(String value) {

		return Double.valueOf(StringsUtil.isNullOrEmpty(value) ? "0.00" : value);
	}

	public static Integer getIntegerValue(String value) {

		return Integer.valueOf(StringsUtil.isNullOrEmpty(value) ? "0" : value);
	}
}
