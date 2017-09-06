package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "upWeb_ModifyApproveItem", procedureName = "dbo.upWeb_ModifyApproveItem", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "SessionKey", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "ApproveList", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class), }, resultClasses = ApprovalItemsSave.class),
		@NamedStoredProcedureQuery(name = "upWeb_ModifyRejectItem", procedureName = "dbo.upWeb_ModifyRejectItem", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "SessionKey", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "RejectList", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class), }, resultClasses = ApprovalItemsSave.class), })
@Entity
public class ApprovalItemsSave {

	@Id
	@Column(name = "workedBy")
	private Integer workedBy;

	@Column(name = "sessionkey")
	private String sessionKey;

	@Column(name = "approvelist")
	private String approveList;

	public Integer getWorkedBy() {
		return workedBy;
	}

	public void setWorkedBy(Integer workedBy) {
		this.workedBy = workedBy;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getApproveList() {
		return approveList;
	}

	public void setApproveList(String approveList) {
		this.approveList = approveList;
	}

}
