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
	@NamedStoredProcedureQuery(name = "upWeb_GetAssignItemDetailList", procedureName = "dbo.upWeb_GetAssignItemList", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
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
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ViewType", type = Integer.class),
			}, resultClasses = com.fashiongo.cms.model.AssignItemDetailList.class)
})
@Entity
public class AssignItemDetailList{
	@Id
	@Column(name = "seq")
	private Integer seq;

    @Column(name = "productid")
    private Integer productID;
    
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
	
	@Column(name = "packname")
    private String packName;
	
	@Column(name = "color")
    private String color;
	
	@Column(name = "sizename")
    private String sizeName;
	
	@Column(name = "fabricdescription")
    private String fabricDescription;
    
    @Column(name = "searchkeyword")
    private String searchKeyWord;
    
    @Column(name = "madein")
    private String madeIn;
    
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
    
    @Column(name = "patternID")
    private Integer patternID;
    
    @Column(name = "fabricID")
    private Integer fabricID;
    
    @Column(name = "hashtag1")
    private String hashTag1;
    
    @Column(name = "hashtag2")
    private String hashTag2;
    
    @Column(name = "hashtag3")
    private String hashTag3;
    
    @Column(name = "hashtag4")
    private String hashTag4;
    
    @Column(name = "activatedon")
    private Date activatedOn;

    @Column(name = "totalcount")
    private Integer totalCount;

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
   
}