package com.fashiongo.cms.param;

public class ApprovalRollBackSaveReshareParam {
	private Integer workedBy;
	private String sessionKey;
	// [{"RollbackProductSeq":1002},{"RollbackProductSeq":1003}]
	private String reshareList;
	// [{"UserID":11,"ReshareCount":2}]
	private String reshareUser;

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

	public String getReshareList() {
		return reshareList.replaceAll("\'", "\\\"");
	}

	public void setReshareList(String reshareList) {
		this.reshareList = reshareList;
	}

	public String getReshareUser() {
		return reshareUser.replaceAll("\'", "\\\"");
	}

	public void setReshareUser(String reshareUser) {
		this.reshareUser = reshareUser;
	}
}