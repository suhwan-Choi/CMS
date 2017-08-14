package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "upWeb_ComboAccessGroup", procedureName = "dbo.upWeb_ComboAccessGroup", resultClasses = ComboAccessGroup.class)
})

@Entity
public class ComboAccessGroup {
	
	@Id
	@Column(name = "groupid")
	private Integer groupID;

	@Column(name = "groupname")
	private String groupName;

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
}
