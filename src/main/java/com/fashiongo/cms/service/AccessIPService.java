package com.fashiongo.cms.service;

import java.util.List;
import javax.persistence.StoredProcedureQuery;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.AccessIP;
import com.fashiongo.cms.model.AccessIPList;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.AccessIPListParam;
import com.fashiongo.cms.param.AccessIPSaveParam;

@Service
public class AccessIPService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(AccessIPService.class);

	/**
	 * 
	 * @param accessIPListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 10.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<AccessIPList> selectAccessIPList(AccessIPListParam accessIPListParam) throws Exception{
		List<AccessIPList> accessIPList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessIPList");
		query.setParameter("Page", accessIPListParam.getPage());
		query.setParameter("PageSize", accessIPListParam.getPageSize());
		query.setParameter("KeywordType", accessIPListParam.getKeywordType());
		query.setParameter("KeywordText", accessIPListParam.getKeywordText());
		query.setParameter("Active", accessIPListParam.getActive());
		query.setParameter("SearchDateType", accessIPListParam.getSearchDateType());
		query.setParameter("SearchStartDate", accessIPListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", accessIPListParam.getSearchEndDate());
		
		accessIPList = (List<AccessIPList>) query.getResultList();

		return accessIPList;
	}
	
	/**
	 * 
	 * @param ipID
	 * @return
	 * @author Reo
	 * @date 2017. 8. 22.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<AccessIP> selectDetailAccessIP(Integer ipId) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessIP");
		query.setParameter("IPID", ipId);

		return (List<AccessIP>) query.getResultList();
	}
	
	/**
	 * 
	 * @param accessIPSaveParam
	 * @return
	 * @author Reo
	 * @date 2017. 8. 10.
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult mergeSaveAccessIP(AccessIPSaveParam accessIPSaveParam) {
		StoredProcedureQuery query;
		query = entityManager.createNamedStoredProcedureQuery("upWeb_CreateModifyAccessIP");
		query.setParameter("IPID", accessIPSaveParam.getIpID());
		query.setParameter("IPAddress", accessIPSaveParam.getIpAddress());
		query.setParameter("Active", accessIPSaveParam.getActive());
		query.setParameter("IPDescription", accessIPSaveParam.getIpDescription());
		query.setParameter("WorkedBy", accessIPSaveParam.getWorkedBy());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;
	}
	
	/**
	 * 
	 * @param ipID
	 * @return
	 * @author Reo
	 * @date 2017. 8. 10.
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult delete(Integer ipID) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_RemoveAccessIP");
		query.setParameter("IPID", ipID);

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;
	}
}
