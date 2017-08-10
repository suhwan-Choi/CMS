package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.UserManagerList;
import com.fashiongo.cms.param.UserManagerListParam;

@Service
public class UserManagerService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(UserManagerService.class);

	public List<UserManagerList> selectListUserManager(UserManagerListParam userManagerListParam) {

		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessUserList");

		query.setParameter("Page", userManagerListParam.getPn());
		query.setParameter("PageSize", userManagerListParam.getPs());
		query.setParameter("KeywordType", userManagerListParam.getKeywordType());
		query.setParameter("KeywordText", userManagerListParam.getKeywordText());
		query.setParameter("Active", userManagerListParam.getActive());
		query.setParameter("SearchDateType", userManagerListParam.getSearchDateType());
		query.setParameter("SearchStartDate", userManagerListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", userManagerListParam.getSearchEndDate());

		@SuppressWarnings("unchecked")
		List<UserManagerList> userManagerLists = (List<UserManagerList>) query.getResultList();
		return userManagerLists;
	}

}
