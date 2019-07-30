package com.vestige.core.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author sohan.maurya
 *
 */

@JsonInclude(Include.NON_NULL)
public class UploadFileVM {

	@NotNull(message = "imageString is missing")
	private byte[] imageString;
	@NotNull(message = "id is missing")
	private String id;
	@NotNull(message = "imageName is missing")
	private String imageName;
	private String uploadFilePath;

	public byte[] getImageString() {
		return imageString;
	}

	public void setImageString(byte[] imageString) {
		this.imageString = imageString;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getUploadFilePath() {
		return uploadFilePath;
	}

	public void setUploadFilePath(String uploadFilePath) {
		this.uploadFilePath = uploadFilePath;
	}

}
