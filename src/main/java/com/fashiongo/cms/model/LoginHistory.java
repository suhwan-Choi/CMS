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
		@NamedStoredProcedureQuery(name = "upWeb_GetLogLoginList", procedureName = "dbo.upWeb_GetLogLoginList", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "LoginStartDate", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "LoginEndDate", type = Date.class) }, resultClasses = com.fashiongo.cms.model.LoginHistory.class) })
@Entity
public class LoginHistory {
	
	@Id
	@Column(name = "seq")
	private Integer seq;
	
	@Column(name = "useraccount")
	private String userAccount;

	@Column(name = "username")
	private String userName;

	@Column(name = "groupname")
	private String groupName;

	@Column(name = "ipaddress")
	private String ipAddress;

	@Column(name = "loginon")
	private Date loginOn;

	@Column(name = "totalcount")
	private Integer totalCount;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getLoginOn() {
		return loginOn;
	}

	public void setLoginOn(Date loginOn) {
		this.loginOn = loginOn;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}