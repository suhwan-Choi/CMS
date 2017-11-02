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
	private String searchDateType;
	
	private Integer categoryID;
	private Integer lengthID;
	private Integer styleID;
	private Integer pattrenID;
	private Integer fabricID;
	private Integer viewType = 1;
	
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

	public Integer getViewType() {
		return viewType;
	}

	public void setViewType(Integer viewType) {
		this.viewType = viewType;
	}

	public String getSearchDateType() {
		return searchDateType;
	}

	public void setSearchDateType(String searchDateType) {
		this.searchDateType = searchDateType;
	}

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public Integer getLengthID() {
		return lengthID;
	}

	public void setLengthID(Integer lengthID) {
		this.lengthID = lengthID;
	}

	public Integer getStyleID() {
		return styleID;
	}

	public void setStyleID(Integer styleID) {
		this.styleID = styleID;
	}

	public Integer getPattrenID() {
		return pattrenID;
	}

	public void setPattrenID(Integer pattrenID) {
		this.pattrenID = pattrenID;
	}

	public Integer getFabricID() {
		return fabricID;
	}

	public void setFabricID(Integer fabricID) {
		this.fabricID = fabricID;
	}
}