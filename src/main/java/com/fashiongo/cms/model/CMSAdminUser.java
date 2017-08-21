package com.fashiongo.cms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Transient;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="upWeb_GetLoginUser", procedureName="dbo.upWeb_GetLoginUser", parameters= {
			@StoredProcedureParameter(mode=ParameterMode.IN, name="UserAccount", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="Password", type=String.class)
	}, resultClasses=com.fashiongo.cms.model.CMSAdminUser.class),
	
	@NamedStoredProcedureQuery(name="upWeb_GetLoginUserForID", procedureName="dbo.upWeb_GetLoginUserForID", parameters= {
			@StoredProcedureParameter(mode=ParameterMode.IN, name="UserID", type=Integer.class)
	}, resultClasses=com.fashiongo.cms.model.CMSAdminUser.class),
	
	@NamedStoredProcedureQuery(name="upWeb_GetLoginUserCheck", procedureName="dbo.upWeb_GetLoginUserCheck", parameters= {
			@StoredProcedureParameter(mode=ParameterMode.IN, name="UserAccount", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="Password", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="IpAddress", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="AccessCode", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="NowOn", type=Date.class),
			@StoredProcedureParameter(mode=ParameterMode.OUT, name="ResultCode", type=Integer.class),
			@StoredProcedureParameter(mode=ParameterMode.OUT, name="ErrorMessage", type=String.class)
	}),
	
	@NamedStoredProcedureQuery(name="upWeb_CreateLogLogin", procedureName="dbo.upWeb_CreateLogLogin", parameters= {
			@StoredProcedureParameter(mode=ParameterMode.IN, name="SessionKey", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="UserID", type=Integer.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="UserAccount", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="UserName", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="GroupID", type=Integer.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="GroupName", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="IPAddress", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="AccessCode", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.OUT, name="ResultCode", type=Integer.class),
			@StoredProcedureParameter(mode=ParameterMode.OUT, name="ErrorMessage", type=String.class)
	})
})
@Entity
public class CMSAdminUser implements Serializable{
	private static final long serialVersionUID = 8666251375027550526L;
	
	@Id
	@Column(name="userid")
	private Integer userId;
	
	@Column(name="useraccount")
	private String userAccount;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="groupid")
	private Integer groupId;
	
	@Column(name="groupname")
	private String groupName;
	
	@Transient
	private String sessionId;
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}