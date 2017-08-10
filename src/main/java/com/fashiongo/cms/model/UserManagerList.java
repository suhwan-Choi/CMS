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
		@NamedStoredProcedureQuery(name = "upWeb_GetAccessUserList", procedureName = "dbo.upWeb_GetAccessUserList", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchDateType", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchStartDate", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchEndDate", type = Date.class) }, resultClasses = UserManagerList.class) })
@Entity
public class UserManagerList {
	@Id
	@Column(name = "userid")
	private Integer userId;

	@Column(name = "useraccount")
	private String userAccount;

	@Column(name = "username")
	private String userName;

	@Column(name = "groupid")
	private Integer groupID;

	@Column(name = "groupname")
	private String groupName;

	@Column(name = "createdon")
	private Date createdOn;

	@Column(name = "modifiedon")
	private Date modifiedOn;

	@Column(name = "active")
	private Boolean active;
	
	@Column(name = "totalcount")
	private Integer totalCount;

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

	public Integer getGroupID() {
		return groupID;
	}

	public void setGroupID(Integer groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
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
