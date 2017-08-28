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
	@NamedStoredProcedureQuery(name = "upWeb_GetImage", procedureName = "dbo.upWeb_GetImage", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ProductID", type = Integer.class),
			}, resultClasses = com.fashiongo.cms.model.ImageList.class)
	})
@Entity
public class ImageList{
	@Id
	@Column(name = "productimageid")
	private Integer productImageID;
	
	@Column(name = "imageurlroot")
	private String imageUrlRoot;
	
	@Column(name = "dirname")
	private String dirName;
	
	@Column(name = "imagename")
	private String imageName;
	
	@Column(name = "listorder")
	private Integer listOrder;

	public Integer getProductImageID() {
		return productImageID;
	}

	public void setProductImageID(Integer productImageID) {
		this.productImageID = productImageID;
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

	public Integer getListOrder() {
		return listOrder;
	}

	public void setListOrder(Integer listOrder) {
		this.listOrder = listOrder;
	}
}