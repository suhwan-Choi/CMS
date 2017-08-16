package com.fashiongo.cms.param;

import java.util.Date;

import com.fashiongo.cms.config.JSONDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class UserManagerDeleteParam {
	private Integer userID;
	private Integer workedBy;
	
	@JsonDeserialize(using = JSONDateDeserializer.class)
	private Date workedOn;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getWorkedBy() {
		return workedBy;
	}

	public void setWorkedBy(Integer workedBy) {
		this.workedBy = workedBy;
	}

	public Date getWorkedOn() {
		return workedOn;
	}

	public void setWorkedOn(Date workedOn) {
		this.workedOn = workedOn;
	}
}