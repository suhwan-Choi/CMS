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
		@NamedStoredProcedureQuery(name = "upWeb_GetAccessUser", procedureName = "dbo.upWeb_GetAccessUser", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserID", type = Integer.class) }, resultClasses = UserManager.class) })
@Entity
public class UserManager {
	@Id
	@Column(name="userid")
	private Integer userID;

	@Column(name = "active")
	private Boolean active;

	@Column(name="useraccount")
	private String userAccout;

	@Column(name="userpassword")
	private String userPassword;

	@Column(name="username")
	private String userName;

	@Column(name="groupid")
	private Integer groupID;

	@Column(name="groupname")
	private String groupName;

	@Column(name="groupactive")
	private Boolean groupActive;

	@Column(name="createdon")
	private Date createdON;

	@Column(name="createdbyaccount")
	private String createdByAccount;

	@Column(name="modifiedon")
	private String modifiedOn;

	@Column(name="modifiedbyaccount")
	private String modifiedByAccount;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getUserAccout() {
		return userAccout;
	}

	public void setUserAccout(String userAccoutn) {
		this.userAccout = userAccoutn;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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

	public Boolean getGroupActive() {
		return groupActive;
	}

	public void setGroupActive(Boolean groupActive) {
		this.groupActive = groupActive;
	}

	public Date getCreatedON() {
		return createdON;
	}

	public void setCreatedON(Date createdON) {
		this.createdON = createdON;
	}

	public String getCreatedByAccount() {
		return createdByAccount;
	}

	public void setCreatedByAccount(String createdByAccount) {
		this.createdByAccount = createdByAccount;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedByAccount() {
		return modifiedByAccount;
	}

	public void setModifiedByAccount(String modifiedByAccount) {
		this.modifiedByAccount = modifiedByAccount;
	}

}