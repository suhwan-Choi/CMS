package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(name = "upWeb_GetAccessGroup", procedureName = "dbo.upWeb_GetAccessGroup", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupId", type = Integer.class) }, resultClasses = com.fashiongo.cms.model.GroupManager.class)
@Entity
public class GroupManager {
	@Id
	@Column(name = "groupid")
	protected Integer groupId;

	@Column(name = "groupname", nullable = true)
	protected String groupName;

	@Column(name = "active", nullable = true)
	protected Boolean groupActive;

	@Column(name = "groupdescription")
	protected String groupDescription;

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

}
