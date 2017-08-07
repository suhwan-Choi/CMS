package com.fashiongo.cms.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.GroupManager;
import com.fashiongo.cms.param.GroupManagerListParam;

@Service
public class GroupManagerService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(GroupManagerService.class);

	/**
	 * 
	 * @param groupManagerListParam
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<GroupManager> selectGroupManagerList(GroupManagerListParam groupManagerListParam) throws Exception {

		List<GroupManager> groupManagerList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessGroupList");
		query.setParameter("Page", groupManagerListParam.getPage());
		query.setParameter("PageSize", groupManagerListParam.getPageSize());
		query.setParameter("GroupName", groupManagerListParam.getGroupName());
		query.setParameter("Active", groupManagerListParam.getActive());

		groupManagerList = (List<GroupManager>) query.getResultList();

		return groupManagerList;
	}

	public GroupManager selectGroupManager(int groupId) {
		GroupManager groupManager = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessGroup");
		query.setParameter("GroupId", groupId);

		groupManager = (GroupManager) query.getSingleResult();

		return groupManager;
	}
}
