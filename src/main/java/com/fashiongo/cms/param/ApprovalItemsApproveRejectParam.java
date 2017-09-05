package com.fashiongo.cms.param;

public class ApprovalItemsApproveRejectParam {
	private String mode;
	private Integer workedBy;
	private String sessionKey;
	private String approveList;


	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

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

	public String getApproveList() {
		return approveList;
	}

	public void setApproveList(String approveList) {
		this.approveList = approveList;
	}

}
