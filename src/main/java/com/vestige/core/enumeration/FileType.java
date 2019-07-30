package com.vestige.core.enumeration;

import com.vestige.core.utils.StringsUtil;



public enum FileType {

	IMAGES("IMAGE","images"), VIDEOS("VIDEOS","videos");

	private String code;
    private String name;

    private FileType(String code, String name) {
    	this.code = code;
        this.name = name;
    }
    
    public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public static FileType getFileTypeByCode(String code) {
		if (StringsUtil.isNullOrEmpty(code)) {
			return null;
		} else if (IMAGES.code.equalsIgnoreCase(code)) {
			return IMAGES;
		} else if (VIDEOS.code.equalsIgnoreCase(code)) {
			return VIDEOS;
		} 
		return null;
	}
}
