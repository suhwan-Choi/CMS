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
	@NamedStoredProcedureQuery(name = "upWeb_GetEditItemList", procedureName = "dbo.upWeb_GetEditItemList", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchStartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchEndDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Status", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID1", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID2", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID3", type = Integer.class)
	}, resultClasses = com.fashiongo.cms.model.EditItem.class),
	
	@NamedStoredProcedureQuery(name = "upWeb_GetEditItem", procedureName = "dbo.upWeb_GetEditItem", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SharedProductSeq", type = Integer.class)
	}, resultClasses = com.fashiongo.cms.model.EditItem.class),
	
	@NamedStoredProcedureQuery(name = "upWeb_ModifyEditItem", procedureName = "dbo.upWeb_ModifyEditItem", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "RoIeIDofWorked", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SessionKey", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SharedProductSeq", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ItemName", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ParentCategoryID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ParentParentCategoryID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "LengthID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "StyleID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "PatternID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "FabricID", type = Integer.class),	
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchKeyword", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "HashTag", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class)
	}),
	
	@NamedStoredProcedureQuery(name = "upWeb_CreateRollbackRequest", procedureName = "dbo.upWeb_CreateRollbackRequest", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SessionKey", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Reason", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "RollbackList", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class)
	})
})

@Entity
public class EditItem {
	
	@Id
	@Column(name = "seq")
	private Integer seq;
	
	@Column(name = "sharedproductseq")
	private Integer sharedProductSeq;
	
	@Column(name = "productid")
	private Integer productID;
	
	@Column(name = "imageurlroot")
	private String imageUrlRoot;
	
	@Column(name = "dirname")
	private String dirName;
	
	@Column(name = "imagename")
	private String imageName;
	
	@Column(name = "active")
	private Boolean active;
	
	@Column(name = "activatedon")
	private Date activatedOn;
	
	@Column(name = "itemname")
	private String itemName;
	
	@Column(name = "cmsitemname")
	private String cmsItemName;
	
	@Column(name = "productname")
	private String productName;
	
	@Column(name = "vendorcategoryid")
	private Integer vendorCategoryID;
	
	@Column(name = "vendorcategoryname")
	private String vendorCategoryName;
	
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
	
	@Column(name = "packid")
	private Integer packID;
	
