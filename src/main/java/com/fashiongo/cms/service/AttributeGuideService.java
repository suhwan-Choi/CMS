package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.GuideCategory;
import com.fashiongo.cms.param.GuideCategoryListParam;

@Service
public class AttributeGuideService extends CommonService {

	@SuppressWarnings("unchecked")
	public List<GuideCategory> selectGuideCategoryList(GuideCategoryListParam guideCategoryListParam) {
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetGuideCategoryList");
		
		query.setParameter("CategoryID", guideCategoryListParam.getCategoryID());
		query.setParameter("KeywordType", guideCategoryListParam.getKeywordType());
		query.setParameter("KeywordText", guideCategoryListParam.getKeywordText());
		query.setParameter("NoCms", guideCategoryListParam.getNoCms());
		
		return (List<GuideCategory>) query.getResultList();
	}


}
