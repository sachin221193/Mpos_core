package com.vestige.core.model.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.vestige.core.enumeration.OtpStatus;

/**
 * A DTO for the MobileOtp entity.
 */
@SuppressWarnings("serial")
public class MobileOtpDTO implements Serializable {

	private String id;

	@NotNull
	@Size(min = 10, max = 10)
	private String mobileNumber;

	private Integer otp;

	private Integer count;

	private Instant createdOn;

	private OtpStatus status;

	private String otpValue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Instant getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}

	public OtpStatus getStatus() {
		return status;
	}

	public void setStatus(OtpStatus status) {
		this.status = status;
	}

	public String getOtpValue() {
		return otpValue;
	}

	public void setOtpValue(String otpValue) {
		this.otpValue = otpValue;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		MobileOtpDTO mobileOtpDTO = (MobileOtpDTO) o;
		if (mobileOtpDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), mobileOtpDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "MobileOtpDTO{" + "id=" + getId() + ", mobileNumber='" + getMobileNumber() + "'" + ", otp=" + getOtp()
				+ ", count=" + getCount() + ", createdOn='" + getCreatedOn() + "'" + ", status='" + getStatus() + "'"
				+ "}";
	}
}
