package com.fashiongo.cms.service;

import java.util.List;
import javax.persistence.StoredProcedureQuery;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.ItemShareUser;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.ItemShareParam;

@Service
public class ItemShareService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(ItemShareService.class);
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ItemShareUser> selectItemShareUser() throws Exception{
		List<ItemShareUser> itemShareUser = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetOperator");
		
		itemShareUser = (List<ItemShareUser>) query.getResultList();

		return itemShareUser;
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult mergeSaveItemShare(ItemShareParam itemShareParam) {
		StoredProcedureQuery query;
		query = entityManager.createNamedStoredProcedureQuery("upWeb_CreateItemShare");
		query.setParameter("WorkedBy", itemShareParam.getWorkedBy());
		query.setParameter("SessionKey", itemShareParam.getSessionKey());
		query.setParameter("KeywordType", itemShareParam.getKeywordType());
		query.setParameter("KeywordText", itemShareParam.getKeywordText());
		query.setParameter("CategoryID1", itemShareParam.getCategoryID1());
		query.setParameter("CategoryID2", itemShareParam.getCategoryID2());
		query.setParameter("CategoryID3", itemShareParam.getCategoryID3());
		query.setParameter("SearchDateType", itemShareParam.getSearchDateType());
		query.setParameter("SearchStartDate", itemShareParam.getSearchStartDate());
		query.setParameter("SearchEndDate", itemShareParam.getSearchEndDate());
		query.setParameter("Share", itemShareParam.getShare());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;
	}
}