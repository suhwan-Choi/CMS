package com.fashiongo.cms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "upWeb_ComboBaseCode", procedureName = "dbo.upWeb_ComboBaseCode", resultClasses = CodeInfo.class)  
})

@Entity
public class CodeInfo implements Serializable{
	private static final long serialVersionUID = 3727844723131632254L;

	@Id
	@Column(name = "codetype")
	private String codeType;
	
	@Id
	@Column(name = "codeid")
	private Integer codeID;
	
	@Id
	@Column(name = "codename")
	private String codeName;
	
	@Id
	@Column(name = "categoryid")
	private Integer categoryID;

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public Integer getCodeID() {
		return codeID;
	}

	public void setCodeID(Integer codeID) {
		this.codeID = codeID;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}
}
