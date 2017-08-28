package com.fashiongo.cms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "upWeb_ComboCategory", procedureName = "dbo.upWeb_ComboCategory", resultClasses = com.fashiongo.cms.model.CategoryList.class)
})
@Entity
public class CategoryList{
	@Id
	@Column(name = "categoryid")
	private Integer categoryID;
	
	@Column(name = "categoryname")
	private String categoryName;
	
	@Column(name = "lvl")
	private Integer lvl;
	
	@Column(name = "listorder")
	private Integer listOrder;

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
}