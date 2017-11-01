package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "upWeb_GetGuideAttributeList", procedureName = "dbo.upWeb_GetGuideAttributeList", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "AttributeTypeID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "AttributeID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class) }, resultClasses = GuideAttribute.class) })
@Entity
public class GuideAttribute {
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

	@Column(name = "attributetype")
	private String attributeType;

	@Column(name = "attributetypeid")
	private Integer attributeTypeID;

	@Column(name = "attributeid")
	private Integer attributeID;

	@Column(name = "attributename")
	private String attributeName;

	@Column(name = "imagename")
	private String ImageName;

	@Column(name = "imagecnt")
	private Integer imageCnt;

	@Column(name = "descriptionkor")
	private String descriptionKor;

	@Column(name = "descriptioneng")
	private String descriptionEng;

	@Column(name = "totalcount")
	private Integer totalCount;

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

	public Integer getAttributeID() {
		return attributeID;
	}

	public void setAttributeID(Integer attributeID) {
		this.attributeID = attributeID;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getImageName() {
		return ImageName;
	}

	public void setImageName(String imageName) {
		ImageName = imageName;
	}

	public Integer getImageCnt() {
		return imageCnt;
	}

	public void setImageCnt(Integer imageCnt) {
		this.imageCnt = imageCnt;
	}

	public String getDescriptionKor() {
		return descriptionKor;
	}

	public void setDescriptionKor(String descriptionKor) {
		this.descriptionKor = descriptionKor;
	}

	public String getDescriptionEng() {
		return descriptionEng;
	}

	public void setDescriptionEng(String descriptionEng) {
		this.descriptionEng = descriptionEng;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

}
