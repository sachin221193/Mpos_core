package com.vestige.core.model;

public class ItemModel {

	private Integer itemId;
	
	private String itemCode;
	
	private Integer availableQuantity;
	
	private String alternativeCode;
	
	private Integer alternativeCodeQuantity;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public String getAlternativeCode() {
		return alternativeCode;
	}

	public void setAlternativeCode(String alternativeCode) {
		this.alternativeCode = alternativeCode;
	}

	public Integer getAlternativeCodeQuantity() {
		return alternativeCodeQuantity;
	}

	public void setAlternativeCodeQuantity(Integer alternativeCodeQuantity) {
		this.alternativeCodeQuantity = alternativeCodeQuantity;
	}

	@Override
	public String toString() {
		return "[itemId=" + itemId + ", itemCode=" + itemCode + ", availableQuantity=" + availableQuantity
				+ ", alternativeCode=" + alternativeCode + ", alternativeCodeQuantity=" + alternativeCodeQuantity + "]";
	}
	
}
