package com.fashiongo.cms.model;

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
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Permission", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class), }),
		@NamedStoredProcedureQuery(name = "upWeb_ModifyAccessGroup", procedureName = "dbo.upWeb_ModifyAccessGroup", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupName", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupDescription", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Permission", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class) }),
		@NamedStoredProcedureQuery(name = "upWeb_RemoveAccessGroup", procedureName = "dbo.upWeb_RemoveAccessGroup", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class) }) })
@Entity
public class GroupManagerList {
	@Id
	@Column(name = "seq")
	private Integer seq;

	@Column(name = "groupid")
	private Integer groupID;

	@Column(name = "groupname")
	private String groupName;

	@Column(name = "active")
	private Boolean groupActive;

	@Column(name = "groupdescription")
	private String groupDescription;

	@Column(name = "totalcount")
	private Integer totalCount;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getGroupID() {
		return groupID;
	}

	public void setGroupID(Integer groupId) {
		this.groupID = groupId;
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

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

}
