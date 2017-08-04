package com.fashiongo.cms.param;

import java.util.Date;

public class NewItemListParam {
	private Integer keywordType;
	private String keyword;
	private Integer	categoryId;
	private Date startDate;
	private Date endDate;
	private Integer ps;
	private Integer pn;
	
	public Integer getKeywordType() {
		return keywordType;
	}
	
	public void setKeywordType(Integer keywordType) {
		this.keywordType = keywordType;
	}
	
	public String getKeyword() {
		return keyword;
	}
	
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public Integer getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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