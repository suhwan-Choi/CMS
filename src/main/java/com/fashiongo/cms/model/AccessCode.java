package com.fashiongo.cms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "upWeb_GetAccessCode", procedureName = "dbo.upWeb_GetAccessCodeDetail", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "CodeID", type = Integer.class) }, resultClasses = com.fashiongo.cms.model.AccessCode.class) })
@Entity
public class AccessCode {

	@Id
	@Column(name = "codeid")
	private Integer codeID;

	@Column(name = "startedon")
	private Date startedOn;

	@Column(name = "expiredon")
	private Date expiredOn;

	@Column(name = "accesscode")
	private String accessCode;

	@Column(name = "createdon")
	private Date createdOn;

	@Column(name = "createdbyaccount")
	private String createdByAccount;

	@Column(name = "modifiedon")
	private Date modifiedOn;

	@Column(name = "modifiedbyaccount")
	private String modifedByAccount;

	@Column(name = "active")
	private Boolean active;

	public Integer getCodeID() {
		return codeID;
	}

	public void setCodeID(Integer codeID) {
		this.codeID = codeID;
	}

	public Date getStartedOn() {
		return startedOn;
	}

	public void setStartedOn(Date startedOn) {
		this.startedOn = startedOn;
	}

	public Date getExpiredOn() {
		return expiredOn;
	}

	public void setExpiredOn(Date expiredOn) {
		this.expiredOn = expiredOn;
	}

	public String getAccessCode() {
		return accessCode.trim();
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedByAccount() {
		return createdByAccount;
	}

	public void setCreatedByAccount(String createdByAccount) {
		this.createdByAccount = createdByAccount;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifedByAccount() {
		return modifedByAccount;
	}

	public void setModifedByAccount(String modifedByAccount) {
		this.modifedByAccount = modifedByAccount;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}