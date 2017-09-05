package com.fashiongo.cms.param;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EditItemListParam {
	private Integer pn;
	private Integer ps;
	private Integer userID;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchStartDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchEndDate;
	
	private String keywordType;
	private String KeywordText;
	private String status;
	
	private Integer categoryID1;
	private Integer	categoryID2;
	private Integer categoryID3;
	
	public Integer getPn() {
		return pn;
	}
	
	public void setPn(Integer pn) {
		this.pn = pn;
	}
	
	public Integer getPs() {
		return ps;
	}
	
	public void setPs(Integer ps) {
		this.ps = ps;
	}
	
	public Integer getUserID() {
		return userID;
	}
	
	public void setUserID(Integer userID) {
		this.userID = userID;
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

	public String getKeywordType() {
		return keywordType;
	}

	public void setKeywordType(String keywordType) {
		this.keywordType = keywordType;
	}

	public String getKeywordText() {
		return KeywordText;
	}
	
	public void setKeywordText(String keywordText) {
		KeywordText = keywordText;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
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
}