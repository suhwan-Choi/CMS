package com.fashiongo.cms.service;

import java.util.Date;
import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.GroupManager;
import com.fashiongo.cms.model.GroupManagerList;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.GroupManagerListParam;
import com.fashiongo.cms.param.GroupManagerSaveParam;

@Service
public class GroupManagerService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(GroupManagerService.class);

	/**
	 * Obtain multiple group information
	 * 
	 * @param groupManagerListParam
	 * @return Group List
	 * @throws Exception
	 * @author : Mason
	 * @date : 2017. 8. 9.
	 */
	@SuppressWarnings("unchecked")
	public List<GroupManagerList> selectListGroupManager(GroupManagerListParam groupManagerListParam) {

		List<GroupManagerList> groupManagerList = null;
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessGroupList");
		query.setParameter("Page", groupManagerListParam.getPn());
		query.setParameter("PageSize", groupManagerListParam.getPs());
		query.setParameter("GroupName", groupManagerListParam.getGroupName());
		query.setParameter("Active", groupManagerListParam.getActive());

		groupManagerList = (List<GroupManagerList>) query.getResultList();

		return groupManagerList;
	}

	/**
	 * Obtain 1 group information
	 * 
	 * @param groupId
	 * @return group information
	 * @author : Mason
	 * @date : 2017. 8. 9.
	 */
	public GroupManager selectDetailGroupManager(int groupId) {
		GroupManager groupManager = null;
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessGroup");
		query.setParameter("GroupId", groupId);

		groupManager = (GroupManager) query.getSingleResult();

		return groupManager;
	}

	/**
	 * 
	 * @param groupManagerSaveParam
	 * @return
	 * @author : Mason
	 * @date : 2017. 8. 9.
	 */
	public ProcedureResult mergeSaveGroupManager(GroupManagerSaveParam groupManagerSaveParam) {
		StoredProcedureQuery query;
		if (groupManagerSaveParam.getGroupId() == null) {
			query = entityManager.createNamedStoredProcedureQuery("upWeb_CreateAccessGroup");
			query.setParameter("WorkedOn", new Date());
			query.setParameter("WorkedBy", groupManagerSaveParam.getCreatedBy());
		} else {
			query = entityManager.createNamedStoredProcedureQuery("upWeb_ModifyAccessGroup");
			query.setParameter("GroupId", groupManagerSaveParam.getGroupId());
			query.setParameter("WorkedOn", new Date());
			query.setParameter("WorkedBy", groupManagerSaveParam.getWorkedBy());
		}

		query.setParameter("GroupName", groupManagerSaveParam.getGroupName());
		query.setParameter("Active", groupManagerSaveParam.getActive());
		query.setParameter("GroupDescription", groupManagerSaveParam.getGroupDescription());
		query.setParameter("Permission", groupManagerSaveParam.getPermission());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;
	}

	/**
	 * 
	 * @param groupId
	 * @return
	 * @author : Mason
	 * @date : 2017. 8. 9.
	 */
	public ProcedureResult delete(Integer groupId) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_RemoveAccessGroup");
		query.setParameter("GroupId", groupId);

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;
	}

}
