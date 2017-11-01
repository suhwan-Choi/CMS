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
	@NamedStoredProcedureQuery(name = "upWeb_GetAssignItemThumbnailList", procedureName = "dbo.upWeb_GetAssignItemList", parameters = {
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
			}, resultClasses = com.fashiongo.cms.model.AssignItemThumbnailList.class)
})
@Entity
public class AssignItemThumbnailList{
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
    
    @Column(name = "sharedproductseq")
    private String sharedProductSeq;

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

	public String getSharedProductSeq() {
		return sharedProductSeq;
	}

	public void setSharedProductSeq(String sharedProductSeq) {
		this.sharedProductSeq = sharedProductSeq;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
   
}