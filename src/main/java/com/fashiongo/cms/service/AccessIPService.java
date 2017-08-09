package com.fashiongo.cms.service;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.StoredProcedureQuery;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.AccessIP;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.AccessIPListParam;

@Service
public class AccessIPService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(AccessIPService.class);

	@SuppressWarnings("unchecked")
	public List<AccessIP> selectAccessIPList(AccessIPListParam accessIPListParam) throws Exception{
		List<AccessIP> accessIPList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessIPList");
		query.setParameter("Page", accessIPListParam.getPage());
		query.setParameter("PageSize", accessIPListParam.getPageSize());
		query.setParameter("KeywordType", accessIPListParam.getKeywordType());
		query.setParameter("KeywordText", accessIPListParam.getKeywordText());
		query.setParameter("Active", accessIPListParam.getActive());
		query.setParameter("SearchDateType", accessIPListParam.getSearchDateType());
		query.setParameter("SearchStartDate", accessIPListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", accessIPListParam.getSearchEndDate());
		
		accessIPList = (List<AccessIP>) query.getResultList();

		return accessIPList;
	}
	
	public ProcedureResult updateSaveAccessIP(AccessIPListParam accessIPListParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_CreateModifyAccessIP");
        query.execute();
		
		ProcedureResult result = new ProcedureResult();
		result.setResultCode((Integer)query.getOutputParameterValue("ResultCode"));
		result.setErrorMessage((String)query.getOutputParameterValue("ErrorMessage"));
		
		return result;
	}
}
