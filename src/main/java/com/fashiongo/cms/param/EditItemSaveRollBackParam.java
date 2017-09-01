package com.fashiongo.cms.param;

public class EditItemSaveRollBackParam {
	private Integer workedBy;
	private String sessionKey;
	private String reason;
	private String rollbackList;
	
	public Integer getWorkedBy() {
		return workedBy;
	}
	
	public void setWorkedBy(Integer workedBy) {
		this.workedBy = workedBy;
	}
	
	public String getSessionKey() {
		return sessionKey;
	}
	
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public String getRollbackList() {
		return rollbackList;
	}
	
	public void setRollbackList(String rollbackList) {
		this.rollbackList = rollbackList;
	}
}
