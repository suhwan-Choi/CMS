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
		@NamedStoredProcedureQuery(name = "upWeb_GetAccessGroupList", procedureName = "dbo.upWeb_GetAccessGroupList", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupName", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class) }, resultClasses = com.fashiongo.cms.model.GroupManagerList.class),
		@NamedStoredProcedureQuery(name = "upWeb_CreateAccessGroup", procedureName = "dbo.upWeb_CreateAccessGroup", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupName", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupDescription", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedOn", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Permission", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class), }),
		@NamedStoredProcedureQuery(name = "upWeb_ModifyAccessGroup", procedureName = "dbo.upWeb_ModifyAccessGroup", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupId", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupName", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupDescription", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedOn", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Permission", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class) }),
		@NamedStoredProcedureQuery(name = "upWeb_RemoveAccessGroup", procedureName = "dbo.upWeb_RemoveAccessGroup", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupId", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class) }) })
@Entity
public class GroupManagerList {
	@Id
	@Column(name = "groupid")
	private Integer groupId;

	@Column(name = "groupname", nullable = true)
	private String groupName;

	@Column(name = "active", nullable = true)
	private Boolean groupActive;

	@Column(name = "groupdescription")
	private String groupDescription;

	@Column(name = "totalcount")
	private Integer totalcount;

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

	public Boolean getGroupActive() {
		return groupActive;
	}

	public void setGroupActive(Boolean groupActive) {
		this.groupActive = groupActive;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public Integer getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}

}
