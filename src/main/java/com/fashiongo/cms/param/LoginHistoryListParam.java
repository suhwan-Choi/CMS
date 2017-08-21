package com.fashiongo.cms.param;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class LoginHistoryListParam{
	private Integer pn;
	private Integer ps;
	private String keywordType;
	private String keywordText;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchStartDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchEndDate;

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