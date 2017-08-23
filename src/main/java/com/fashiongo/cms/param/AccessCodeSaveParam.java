package com.fashiongo.cms.param;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class AccessCodeSaveParam {
	private Integer codeID;
	private Boolean active;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startedOn;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date expiredOn;
	private String accessCode;
	private Integer createdBy;

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	private Date workedOn;
	private Integer workedBy;

	public Integer getCodeID() {
		return codeID;
	}

	public void setCodeID(Integer codeID) {
		this.codeID = codeID;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getStartedOn() {
		return startedOn;
	}

	public void setStartedOn(Date startedOn) {
		this.startedOn = startedOn;
	}

	public Date getExpiredOn() {
		return expiredOn;
	}

	public void setExpiredOn(Date expiredOn) {
		this.expiredOn = expiredOn;
	}

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public Date getWorkedOn() {
		return workedOn;
	}

	public void setWorkedOn(Date workedOn) {
		this.workedOn = workedOn;
	}

	public Integer getWorkedBy() {
		return workedBy;
	}

	public void setWorkedBy(Integer workedBy) {
		this.workedBy = workedBy;
	}
}