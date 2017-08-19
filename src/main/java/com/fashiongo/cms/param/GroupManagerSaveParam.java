package com.fashiongo.cms.param;

public class GroupManagerSaveParam {
	private Integer groupID;
	private String groupName;
	private Boolean active;
	private String groupDescription;
	private Integer workedBy;
	private String permission;

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