	@Column(name = "packname")
	private String packName;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "sizeid")
	private Integer sizeID;
	
	@Column(name = "sizename")
	private String sizeName;
	
	@Column(name = "fabricdescription")
	private String fabricDescription;
	
	@Column(name = "searchkeyword")
	private String searchKeyword;
	
	@Column(name = "madein")
	private String madeIn;
	
	@Column(name = "labeltypeid")
	private Integer labelTypeID;
	
	@Column(name = "labeltypename")
	private String labelTypeName;
	
	@Column(name = "stockavailability")
	private String stockAvailability;
	
	@Column(name = "productdescription")
	private String productDescription;
	
	@Column(name = "bodysizeid")
	private Integer bodySizeID;
	
	@Column(name = "lengthid")
	private Integer lengthID;
	
	@Column(name = "styleid")
	private Integer styleID;
	
	@Column(name = "patternid")
	private Integer patternID;
	
	@Column(name = "fabricid")
	private Integer fabricID;
	
	@Column(name = "hashtag1")
	private String hashtag1;
	
	@Column(name = "hashtag2")
	private String hashtag2;
	
	@Column(name = "hashtag3")
	private String hashtag3;
	
	@Column(name = "hashtag4")
	private String hashtag4;
	
	@Column(name = "hashtag5")
	private String hashtag5;
	
	@Column(name = "edit_itemname")
	private String edit_ItemName;
	
	@Column(name = "edit_categoryid1")
	private Integer edit_CategoryID1;
	
	@Column(name = "edit_categoryname1")
	private String edit_CategoryName1;
	
	@Column(name = "edit_categoryid2")
	private Integer edit_CategoryID2;
	
	@Column(name = "edit_categoryname2")
	private String edit_CategoryName2;
	
	@Column(name = "edit_categoryid3")
	private Integer edit_CategoryID3;
	
	@Column(name = "edit_categoryname3")
	private String edit_CategoryName3;
	
	@Column(name = "edit_lengthid")
	private Integer edit_LengthID;
	
	@Column(name = "edit_styleid")
	private Integer edit_StyleID;
	
	@Column(name = "edit_patternid")
	private Integer edit_PatternID;
	
	@Column(name = "edit_fabricid")
	private Integer edit_FabricID;
	
	@Column(name = "edit_searchkeyword")
	private String edit_SearchKeyword;
	
	@Column(name = "edit_hashtag1")
	private String edit_Hashtag1;
	
	@Column(name = "edit_hashtag2")
	private String edit_Hashtag2;
	
	@Column(name = "edit_hashtag3")
	private String edit_Hashtag3;
	
	@Column(name = "edit_hashtag4")
	private String edit_Hashtag4;
	
	@Column(name = "edit_hashtag5")
	private String edit_Hashtag5;
	
	@Column(name = "assignedon")
	private Date assignedOn;
	
	@Column(name = "assignedbyname")
	private String assignedByName;
	
	@Column(name = "lasteditedon")
	private Date lastEditedOn;
	
	@Column(name = "editedbyname")
	private String editedByName;
	
	@Column(name = "approvalon")
	private Date approvalOn;
	
	@Column(name = "approvalbyname")
	private String approvalByName;
	
	@Column(name = "workstatus")
	private Integer workStatus;
	
	@Column(name = "totalcount")
	private Integer totalCount;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getSharedProductSeq() {
		return sharedProductSeq;
	}

	public void setSharedProductSeq(Integer sharedProductSeq) {
		this.sharedProductSeq = sharedProductSeq;
	}

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public String getImageUrlRoot() {
		return imageUrlRoot;
	}

	public void setImageUrlRoot(String imageUrlRoot) {
		this.imageUrlRoot = imageUrlRoot;
	}

	public String getDirName() {
		return dirName;
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getActivatedOn() {
		return activatedOn;
	}

	public void setActivatedOn(Date activatedOn) {
		this.activatedOn = activatedOn;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCmsItemName() {
		return cmsItemName;
	}

	public void setCmsItemName(String cmsItemName) {
		this.cmsItemName = cmsItemName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getVendorCategoryID() {
		return vendorCategoryID;
	}

	public void setVendorCategoryID(Integer vendorCategoryID) {
		this.vendorCategoryID = vendorCategoryID;
	}

	public String getVendorCategoryName() {
		return vendorCategoryName;
	}

	public void setVendorCategoryName(String vendorCategoryName) {
		this.vendorCategoryName = vendorCategoryName;
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

	public Integer getPackID() {
		return packID;
	}

	public void setPackID(Integer packID) {
		this.packID = packID;
	}

	public String getPackName() {
		return packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSizeID() {
		return sizeID;
	}

	public void setSizeID(Integer sizeID) {
		this.sizeID = sizeID;
	}

	public String getSizeName() {
		return sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}

	public String getFabricDescription() {
		return fabricDescription;
	}

	public void setFabricDescription(String fabricDescription) {
		this.fabricDescription = fabricDescription;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public Integer getLabelTypeID() {
		return labelTypeID;
	}

	public void setLabelTypeID(Integer labelTypeID) {
		this.labelTypeID = labelTypeID;
	}

	public String getLabelTypeName() {
		return labelTypeName;
	}

	public void setLabelTypeName(String labelTypeName) {
		this.labelTypeName = labelTypeName;
	}

	public String getStockAvailability() {
		return stockAvailability;
	}

	public void setStockAvailability(String stockAvailability) {
		this.stockAvailability = stockAvailability;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getBodySizeID() {
		return bodySizeID;
	}

	public void setBodySizeID(Integer bodySizeID) {
		this.bodySizeID = bodySizeID;
	}

	public Integer getLengthID() {
		return lengthID;
	}

	public void setLengthID(Integer lengthID) {
		this.lengthID = lengthID;
	}

	public Integer getStyleID() {
		return styleID;
	}

	public void setStyleID(Integer styleID) {
		this.styleID = styleID;
	}

	public Integer getPatternID() {
		return patternID;
	}

	public void setPatternID(Integer patternID) {
		this.patternID = patternID;
	}

	public Integer getFabricID() {
		return fabricID;
	}

	public void setFabricID(Integer fabricID) {
		this.fabricID = fabricID;
	}

	public String getHashtag1() {
		return hashtag1;
	}

	public void setHashtag1(String hashtag1) {
		this.hashtag1 = hashtag1;
	}

	public String getHashtag2() {
		return hashtag2;
	}

	public void setHashtag2(String hashtag2) {
		this.hashtag2 = hashtag2;
	}

	public String getHashtag3() {
		return hashtag3;
	}

	public void setHashtag3(String hashtag3) {
		this.hashtag3 = hashtag3;
	}

	public String getHashtag4() {
		return hashtag4;
	}

	public void setHashtag4(String hashtag4) {
		this.hashtag4 = hashtag4;
	}

	public String getHashtag5() {
		return hashtag5;
	}

	public void setHashtag5(String hashtag5) {
		this.hashtag5 = hashtag5;
	}

	public String getEdit_ItemName() {
		return edit_ItemName;
	}

	public void setEdit_ItemName(String edit_ItemName) {
		this.edit_ItemName = edit_ItemName;
	}

	public Integer getEdit_CategoryID1() {
		return edit_CategoryID1;
	}

	public void setEdit_CategoryID1(Integer edit_CategoryID1) {
		this.edit_CategoryID1 = edit_CategoryID1;
	}

	public String getEdit_CategoryName1() {
		return edit_CategoryName1;
	}

	public void setEdit_CategoryName1(String edit_CategoryName1) {
		this.edit_CategoryName1 = edit_CategoryName1;
	}

	public Integer getEdit_CategoryID2() {
		return edit_CategoryID2;
	}

	public void setEdit_CategoryID2(Integer edit_CategoryID2) {
		this.edit_CategoryID2 = edit_CategoryID2;
	}

	public String getEdit_CategoryName2() {
		return edit_CategoryName2;
	}

	public void setEdit_CategoryName2(String edit_CategoryName2) {
		this.edit_CategoryName2 = edit_CategoryName2;
	}

	public Integer getEdit_CategoryID3() {
		return edit_CategoryID3;
	}

	public void setEdit_CategoryID3(Integer edit_CategoryID3) {
		this.edit_CategoryID3 = edit_CategoryID3;
	}

	public String getEdit_CategoryName3() {
		return edit_CategoryName3;
	}

	public void setEdit_CategoryName3(String edit_CategoryName3) {
		this.edit_CategoryName3 = edit_CategoryName3;
	}

	public Integer getEdit_LengthID() {
		return edit_LengthID;
	}

	public void setEdit_LengthID(Integer edit_LengthID) {
		this.edit_LengthID = edit_LengthID;
	}

	public Integer getEdit_StyleID() {
		return edit_StyleID;
	}

	public void setEdit_StyleID(Integer edit_StyleID) {
		this.edit_StyleID = edit_StyleID;
	}

	public Integer getEdit_PatternID() {
		return edit_PatternID;
	}

	public void setEdit_PatternID(Integer edit_PatternID) {
		this.edit_PatternID = edit_PatternID;
	}

	public Integer getEdit_FabricID() {
		return edit_FabricID;
	}

	public void setEdit_FabricID(Integer edit_FabricID) {
		this.edit_FabricID = edit_FabricID;
	}

	public String getEdit_SearchKeyword() {
		return edit_SearchKeyword;
	}

	public void setEdit_SearchKeyword(String edit_SearchKeyword) {
		this.edit_SearchKeyword = edit_SearchKeyword;
	}

	public String getEdit_Hashtag1() {
		return edit_Hashtag1;
	}

	public void setEdit_Hashtag1(String edit_Hashtag1) {
		this.edit_Hashtag1 = edit_Hashtag1;
	}

	public String getEdit_Hashtag2() {
		return edit_Hashtag2;
	}

	public void setEdit_Hashtag2(String edit_Hashtag2) {
		this.edit_Hashtag2 = edit_Hashtag2;
	}

	public String getEdit_Hashtag3() {
		return edit_Hashtag3;
	}

	public void setEdit_Hashtag3(String edit_Hashtag3) {
		this.edit_Hashtag3 = edit_Hashtag3;
	}

	public String getEdit_Hashtag4() {
		return edit_Hashtag4;
	}

	public void setEdit_Hashtag4(String edit_Hashtag4) {
		this.edit_Hashtag4 = edit_Hashtag4;
	}

	public String getEdit_Hashtag5() {
		return edit_Hashtag5;
	}

	public void setEdit_Hashtag5(String edit_Hashtag5) {
		this.edit_Hashtag5 = edit_Hashtag5;
	}

	public Date getAssignedOn() {
		return assignedOn;
	}

	public void setAssignedOn(Date assignedOn) {
		this.assignedOn = assignedOn;
	}

	public String getAssignedByName() {
		return assignedByName;
	}

	public void setAssignedByName(String assignedByName) {
		this.assignedByName = assignedByName;
	}

	public Date getLastEditedOn() {
		return lastEditedOn;
	}

	public void setLastEditedOn(Date lastEditedOn) {
		this.lastEditedOn = lastEditedOn;
	}

	public String getEditedByName() {
		return editedByName;
	}

	public void setEditedByName(String editedByName) {
		this.editedByName = editedByName;
	}

	public Date getApprovalOn() {
		return approvalOn;
	}

	public void setApprovalOn(Date approvalOn) {
		this.approvalOn = approvalOn;
	}

	public String getApprovalByName() {
		return approvalByName;
	}

	public void setApprovalByName(String approvalByName) {
		this.approvalByName = approvalByName;
	}

	public Integer getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(Integer workStatus) {
		this.workStatus = workStatus;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}
