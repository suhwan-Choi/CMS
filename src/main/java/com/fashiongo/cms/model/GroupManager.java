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
	@Column(name = "groupid")
	protected Integer groupID;

	@Column(name = "groupname")
	protected String groupName;

	@Column(name = "active")
	protected Boolean groupActive;

	@Column(name = "groupdescription")
	protected String groupDescription;

	@Id
	@Column(name = "menuid")
	private Integer menuID;
	@Column(name = "menuname")
	private String menuName;

	@Column(name = "parentmenuid")
	private Integer parentMenuID;

	@Column(name = "lvl")
	private Integer lvl;

	@Column(name = "listorder")
	private Integer listOrder;

	@Column(name = "allowview")
	private Boolean allowView;

	@Column(name = "allowedit")
	private Boolean allowEdit;

	@Column(name = "allowadd")
	private Boolean allowAdd;

	@Column(name = "allowdelete")
	private Boolean allowDelete;

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

	public String getGroupActive() {
		return String.valueOf(groupActive);
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


	public Integer getMenuID() {
		return menuID;
	}

	public void setMenuID(Integer menuID) {
		this.menuID = menuID;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Integer getParentMenuID() {
		return parentMenuID;
	}

	public void setParentMenuID(Integer parentMenuID) {
		this.parentMenuID = parentMenuID;
	}

	public Integer getLvl() {
		return lvl;
	}

	public void setLvl(Integer lvl) {
		this.lvl = lvl;
	}

	public Integer getListOrder() {
		return listOrder;
	}

	public void setListOrder(Integer listOrder) {
		this.listOrder = listOrder;
	}

	public void setAllowEdit(Boolean allowEdit) {
		this.allowEdit = allowEdit;
	}

	public void setAllowAdd(Boolean allowAdd) {
		this.allowAdd = allowAdd;
	}

	public void setAllowView(Boolean allowView) {
		this.allowView = allowView;
	}

	public void setAllowDelete(Boolean allowDelete) {
		this.allowDelete = allowDelete;
	}

	public Boolean getAllowView() {
		return allowView;
	}

	public Boolean getAllowEdit() {
		return allowEdit;
	}

	public Boolean getAllowAdd() {
		return allowAdd;
	}

	public Boolean getAllowDelete() {
		return allowDelete;
	}
}
