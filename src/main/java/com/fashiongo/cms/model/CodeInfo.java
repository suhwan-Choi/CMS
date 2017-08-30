package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "upWeb_ComboBaseCode", procedureName = "dbo.upWeb_ComboBaseCode", resultClasses = CodeInfo.class)  
})

@Entity
public class CodeInfo {
	
	@Id
	@Column(name = "seq")
	private Integer seq;
	
	@Column(name = "codetype")
	private String codeType;
	
	@Column(name = "codeid")
	private Integer codeID;
	
	@Column(name = "codename")
	private String codeName;

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

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
}
