package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import lombok.Getter;
import lombok.Setter;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "upWeb_GetAccessGroupList", procedureName = "dbo.upWeb_GetAccessGroupList", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "GroupName", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "Active", type = Boolean.class) }, resultClasses = com.fashiongo.cms.model.GroupManager.class) })
@Entity
public class GroupManager {
	@Id
	@Setter
	@Getter
	@Column(name = "groupid")
	private Integer groupId;

	@Setter
	@Getter
	@Column(name = "groupname")
	private String groupName;

	@Setter
	@Getter
	@Column(name = "groupactive")
	private Boolean groupActive;

	@Setter
	@Getter
	@Column(name = "groupdescription")
	private String GroupDescription;
	// private DateTime

	@Setter
	@Getter
	@Column(name = "createdby")
	private Integer CreateBy;

	@Setter
	@Getter
	@Column(name = "modifiedby")
	private Integer ModifiedBy;

}
