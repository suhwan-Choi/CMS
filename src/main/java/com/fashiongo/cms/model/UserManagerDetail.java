package com.fashiongo.cms.model;

import java.util.List;

public class UserManagerDetail {
	private UserManager userDetail;
	private List<ComboAccessGroup> comboGroup;
	
	public UserManager getUserDetail() {
		return userDetail;
	}
	
	public void setUserDetail(UserManager userDetail) {
		this.userDetail = userDetail;
	}

	public List<ComboAccessGroup> getComboGroup() {
		return comboGroup;
	}

	public void setComboGroup(List<ComboAccessGroup> comboGroup) {
		this.comboGroup = comboGroup;
	}
}
