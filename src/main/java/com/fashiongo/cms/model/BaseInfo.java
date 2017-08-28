package com.fashiongo.cms.model;

import java.util.List;

public class BaseInfo {
	private List<GroupManager> menuList;
	private List<CategoryList> categoryList;
	
	public List<GroupManager> getMenuList() {
		return menuList;
	}
	
	public void setMenuList(List<GroupManager> menuList) {
		this.menuList = menuList;
	}
	
	public List<CategoryList> getCategoryList() {
		return categoryList;
	}
	
	public void setCategoryList(List<CategoryList> categoryList) {
		this.categoryList = categoryList;
	}
}
