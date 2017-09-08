package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "upWeb_CreateItemReshare", procedureName = "dbo.upWeb_CreateItemReshare", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "SessionKey", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "ReshareList", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "ReshareUser", type = String.class), }) })
@Entity
public class ItemReshare {
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
