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
	@NamedStoredProcedureQuery(name = "upWeb_GetEditItemThumbnailList", procedureName = "dbo.upWeb_GetEditItemList", parameters = {
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
	}, resultClasses = com.fashiongo.cms.model.EditThumbnailItem.class)
})

@Entity
public class EditThumbnailItem {
	
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
	
	@Column(name = "sharedproductseq")
	private Integer sharedProductSeq;
	
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

	public Integer getSharedProductSeq() {
		return sharedProductSeq;
	}

	public void setSharedProductSeq(Integer sharedProductSeq) {
		this.sharedProductSeq = sharedProductSeq;
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
