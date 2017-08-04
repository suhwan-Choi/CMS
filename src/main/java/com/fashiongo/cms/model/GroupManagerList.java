package com.fashiongo.cms.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class GroupManagerList {

	@Getter
	@Setter
	private List<GroupManager> groupManagerList;

	@Getter
	@Setter
	private int totalCount = 0;

}
