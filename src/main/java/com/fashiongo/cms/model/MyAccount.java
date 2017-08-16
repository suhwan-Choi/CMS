package com.fashiongo.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "upWeb_ModifyUserPassword", procedureName = "dbo.upWeb_ModifyUserPassword", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserID", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "UserPassword", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "WorkedBy", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ResultCode", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "ErrorMessage", type = String.class)
		})
		})
@Entity
public class MyAccount{
	@Id
	@Column(name = "userid")
	private Integer userID;

	@Column(name = "userpassword")
	private String userPassword;
	
	@Column(name = "workedby")
	private Integer workedBy;


	public Integer getWorkedBy() {
		return workedBy;
	}

	public void setWorkedBy(Integer workedBy) {
		this.workedBy = workedBy;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}