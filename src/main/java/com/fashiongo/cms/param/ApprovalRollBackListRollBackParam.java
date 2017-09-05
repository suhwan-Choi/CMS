package com.fashiongo.cms.param;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ApprovalRollBackListRollBackParam {
	private String keywordType;
	private String keywordText ="";
	private Integer assignType;
	private Integer categoryID1;
	private Integer categoryID2;
	private Integer categoryID3;
	private Integer dateType;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchStartDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchEndDate;
	private String status;
	private Integer ps;
	private Integer pn;

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
	public Integer getAssignType() {
		return assignType;
	}
	public void setAssignType(Integer assignType) {
		this.assignType = assignType;
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
	public Integer getDateType() {
		return dateType;
	}
	public void setDateType(Integer dateType) {
		this.dateType = dateType;
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
	public Integer getPs() {
		return ps;
	}
	public void setPs(Integer ps) {
		this.ps = ps;
	}
	public Integer getPn() {
		return pn;
	}
	public void setPn(Integer pn) {
		this.pn = pn;
	}
	
	
	
}