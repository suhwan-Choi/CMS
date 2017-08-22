package com.fashiongo.cms.service;

import java.util.Date;
import java.util.List;
import javax.persistence.StoredProcedureQuery;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.AccessCode;
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
	@SuppressWarnings("unchecked")
	public List<AccessCode> selectAccessCodeList(AccessCodeListParam accessCodeListParam) throws Exception {
		List<AccessCode> accessCodeList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessCodeList");
		query.setParameter("Page", accessCodeListParam.getPn());
		query.setParameter("PageSize", accessCodeListParam.getPs());
		query.setParameter("AccessCode", accessCodeListParam.getAccessCode());
		query.setParameter("SearchDateType", accessCodeListParam.getSearchDateType());
		query.setParameter("SearchStartDate", accessCodeListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", accessCodeListParam.getSearchEndDate());

		accessCodeList = (List<AccessCode>) query.getResultList();

		return accessCodeList;
	}

	/**
	 * 
	 * @param accessCodeSaveParam
	 * @return
	 * @author Reo
	 * @date 2017. 8. 9.
	 */
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
	public ProcedureResult delete(Integer codeID) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_RemoveAccessCode");
		query.setParameter("CodeID", codeID);

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;
	}
}
