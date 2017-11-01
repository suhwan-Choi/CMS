package com.fashiongo.cms.param;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class AssignItemListParam {
	private Integer page;
	private Integer pageSize;
	private String keywordType;
	private String keywordText;
	private Integer categoryID;
	private Integer lengthID;
	private Integer styleID;
	private Integer patternID;
	private Integer fabricID;
	private String SearchDateType;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchStartDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date searchEndDate;
	private Integer viewType;
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
	public Integer getPatternID() {
		return patternID;
	}
	public void setPatternID(Integer patternID) {
		this.patternID = patternID;
	}
	public Integer getFabricID() {
		return fabricID;
	}
	public void setFabricID(Integer fabricID) {
		this.fabricID = fabricID;
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
	public Integer getViewType() {
		return viewType;
	}
	public void setViewType(Integer viewType) {
		this.viewType = viewType;
	}

}