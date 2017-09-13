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
	@NamedStoredProcedureQuery(name = "upWeb_CreateItemAssign", procedureName = "dbo.upWeb_CreateItemAssign", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SessionKey", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID1", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID2", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID3", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchDateType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchStartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchEndDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Share", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class)
			})  ,
	@NamedStoredProcedureQuery(name = "upWeb_CreateItemReassignSearch", procedureName = "dbo.upWeb_CreateItemReassignSearch", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SessionKey", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchStartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "SearchEndDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Status", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID1", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID2", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "CategoryID3", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ReshareUser", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class)
			})  
	})
@Entity
public class ItemShare{
	@Id
	@Column(name = "totalcount")
	private Integer totalCount;

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
}