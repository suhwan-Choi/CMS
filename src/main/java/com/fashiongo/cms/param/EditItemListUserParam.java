package com.fashiongo.cms.param;

import java.util.Date;

public class EditItemListUserParam {
	private Integer dateType;
	private Date startDate;
	private Date endDate;
	
	public Integer getDateType() {
		return dateType;
	}
	
	public void setDateType(Integer dateType) {
		this.dateType = dateType;
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
}