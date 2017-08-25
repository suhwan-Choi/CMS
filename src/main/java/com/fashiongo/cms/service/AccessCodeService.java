package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.AccessCode;
import com.fashiongo.cms.model.AccessCodeList;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.AccessCodeListParam;
import com.fashiongo.cms.param.AccessCodeSaveParam;

@Service
public class AccessCodeService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(AccessCodeService.class);

	/**
	 * 
	 * @param accessCodeListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 10.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<AccessCodeList> selectAccessCodeList(AccessCodeListParam accessCodeListParam) throws Exception {
		List<AccessCodeList> accessCodeList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessCodeList");
		query.setParameter("Page", accessCodeListParam.getPn());
		query.setParameter("PageSize", accessCodeListParam.getPs());
		query.setParameter("AccessCode", accessCodeListParam.getAccessCode());
		query.setParameter("SearchDateType", accessCodeListParam.getSearchDateType());
		query.setParameter("SearchStartDate", accessCodeListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", accessCodeListParam.getSearchEndDate());

		accessCodeList = (List<AccessCodeList>) query.getResultList();

		return accessCodeList;
	}

	/**
	 * 
	 * @param accessCodeSaveParam
	 * @return
	 * @author Reo
	 * @date 2017. 8. 9.
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult mergeSaveAccessCode(AccessCodeSaveParam accessCodeSaveParam) {
		StoredProcedureQuery query;
		query = entityManager.createNamedStoredProcedureQuery("upWeb_CreateModifyAccessCode");
		query.setParameter("CodeID", accessCodeSaveParam.getCodeID());
		query.setParameter("WorkedBy", accessCodeSaveParam.getWorkedBy());

		query.setParameter("Active", accessCodeSaveParam.getActive());
		query.setParameter("StartedOn", accessCodeSaveParam.getStartedOn());
		query.setParameter("ExpiredOn", accessCodeSaveParam.getExpiredOn());
		query.setParameter("AccessCode", accessCodeSaveParam.getAccessCode());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;
	}

	/**
	 * 
	 * @param codeID
	 * @return
	 * @author Reo
	 * @date 2017. 8. 10.
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult delete(Integer codeID) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_RemoveAccessCode");
		query.setParameter("CodeID", codeID);

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;
	}

	/**
	 * 
	 * @param codeID
	 * @return
	 * @author : Mason
	 * @date : 2017. 8. 23.
	 */
	@Transactional(readOnly = true)
	public AccessCode selectDetailAccessCode(Integer codeID) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessCode");
		query.setParameter("CodeID", codeID);

		return (AccessCode) query.getSingleResult();
	}
}
