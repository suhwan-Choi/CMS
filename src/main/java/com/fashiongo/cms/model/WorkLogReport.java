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
	@NamedStoredProcedureQuery(name = "upWeb_GetStatisticsWorklog", procedureName = "dbo.upWeb_GetStatisticsWorklog", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "StartDate", type = Date.class),
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "EndDate", type = Date.class)
			}, resultClasses = com.fashiongo.cms.model.WorkLogReport.class)
})
@Entity
public class WorkLogReport{
	@Id
	@Column(name = "startdate")
	private Date startDate;
	
	@Column(name = "enddate")
	private Date endDate;
	
	@Column(name = "assignedcount")
	private Integer assignedCount;
	
	@Column(name = "reassignedcount")
	private Integer reAssignedCount;
	
	@Column(name = "rollbackcount")
	private Integer rollBackCount;	

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

	@Column(name = "dom")
	private Integer dom;
	
	public Integer getRollBackCount() {
		return rollBackCount;
	}

	public void setRollBackCount(Integer rollBackCount) {
		this.rollBackCount = rollBackCount;
	}

	public Integer getDom() {
		return dom;
	}

	public void setDom(Integer dom) {
		this.dom = dom;
	}

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

	@Column(name = "editedcount")
	private Integer editedCount;
	
	@Column(name = "ineditedcount")
	private Integer inEditedCount;
	
}