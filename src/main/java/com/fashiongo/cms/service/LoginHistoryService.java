package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.LoginHistory;
import com.fashiongo.cms.param.LoginHistoryListParam;


/**
 * LoginHistoryService
 * @author KimMH
 */
@Service
public class LoginHistoryService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(LoginHistoryService.class);

	/**
	 * Select Access Login History List
	 * @param loginHistoryListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 11.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<LoginHistory> selectAccessLoginHistoryList(LoginHistoryListParam loginHistoryListParam) {
		
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetLogLoginList");
		query.setParameter("Page", loginHistoryListParam.getPn());
		query.setParameter("PageSize", loginHistoryListParam.getPs());
		query.setParameter("KeywordType", loginHistoryListParam.getKeywordType());
		query.setParameter("KeywordText", loginHistoryListParam.getKeywordText());
		query.setParameter("LoginStartDate", loginHistoryListParam.getSearchStartDate());
		query.setParameter("LoginEndDate", loginHistoryListParam.getSearchEndDate());

		return (List<LoginHistory>) query.getResultList();
	}
}
