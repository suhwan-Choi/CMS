package com.fashiongo.cms.param;

public class GuideAttributeListParam {
	private Integer attributeTypeID;

	private Integer attributeID;

	private Integer categoryID;

	private String keywordType;

	private String keywordText = "";

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

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getKeywordType() {
		return keywordType;
	}

	public void setKeywordType(String keywordType) {
		this.keywordType = keywordType;
	}

	public String getKeywordText() {
		return keywordText;
	}

	public void setKeywordText(String keywordText) {
		this.keywordText = keywordText;
	}

}
