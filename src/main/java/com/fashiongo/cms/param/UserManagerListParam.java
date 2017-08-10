package com.fashiongo.cms.param;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserManagerListParam {
	private Integer pn;
	private Integer ps;
	private String keywordType;
	private String keywordText;
	private Boolean active;
	private String searchDateType;
	private String searchStartDate;
	private String searchEndDate;

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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getSearchDateType() {
		return searchDateType;
	}

	public void setSearchDateType(String searchDateType) {
		this.searchDateType = searchDateType;
	}

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public Date getSearchStartDate() throws ParseException {
		return sdf.parse(this.searchStartDate);
	}

	public void setSearchStartDate(String searchStartDate) {
		this.searchStartDate = searchStartDate;
	}

	public Date getSearchEndDate() throws ParseException {
		return sdf.parse(this.searchEndDate);
	}

	public void setSearchEndDate(String searchEndDate) {
		this.searchEndDate = searchEndDate;
	}

}
