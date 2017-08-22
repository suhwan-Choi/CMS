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
	@NamedStoredProcedureQuery(name = "upWeb_GetAccessCodeList", procedureName = "dbo.upWeb_GetAccessCodeList", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "AccessCode", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchDateType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchStartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchEndDate", type = Date.class)
			}, resultClasses = com.fashiongo.cms.model.AccessCode.class),
	@NamedStoredProcedureQuery(name = "upWeb_CreateModifyAccessCode", procedureName = "dbo.upWeb_CreateModifyAccessCode", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CodeID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "StartedOn", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ExpiredOn", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "AccessCode", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class) }),
	@NamedStoredProcedureQuery(name = "upWeb_RemoveAccessCode", procedureName = "dbo.upWeb_RemoveAccessCode", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CodeID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class)  }) })
@Entity
public class AccessCode{

	@Id
	@Column(name="seq")
	private Integer seq;

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
    
    @Column(name = "totalcount")
    private Integer totalCount;
    
    
    public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

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
		return accessCode;
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

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}