package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.LoginHistory;
import com.fashiongo.cms.param.LoginHistoryListParam;

@Service
/**
 * 
 * @author KimMH
 *
 */
public class LoginHistoryService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(LoginHistoryService.class);

	/**
	 * 
	 * @param loginHistoryListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 11.
	 */
	@SuppressWarnings("unchecked")
	public List<LoginHistory> selectAccessLoginHistoryList(LoginHistoryListParam loginHistoryListParam) throws Exception{
		List<LoginHistory> loginHistoryList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetLogLoginList");
		query.setParameter("Page", loginHistoryListParam.getPage());
		query.setParameter("PageSize", loginHistoryListParam.getPageSize());
		query.setParameter("KeywordType", loginHistoryListParam.getKeywordType());
		query.setParameter("KeywordText", loginHistoryListParam.getKeywordText());
		query.setParameter("LoginStartDate", loginHistoryListParam.getLoginStartDate());
		query.setParameter("LoginEndDate", loginHistoryListParam.getLoginEndDate());
		
		loginHistoryList = (List<LoginHistory>) query.getResultList();

		return loginHistoryList;
	}
}
