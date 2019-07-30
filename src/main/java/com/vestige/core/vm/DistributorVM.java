package com.vestige.core.vm;

public class DistributorVM {

	private String status;

	private Long distributorId;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	@Override
	public String toString() {
		return "[status=" + status + ", distributorId=" + distributorId + "]";
	}

}
