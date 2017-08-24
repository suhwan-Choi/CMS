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
	@NamedStoredProcedureQuery(name = "upWeb_GetAccessIP", procedureName = "dbo.upWeb_GetAccessIP", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "IPID", type = Integer.class) }, resultClasses = AccessIP.class)  
	})
@Entity
public class AccessIP{
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

	public void setModifiedByAccount(String modifiedByAccount) {
		this.modifiedByAccount = modifiedByAccount;
	}

	@Column(name = "createdbyaccount")
    private String createdByAccount;
    
    @Column(name = "modifiedon")
    private Date modifiedOn;
    
    @Column(name = "modifiedbyaccount")
    private String modifiedByAccount;
}