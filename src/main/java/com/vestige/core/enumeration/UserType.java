package com.vestige.core.enumeration;

public enum UserType {

	GUEST("Guest"), ADMIN("Admin"), DISTRIBUTOR("Distributor");

	private String name;

	private UserType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static UserType getUserTypeByName(String name) {
		if (DISTRIBUTOR.name.equalsIgnoreCase(name)) {
			return DISTRIBUTOR;
		} else if (GUEST.name.equalsIgnoreCase(name)) {
			return GUEST;
		} else if (ADMIN.name.equalsIgnoreCase(name)) {
			return ADMIN;
		} else
			return DISTRIBUTOR;
	}
}
