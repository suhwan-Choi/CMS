package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "upWeb_GetGuideUpdateList", procedureName = "dbo.upWeb_GetGuideUpdateList", resultClasses = GuideUpdate.class) })
@Entity
public class GuideUpdate {
	@Id
	@Column(name = "seq")
	private Integer seq;

	@Column(name = "categoryid1")
	private Integer categoryID1;

	@Column(name = "categoryname1")
	private String categoryName1;

	@Column(name = "categoryid2")
	private Integer categoryID2;

	@Column(name = "categoryname2")
	private String categoryName2;

	@Column(name = "categoryid3")
	private Integer categoryID3;

	@Column(name = "categoryname3")
	private String categoryName3;

	@Column(name = "attributetype")
	private String attributeType;

	@Column(name = "attributetypeid")
	private Integer attributeTypeID;

	@Column(name = "attributename")
	private String attributeName;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getCategoryID1() {
		return categoryID1;
	}

	public void setCategoryID1(Integer categoryID1) {
		this.categoryID1 = categoryID1;
	}

	public String getCategoryName1() {
		return categoryName1;
	}

	public void setCategoryName1(String categoryName1) {
		this.categoryName1 = categoryName1;
	}

	public Integer getCategoryID2() {
		return categoryID2;
	}

	public void setCategoryID2(Integer categoryID2) {
		this.categoryID2 = categoryID2;
	}

	public String getCategoryName2() {
		return categoryName2;
	}

	public void setCategoryName2(String categoryName2) {
		this.categoryName2 = categoryName2;
	}

	public Integer getCategoryID3() {
		return categoryID3;
	}

	public void setCategoryID3(Integer categoryID3) {
		this.categoryID3 = categoryID3;
	}

	public String getCategoryName3() {
		return categoryName3;
	}

	public void setCategoryName3(String categoryName3) {
		this.categoryName3 = categoryName3;
	}

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public Integer getAttributeTypeID() {
		return attributeTypeID;
	}

	public void setAttributeTypeID(Integer attributeTypeID) {
		this.attributeTypeID = attributeTypeID;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

}
