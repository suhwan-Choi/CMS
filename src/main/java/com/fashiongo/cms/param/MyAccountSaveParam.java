package com.fashiongo.cms.param;

public class MyAccountSaveParam{
	private Integer userID;
	private String userPassword;
	private Integer workedBy;
	
	public Integer getWorkedBy() {
		return workedBy;
	}
	
	public void setWorkedBy(Integer workedBy) {
		this.workedBy = workedBy;
	}
	
	public Integer getUserID() {
		return userID;
	}
	
	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}