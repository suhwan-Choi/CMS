package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Transient;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "upWeb_GetAccessGroupList", procedureName = "dbo.upWeb_GetAccessGroupList", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupName", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class) }, resultClasses = com.fashiongo.cms.model.GroupManager.class),
		@NamedStoredProcedureQuery(name = "upWeb_GetAccessGroup", procedureName = "dbo.upWeb_GetAccessGroup", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupId", type = Integer.class) }, resultClasses = com.fashiongo.cms.model.GroupManager.class)

})
@Entity
public class GroupManager {
	@Id
	@Column(name = "groupid")
	private Integer groupId;

	@Column(name = "groupname", nullable = true)
	private String groupName;

	@Column(name = "active", nullable = true)
	private Boolean groupActive;

	@Column(name = "groupdescription")
	private String groupDescription;

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

	// @Column(name = "createdby")
	// private Integer CreateBy;
	//
	// @Column(name = "modifiedby")
	// private Integer ModifiedBy;

}
