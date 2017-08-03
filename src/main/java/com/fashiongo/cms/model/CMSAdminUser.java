package com.fashiongo.cms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="get_adminUserInfo", procedureName="dbo.up_Get_AdminUserInfo", parameters= {
			@StoredProcedureParameter(mode=ParameterMode.IN, name="username", type=String.class),
			@StoredProcedureParameter(mode=ParameterMode.IN, name="password", type=String.class)
	}, resultClasses=com.fashiongo.cms.model.CMSAdminUser.class)
})
@Entity
public class CMSAdminUser implements Serializable{
	private static final long serialVersionUID = 8666251375027550526L;
	
	@Id
	@Column(name="userid")
	private Integer userId;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="groupid")
	private Integer groupId;
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
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
}