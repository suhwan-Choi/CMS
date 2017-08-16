package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQuery(name = "upWeb_GetAccessGroup", procedureName = "dbo.upWeb_GetAccessGroup", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupID", type = Integer.class) }, resultClasses = com.fashiongo.cms.model.GroupManager.class)
@Entity
public class GroupManager {
	@Id
	@Column(name = "groupid")
	protected Integer groupID;

	@Column(name = "groupname")
	protected String groupName;

	@Column(name = "active")
	protected Boolean groupActive;

	@Column(name = "groupdescription")
	protected String groupDescription;

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

}
