package com.vestige.core.model;

import java.util.Set;

/**
 * 
 * @author sohan.maurya
 * @description entity wise permissions model
 *
 */
public class EntityPermissionModel {

	private String entity;
	private Set<String> permissions;
	
	public Set<String> getPermissions() {
		return permissions;
	}
	public void setPermissions(Set<String> permissions) {
		this.permissions = permissions;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
}
