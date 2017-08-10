package com.fashiongo.cms.param;

import java.sql.Date;

public class LoginHistoryListParam{
	private Integer page;
	private Integer pageSize;
	
	private String keywordType;
	private String keywordText;
	private Date loginStartDate;
	private Date loginEndDate;
	private Integer totalCount;
	public Date getLoginEndDate() {
		return loginEndDate;
	}
	public void setLoginEndDate(Date loginEndDate) {
		this.loginEndDate = loginEndDate;
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
	public Date getLoginStartDate() {
		return loginStartDate;
	}
	public void setLoginStartDate(Date loginStartDate) {
		this.loginStartDate = loginStartDate;
	}

	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
}