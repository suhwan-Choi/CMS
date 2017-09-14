package com.fashiongo.cms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "upWeb_GetStatisticsWorklogforExcel", procedureName = "dbo.upWeb_GetStatisticsWorklogforExcel", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "StartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "EndDate", type = Date.class)
			}, resultClasses = com.fashiongo.cms.model.WorkLogReportExcel.class)
})
@Entity
public class WorkLogReportExcel implements Serializable{
	private static final long serialVersionUID = 8000695650449658165L;

	@Id
	@Column(name = "startdate")
	private Date startDate;
	
	@Id
	@Column(name = "enddate")
	private Date endDate;
	
	@Id
	@Column(name = "userid")
	private Integer userID;
	
	@Id
	@Column(name = "username")
	private String userName;
	
	@Id
	@Column(name = "assignedcount")
	private Integer assignedCount;
	
	@Id
	@Column(name = "reassignedcount")
	private Integer reAssignedCount;
	
	public Integer getAssignedCount() {
		return assignedCount;
	}

	public void setAssignedCount(Integer assignedCount) {
		this.assignedCount = assignedCount;
	}

	public Integer getReAssignedCount() {
		return reAssignedCount;
	}

	public void setReAssignedCount(Integer reAssignedCount) {
		this.reAssignedCount = reAssignedCount;
	}

	@Id
	@Column(name = "rollbackcount")
	private Integer rollBackCount;
	
	@Id
	@Column(name = "editedcount")
	private Integer editedCount;	
	
	@Id
	@Column(name = "ineditedcount")
	private Integer inEditedCount;
	
	@Id
	@Column(name = "approvedcount")
	private Integer approvedCount;
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getRollBackCount() {
		return rollBackCount;
	}

	public void setRollBackCount(Integer rollBackCount) {
		this.rollBackCount = rollBackCount;
	}

	public Integer getEditedCount() {
		return editedCount;
	}

	public void setEditedCount(Integer editedCount) {
		this.editedCount = editedCount;
	}

	public Integer getInEditedCount() {
		return inEditedCount;
	}

	public void setInEditedCount(Integer inEditedCount) {
		this.inEditedCount = inEditedCount;
	}

	public Integer getApprovedCount() {
		return approvedCount;
	}

	public void setApprovedCount(Integer approvedCount) {
		this.approvedCount = approvedCount;
	}
}