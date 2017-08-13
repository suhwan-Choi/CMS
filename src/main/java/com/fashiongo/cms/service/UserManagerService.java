package com.fashiongo.cms.service;

import java.util.Date;
import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.model.UserManager;
import com.fashiongo.cms.model.UserManagerList;
import com.fashiongo.cms.param.UserManagerDeleteParam;
import com.fashiongo.cms.param.UserManagerListParam;
import com.fashiongo.cms.param.UserManagerSaveParam;

@Service
public class UserManagerService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(UserManagerService.class);

	/**
	 * Search for multiple users
	 * 
	 * @param userManagerListParam
	 * @return
	 * @throws ParseException
	 * @author : Mason
	 * @date : 2017. 8. 11.
	 */
	@SuppressWarnings("unchecked")
	public List<UserManagerList> selectListUserManager(UserManagerListParam userManagerListParam) throws Exception {

		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessUserList");

		query.setParameter("Page", userManagerListParam.getPn());
		query.setParameter("PageSize", userManagerListParam.getPs());
		query.setParameter("KeywordType", userManagerListParam.getKeywordType());
		query.setParameter("KeywordText", userManagerListParam.getKeywordText());
		query.setParameter("Active", userManagerListParam.getActive());
		query.setParameter("SearchDateType", userManagerListParam.getSearchDateType());
		query.setParameter("SearchStartDate", userManagerListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", userManagerListParam.getSearchEndDate());

		return (List<UserManagerList>) query.getResultList();
	}

	/**
	 * Search one user
	 * 
	 * @param userID
	 * @return
	 * @author : Mason
	 * @date : 2017. 8. 10.
	 */
	public UserManager selectDetailUserManager(int userID) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessUser");

		query.setParameter("UserID", userID);

		UserManager userManager = (UserManager) query.getSingleResult();
		return userManager;
	}

	/**
	 * Add or modify one user, Set userId to 0 when added.
	 * 
	 * @param userManagerSaveParam
	 * @return
	 * @author : Mason
	 * @date : 2017. 8. 11.
	 */
	public ProcedureResult mergeSaveUserManager(UserManagerSaveParam userManagerSaveParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_CreateModifyAccessUser");
		if (userManagerSaveParam.getUserID() == null) {
			query.setParameter("UserID", 0);
		} else {
			query.setParameter("UserID", userManagerSaveParam.getUserID());
		}
		query.setParameter("Active", userManagerSaveParam.getActive());
		query.setParameter("UserAccount", userManagerSaveParam.getUserAccount());
		query.setParameter("UserPassword", userManagerSaveParam.getUserPassword());
		query.setParameter("UserName", userManagerSaveParam.getUserName());
		query.setParameter("GroupID", userManagerSaveParam.getGroupID());
		query.setParameter("UserDescription", userManagerSaveParam.getUserDescription());
		query.setParameter("WorkedOn", new Date());
		query.setParameter("WorkedBy", userManagerSaveParam.getWorkedBy());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));
		return procedureResult;
	}

	/**
	 * Remove one user information.
	 * 
	 * @param userManagerDeleteParam
	 * @return
	 * @author : Mason
	 * @date : 2017. 8. 11.
	 */
	public ProcedureResult delete(UserManagerDeleteParam userManagerDeleteParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_RemoveAccessUser");
		query.setParameter("UserID", userManagerDeleteParam.getUserID());
		query.setParameter("WorkedBy", userManagerDeleteParam.getWorkedBy());
		query.setParameter("WorkedOn", new Date());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));
		return procedureResult;

	}

}
