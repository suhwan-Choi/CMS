package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.GroupManager;
import com.fashiongo.cms.model.GroupManagerList;
import com.fashiongo.cms.param.GroupManagerListParam;

@Service
public class GroupManagerService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(GroupManagerService.class);

	/**
	 * 
	 * @param groupManagerListParam
	 * @return
	 */
	public GroupManagerList selectGroupManagerList(GroupManagerListParam groupManagerListParam) {

		GroupManagerList groupManagerList = new GroupManagerList();
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessGroupList");
		query.setParameter("Page", groupManagerListParam.getPage());
		query.setParameter("PageSize", groupManagerListParam.getPageSize());
		query.setParameter("GroupName", groupManagerListParam.getGroupName());
		query.setParameter("Active", groupManagerListParam.isActive());

		List<GroupManager> groupManagers = null;

		try {
			groupManagers = query.getResultList();
			groupManagerList.setGroupManagerList(groupManagers);
		} catch (Exception e) {
		}

		return groupManagerList;
	}

	public GroupManager selectGroupManager(int groupId) {
		// TODO Auto-generated method stub
		return null;
	}
}
