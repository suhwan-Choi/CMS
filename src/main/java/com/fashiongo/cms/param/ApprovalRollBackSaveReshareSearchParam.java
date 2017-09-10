package com.fashiongo.cms.param;


import java.util.Date;
import com.fashiongo.cms.config.JSONDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class ApprovalRollBackSaveReshareSearchParam {
	private Integer workedBy;
	private String sessionKey;

	@JsonDeserialize(using = JSONDateDeserializer.class)
	private Date searchStartDate;
	@JsonDeserialize(using = JSONDateDeserializer.class)
	private Date searchEndDate;
	private String status;
	
	private String keywordType;
	private String keywordText;
	private Integer categoryID1;
	private Integer categoryID2;
	private Integer categoryID3;
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
	public Date getSearchStartDate() {
		return searchStartDate;
	}
	public void setSearchStartDate(Date searchStartDate) {
		this.searchStartDate = searchStartDate;
	}
	public Date getSearchEndDate() {
		return searchEndDate;
	}
	public void setSearchEndDate(Date searchEndDate) {
		this.searchEndDate = searchEndDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getKeywordType() {
		return keywordType;
	}
	public void setKeywordType(String keywordType) {
		this.keywordType = keywordType;
	}
	public String getKeywordText() {
		return keywordText;
	}
	public void setKeywordText(String keywordText) {
		this.keywordText = keywordText;
	}
	public Integer getCategoryID1() {
		return categoryID1;
	}
	public void setCategoryID1(Integer categoryID1) {
		this.categoryID1 = categoryID1;
	}
	public Integer getCategoryID2() {
		return categoryID2;
	}
	public void setCategoryID2(Integer categoryID2) {
		this.categoryID2 = categoryID2;
	}
	public Integer getCategoryID3() {
		return categoryID3;
	}
	public void setCategoryID3(Integer categoryID3) {
		this.categoryID3 = categoryID3;
	}
	public String getReshareUser() {
		return reshareUser.replaceAll("\'", "\\\"");
	}
	public void setReshareUser(String reshareUser) {
		this.reshareUser = reshareUser;
	}

	
}
