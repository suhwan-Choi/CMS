package com.fashiongo.cms.param;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class AccessIPListParam{
	private Integer page;
	private Integer pageSize;
	private String keywordType;

	private String keywordText;
	private Boolean active;
	private String SearchDateType;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchStartDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchEndDate;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getSearchDateType() {
		return SearchDateType;
	}

	public void setSearchDateType(String searchDateType) {
		SearchDateType = searchDateType;
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
	
}