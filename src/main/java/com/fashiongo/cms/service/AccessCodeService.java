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

import com.fashiongo.cms.model.AccessCode;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.AccessCodeListParam;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccessCodeService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(AccessCodeService.class);

	@SuppressWarnings("unchecked")
	public List<AccessCode> selectAccessCodeList(AccessCodeListParam accessCodeListParam) throws Exception{
		List<AccessCode> accessCodeList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessCodeList");
		query.setParameter("Page", accessCodeListParam.getPage());
		query.setParameter("PageSize", accessCodeListParam.getPageSize());
		query.setParameter("AccessCode", accessCodeListParam.getAccessCode());
		query.setParameter("SearchDateType", accessCodeListParam.getSearchDateType());
		query.setParameter("SearchStartDate", accessCodeListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", accessCodeListParam.getSearchEndDate());
		
		accessCodeList = (List<AccessCode>) query.getResultList();

		return accessCodeList;
	}
}
