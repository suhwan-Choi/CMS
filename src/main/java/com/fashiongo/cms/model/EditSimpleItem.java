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
	@NamedStoredProcedureQuery(name = "upWeb_GetEditItemSimpleList", procedureName = "dbo.upWeb_GetEditItemList", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),	
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "LengthID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "StyleID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "PatternID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "FabricID", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchDateType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchStartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchEndDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Status", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ViewType", type = Integer.class)
	}, resultClasses = com.fashiongo.cms.model.EditSimpleItem.class)
})

@Entity
public class EditSimpleItem {
	
	@Id
	@Column(name = "seq")
	private Integer seq;
	
	@Column(name = "productid")
	private Integer productID;
	
	@Column(name = "active")
	private Boolean active;
	
	@Column(name = "imageurlroot")
	private String imageUrlRoot;
	
	@Column(name = "dirname")
	private String dirName;
	
	@Column(name = "imagename")
	private String imageName;
	
	@Column(name = "itemname")
	private String itemName;
	
	@Column(name = "cmsitemname")
	private String cmsItemName;
	
	@Column(name = "productname")
	private String productName;
	
	@Column(name = "companyname")
	private String companyName;
	
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
	
	@Column(name = "searchkeyword")
	private String searchKeyword;
	
	@Column(name = "productdescription")
	private String productDescription;
	
	@Column(name = "fabricdescription")
	private String fabricDescription;
	
	@Column(name = "sharedproductseq")
	private Integer sharedProductSeq;
	
	@Column(name = "edit_cmsitemname")
	private String edit_CmsItemName;
	
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
	
	@Column(name = "edit_searchkeyword")
	private String edit_SearchKeyword;
	
	@Column(name = "workstatus")
	private Integer workStatus;
	
	@Column(name = "approvalstatus")
	private Integer approvalStatus;
	
	@Column(name = "appliedstatus")
	private Integer appliedStatus;
	
	@Column(name = "totalcount")
	private Integer totalCount;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getFabricDescription() {
		return fabricDescription;
	}

	public void setFabricDescription(String fabricDescription) {
		this.fabricDescription = fabricDescription;
	}

	public Integer getSharedProductSeq() {
		return sharedProductSeq;
	}

	public void setSharedProductSeq(Integer sharedProductSeq) {
		this.sharedProductSeq = sharedProductSeq;
	}

	public String getEdit_CmsItemName() {
		return edit_CmsItemName;
	}

	public void setEdit_CmsItemName(String edit_CmsItemName) {
		this.edit_CmsItemName = edit_CmsItemName;
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

	public String getEdit_SearchKeyword() {
		return edit_SearchKeyword;
	}

	public void setEdit_SearchKeyword(String edit_SearchKeyword) {
		this.edit_SearchKeyword = edit_SearchKeyword;
	}

	public Integer getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(Integer workStatus) {
		this.workStatus = workStatus;
	}

	public Integer getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(Integer approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public Integer getAppliedStatus() {
		return appliedStatus;
	}

	public void setAppliedStatus(Integer appliedStatus) {
		this.appliedStatus = appliedStatus;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}
