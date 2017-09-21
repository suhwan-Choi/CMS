package com.fashiongo.cms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(name = "upWeb_GetRollbackItemList", procedureName = "dbo.upWeb_GetRollbackItemList", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchStartDate", type = Date.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchEndDate", type = Date.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "Status", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID1", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID2", type = Integer.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID3", type = Integer.class), }, resultClasses = RollBackItems.class)
@Entity
public class RollBackItems {
	@Id
	@Column(name = "seq")
	private Integer seq;
	@Column(name = "rollbackproductseq")
	private Integer rollbackProductSeq;
	@Column(name = "sharedproductseq")
	private Integer sharedProductSeq;
	@Column(name = "username")
	private String userName;
	@Column(name = "reason")
	private String reason;
	@Column(name = "requeston")
	private Date requestOn;
	@Column(name = "resolvedon")
	private Date resolvedOn;
	@Column(name = "resolvedstatus")
	private Integer resolvedStatus;
	@Column(name = "totalcount")
	private Integer totalCount;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getRollbackProductSeq() {
		return rollbackProductSeq;
	}

	public void setRollbackProductSeq(Integer rollbackProductSeq) {
		this.rollbackProductSeq = rollbackProductSeq;
	}
	
	public Integer getSharedProductSeq() {
		return sharedProductSeq;
	}

	public void setSharedProductSeq(Integer sharedProductSeq) {
		this.sharedProductSeq = sharedProductSeq;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getRequestOn() {
		return requestOn;
	}

	public void setRequestOn(Date requestOn) {
		this.requestOn = requestOn;
	}

	public Date getResolvedOn() {
		return resolvedOn;
	}

	public void setResolvedOn(Date resolvedOn) {
		this.resolvedOn = resolvedOn;
	}

	public Integer getResolvedStatus() {
		return resolvedStatus;
	}

	public void setResolvedStatus(Integer resolvedStatus) {
		this.resolvedStatus = resolvedStatus;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

}
