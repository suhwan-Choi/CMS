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
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserID", type = Integer.class) }, resultClasses = UserManager.class),
		
		@NamedStoredProcedureQuery(name = "upWeb_CreateModifyAccessUser", procedureName = "dbo.upWeb_CreateModifyAccessUser", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserAccount", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserPassword", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserName", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserDescription", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedOn", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class)

		}),
		
		@NamedStoredProcedureQuery(name = "upWeb_RemoveAccessUser", procedureName = "dbo.upWeb_RemoveAccessUser", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedOn", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class) }) 
		})
@Entity
public class UserManager {
	@Id
	@Column(name = "userid")
	private Integer userID;

	@Column(name = "active")
	private Boolean active;
	
	@Column(name = "userdescription")
	private String userDescription;

	@Column(name = "useraccount")
	private String userAccount;

	@Column(name = "userpassword")
	private String userPassword;

	@Column(name = "username")
	private String userName;

	@Column(name = "groupid")
	private Integer groupID;

	@Column(name = "groupname")
	private String groupName;

	@Column(name = "groupactive")
	private Boolean groupActive;

	@Column(name = "createdon")
	private Date createdOn;

	@Column(name = "createdbyaccount")
	private String createdByAccount;

	@Column(name = "modifiedon")
	private Date modifiedOn;

	@Column(name = "modifiedbyaccount")
	private String modifiedByAccount;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getActive() {
		return String.valueOf(active);
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getUserDescription() {
		return userDescription;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
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

}
