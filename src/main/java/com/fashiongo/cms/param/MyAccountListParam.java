package com.fashiongo.cms.param;

import java.util.Date;

public class MyAccountListParam{
	private Integer userID;
	private String userAccount;
	private String userName;
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
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}