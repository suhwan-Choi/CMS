package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "upWeb_GetGuideCategoryList", procedureName = "dbo.upWeb_GetGuideCategoryList", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
				 }, resultClasses = GuideCategory.class) })
@Entity
public class GuideCategory {
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

	@Column(name = "mapid")
	private Integer mapID;

	@Column(name = "imagename")
	private String imageName;

	@Column(name = "descriptionkor")
	private String descriptionKor;

	@Column(name = "descriptioneng")
	private String descriptionEng;

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

	public Integer getMapID() {
		return mapID;
	}

	public void setMapID(Integer mapID) {
		this.mapID = mapID;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
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

}
