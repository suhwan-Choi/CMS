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
	@NamedStoredProcedureQuery(name = "upWeb_GetNewItemList", procedureName = "dbo.upWeb_GetNewItemList", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID1", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID2", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID3", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchDateType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchStartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchEndDate", type = Date.class)
			}, resultClasses = com.fashiongo.cms.model.NewItemList.class)
})
@Entity
public class NewItemList{
	@Id
	@Column(name = "seq")
	private Integer seq;

    @Column(name = "productid")
    private Integer productID;
    
    @Column(name = "imageurlroot")
    private String imageUrlRoot;
    
    public String getDirName() {
		return dirName;
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	@Column(name = "dirname")
    private String dirName;
    
    @Column(name = "imagename")
    private String imageName;
    
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public Date getActivatedOn() {
		return activatedOn;
	}

	public void setActivatedOn(Date activatedOn) {
		this.activatedOn = activatedOn;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	@Column(name = "itemname")
    private String itemName;
    
    @Column(name = "productname")
    private String productName;
    
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
    
    @Column(name = "vendorcategoryname")
    private String vendorCategoryName;
    
    public String getVendorCategoryName() {
		return vendorCategoryName;
	}

	public void setVendorCategoryName(String vendorCategoryName) {
		this.vendorCategoryName = vendorCategoryName;
	}

	@Column(name = "activatedon")
    private Date activatedOn;

    @Column(name = "totalcount")
    private Integer totalCount;
   
}