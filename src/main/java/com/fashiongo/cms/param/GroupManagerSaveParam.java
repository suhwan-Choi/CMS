package com.fashiongo.cms.param;

import java.util.Date;

public class GroupManagerSaveParam {
	private Integer groupId;
	private String groupName;
	private Boolean active;
	private String groupDescription;
	private Integer createdBy;
	private Integer workedBy;
	private String permission;

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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getWorkedBy() {
		return workedBy;
	}

	public void setWorkedBy(Integer workedBy) {
		this.workedBy = workedBy;
	}

	public String getPermission() {
		return permission.replaceAll("\'", "\\\"");
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
