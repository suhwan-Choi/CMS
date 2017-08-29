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
	@NamedStoredProcedureQuery(name = "upWeb_GetItemDetail", procedureName = "dbo.upWeb_GetItemDetail", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ProductID", type = Integer.class) }, resultClasses = NewItem.class)  
	})
@Entity
public class NewItem{
	@Id
	@Column(name = "productid")
    private Integer productID;
    
    @Column(name = "imageurlroot")
    private String imageUrlRoot;
    
    @Column(name = "dirname")
    private String dirName;
    
    @Column(name = "imagename")
    private String imageName;
    
    public String getDirName() {
		return dirName;
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	@Column(name = "active")
    private String active;
    
    @Column(name = "activatedon")
    private String activatedOn;
    
    @Column(name = "itemname")
    private String ItemName;
    
    @Column(name = "productname")
    private String productName;
    
    @Column(name = "vendorcategoryid")
    private String vendorCategoryID;
    
    @Column(name = "vendorcategoryname")
    private String vendorCategoryName;
    
    @Column(name = "categoryid1")
    private String categoryID1;
    
    @Column(name = "categoryname1")
    private String categoryName1;
    
    @Column(name = "categoryid2")
    private String categoryID2;
    
    @Column(name = "categoryname2")
    private String categoryName2;
    
    @Column(name = "categoryid3")
    private String categoryID3;
    
    @Column(name = "lengthname")
    private String lengthName;
    
    @Column(name = "stylename")
    private String styleName;
    
    public String getFabricName() {
		return fabricName;
	}

	public void setFabricName(String fabricName) {
		this.fabricName = fabricName;
	}

	@Column(name = "fabricname")
    private String fabricName;
    
    @Column(name = "hashtag1")
    private String hashTag1;
    
    @Column(name = "hashtag2")
    private String hashTag2;
    
    public String getLengthName() {
		return lengthName;
	}

	public void setLengthName(String lengthName) {
		this.lengthName = lengthName;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public String getHashTag1() {
		return hashTag1;
	}

	public void setHashTag1(String hashTag1) {
		this.hashTag1 = hashTag1;
	}

	public String getHashTag2() {
		return hashTag2;
	}

	public void setHashTag2(String hashTag2) {
		this.hashTag2 = hashTag2;
	}

	public String getHashTag3() {
		return hashTag3;
	}

	public void setHashTag3(String hashTag3) {
		this.hashTag3 = hashTag3;
	}

	public String getHashTag4() {
		return hashTag4;
	}

	public void setHashTag4(String hashTag4) {
		this.hashTag4 = hashTag4;
	}

	public String getHashTag5() {
		return hashTag5;
	}

	public void setHashTag5(String hashTag5) {
		this.hashTag5 = hashTag5;
	}

	@Column(name = "hashtag3")
    private String hashTag3;
    
    @Column(name = "hashtag4")
    private String hashTag4;
    
    @Column(name = "hashtag5")
    private String hashTag5;
    
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

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getActivatedOn() {
		return activatedOn;
	}

	public void setActivatedOn(String activatedOn) {
		this.activatedOn = activatedOn;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getVendorCategoryID() {
		return vendorCategoryID;
	}

	public void setVendorCategoryID(String vendorCategoryID) {
		this.vendorCategoryID = vendorCategoryID;
	}

	public String getVendorCategoryName() {
		return vendorCategoryName;
	}

	public void setVendorCategoryName(String vendorCategoryName) {
		this.vendorCategoryName = vendorCategoryName;
	}

	public String getCategoryID1() {
		return categoryID1;
	}

	public void setCategoryID1(String categoryID1) {
		this.categoryID1 = categoryID1;
	}

	public String getCategoryName1() {
		return categoryName1;
	}

	public void setCategoryName1(String categoryName1) {
		this.categoryName1 = categoryName1;
	}

	public String getCategoryID2() {
		return categoryID2;
	}

	public void setCategoryID2(String categoryID2) {
		this.categoryID2 = categoryID2;
	}

	public String getCategoryName2() {
		return categoryName2;
	}

	public void setCategoryName2(String categoryName2) {
		this.categoryName2 = categoryName2;
	}

	public String getCategoryID3() {
		return categoryID3;
	}

	public void setCategoryID3(String categoryID3) {
		this.categoryID3 = categoryID3;
	}

	public String getCategoryName3() {
		return categoryName3;
	}

	public void setCategoryName3(String categoryName3) {
		this.categoryName3 = categoryName3;
	}

	public String getPackID() {
		return packID;
	}

	public void setPackID(String packID) {
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

	public String getSizeID() {
		return sizeID;
	}

	public void setSizeID(String sizeID) {
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

	public String getSearchKeyWord() {
		return searchKeyWord;
	}

	public void setSearchKeyWord(String searchKeyWord) {
		this.searchKeyWord = searchKeyWord;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public String getLabelTypeID() {
		return labelTypeID;
	}

	public void setLabelTypeID(String labelTypeID) {
		this.labelTypeID = labelTypeID;
	}

	public String getLabelTypeName() {
		return labelTypeName;
	}

	public void setLabelTypeName(String labelTypeName) {
		this.labelTypeName = labelTypeName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getBodySizeID() {
		return bodySizeID;
	}

	public void setBodySizeID(String bodySizeID) {
		this.bodySizeID = bodySizeID;
	}

	public String getLengthID() {
		return lengthID;
	}

	public void setLengthID(String lengthID) {
		this.lengthID = lengthID;
	}

	public String getStyleID() {
		return styleID;
	}

	public void setStyleID(String styleID) {
		this.styleID = styleID;
	}

	public String getPatternID() {
		return patternID;
	}

	public void setPatternID(String patternID) {
		this.patternID = patternID;
	}

	public String getFabricID() {
		return fabricID;
	}

	public void setFabricID(String fabricID) {
		this.fabricID = fabricID;
	}

	@Column(name = "categoryname3")
    private String categoryName3;
    
    @Column(name = "packid")
    private String packID;
    
    @Column(name = "packname")
    private String packName;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "sizeid")
    private String sizeID;
    
    @Column(name = "sizename")
    private String sizeName;
    
    @Column(name = "fabricdescription")
    private String fabricDescription;
    
    @Column(name = "searchkeyword")
    private String searchKeyWord;
    
    @Column(name = "madein")
    private String madeIn;
    
    public String getStockAvailability() {
		return stockAvailability;
	}

	public void setStockAvailability(String stockAvailability) {
		this.stockAvailability = stockAvailability;
	}

	@Column(name = "labeltypeid")
    private String labelTypeID;
    
    @Column(name = "labeltypename")
    private String labelTypeName;
    
    @Column(name = "stockavailability")
    private String stockAvailability;
    
    @Column(name = "productdescription")
    private String productDescription;
    
    @Column(name = "bodysizeid")
    private String bodySizeID;
    
    @Column(name = "lengthid")
    private String lengthID;
    
    public String getPatternName() {
		return patternName;
	}

	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}

	@Column(name = "styleid")
    private String styleID;
    
    @Column(name = "patternid")
    private String patternID;
    
    @Column(name = "patternname")
    private String patternName;
    
    @Column(name = "fabricid")
    private String fabricID;
}