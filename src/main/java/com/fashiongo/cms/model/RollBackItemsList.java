package com.fashiongo.cms.model;

import java.util.Date;

public class RollBackItemsList {
	private Integer sharedProductSeq;
	private Integer totalCount;
	private Date createdOn;
	private Integer createdBy;
	private String reason;

	public Integer getSharedProductSeq() {
		return sharedProductSeq;
	}

	public void setSharedProductSeq(Integer sharedProductSeq) {
		this.sharedProductSeq = sharedProductSeq;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
