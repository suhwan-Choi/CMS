package com.fashiongo.cms.param;

import java.util.Date;

import com.fashiongo.cms.config.JSONDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class UserManagerSaveParam {
	private Integer userID = 0;
	private Boolean active;
	private String userAccount;
	private String userPassword;
	private String userName;
	private Integer groupID;
	private String userDescription;
	private Integer workedBy;
	
	@JsonDeserialize(using = JSONDateDeserializer.class)
	private Date workedOn;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getGroupID() {
		return groupID;
	}

	public void setGroupID(Integer groupID) {
		this.groupID = groupID;
	}

	public String getUserDescription() {
		return userDescription;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
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