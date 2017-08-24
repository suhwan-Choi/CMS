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
	@NamedStoredProcedureQuery(name = "upWeb_GetAccessIPList", procedureName = "dbo.upWeb_GetAccessIPList", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchDateType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchStartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchEndDate", type = Date.class)
			}, resultClasses = com.fashiongo.cms.model.AccessIPList.class),
	@NamedStoredProcedureQuery(name = "upWeb_CreateModifyAccessIP", procedureName = "dbo.upWeb_CreateModifyAccessIP", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "IPID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "IPAddress", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "IPDescription", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class) }),
	@NamedStoredProcedureQuery(name = "upWeb_RemoveAccessIP", procedureName = "dbo.upWeb_RemoveAccessIP", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "IPID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class)  }) })
@Entity
public class AccessIPList{
    @Id
    @Column(name = "ipid")
    private Integer ipId;
    
    @Column(name = "ipaddress")
    private String ipAddress;
    
    @Column(name = "active")
    private Boolean active;
    
    @Column(name = "ipdescription")
    private String ipDescription;
    
    @Column(name = "createdon")
    private Date createdOn;
    
    @Column(name = "createdbyaccount")
    private String createdByAccount;
    
    @Column(name = "modifiedon")
    private Date modifiedOn;
    
    @Column(name = "modifiedbyaccount")
    private String modifiedByAccount;
    
    @Column(name = "totalcount")
    private Integer totalCount;

	public Integer getIpId() {
		return ipId;
	}

	public void setIpId(Integer ipId) {
		this.ipId = ipId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getIpDescription() {
		return ipDescription;
	}

	public void setIpDescription(String ipDescription) {
		this.ipDescription = ipDescription;
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

	public String getModifiedByAccount() {
		return modifiedByAccount;
	}

	public void setModifiedByAccount(String modifedByAccount) {
		this.modifiedByAccount = modifedByAccount;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
    
    
}