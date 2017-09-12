package com.fashiongo.cms.param;

public class GroupManagerListParam {
	private String groupName;
	private Boolean active;
	private Integer ps;
	private Integer pn;
	private Integer groupRoleType;

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

	public Integer getPs() {
		return ps;
	}

	public void setPs(Integer ps) {
		this.ps = ps;
	}

	public Integer getPn() {
		return pn;
	}

	public void setPn(Integer pn) {
		this.pn = pn;
	}

	public Integer getGroupRoleType() {
		return groupRoleType;
	}

	public void setGroupRoleType(Integer groupRoleType) {
		this.groupRoleType = groupRoleType;
	}

	
}
