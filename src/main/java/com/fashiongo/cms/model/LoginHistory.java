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
	@NamedStoredProcedureQuery(name = "upWeb_GetLogLoginList", procedureName = "dbo.upWeb_GetLogLoginList", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "Page", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "PageSize", type = Integer.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordType", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "KeywordText", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "LoginStartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "LoginEndDate", type = Date.class)
			}, resultClasses = com.fashiongo.cms.model.LoginHistory.class)
})
@Entity
public class LoginHistory{
	@Id
	@Column(name = "useraccount")
	private String userAccount;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "groupname")
	private String groupName;
	
	@Column(name = "ipaddress")
	private String ipAddress;
	
	@Column(name = "loginon")
	private Date loginOn;
	
	@Column(name = "totalcount")
	private Integer totalCount;
}