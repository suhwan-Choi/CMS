package com.fashiongo.cms.param;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class LoginHistoryListParam{
	private Integer page;
	private Integer pageSize;
	
	private String keywordType;
	private String keywordText;
	private String loginStartDate;
	private String loginEndDate;
	private Integer totalCount;
	
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
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	public Date getLoginStartDate() throws ParseException {
		return sdf.parse(this.loginStartDate);
	}
	public void setLoginStartDate(String loginStartDate) {
		this.loginStartDate = loginStartDate;
	}
	
	public Date getLoginEndDate() throws ParseException {
		return sdf.parse(this.loginEndDate);
	}
	public void setLoginEndDate(String loginEndDate) {
		this.loginEndDate = loginEndDate;
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