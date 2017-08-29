package com.fashiongo.cms.param;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AccessCodeSaveParam {
	private Integer codeID;
	private Boolean active;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="America/Los_Angeles")
	private Date startedOn;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="America/Los_Angeles")
	private Date expiredOn;
	private String accessCode;
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

	public Integer getWorkedBy() {
		return workedBy;
	}

	public void setWorkedBy(Integer workedBy) {
		this.workedBy = workedBy;
	}
}