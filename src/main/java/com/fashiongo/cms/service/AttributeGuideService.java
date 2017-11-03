package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.GuideAttribute;
import com.fashiongo.cms.model.GuideCategory;
import com.fashiongo.cms.model.GuideUpdate;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.GuideAttributeListParam;
import com.fashiongo.cms.param.GuideAttributeModifyParam;
import com.fashiongo.cms.param.GuideCategoryListParam;

@Service
public class AttributeGuideService extends CommonService {

	@SuppressWarnings("unchecked")
	public List<GuideCategory> selectGuideCategoryList(GuideCategoryListParam guideCategoryListParam) {
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetGuideCategoryList");

		query.setParameter("CategoryID", guideCategoryListParam.getCategoryID());
		query.setParameter("KeywordType", guideCategoryListParam.getKeywordType());
		query.setParameter("KeywordText", guideCategoryListParam.getKeywordText());

		return (List<GuideCategory>) query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<GuideAttribute> selectGuideAttributeList(GuideAttributeListParam guideAttributeListParam) {
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetGuideAttributeList");

		query.setParameter("AttributeTypeID", guideAttributeListParam.getAttributeTypeID());
		query.setParameter("AttributeID", guideAttributeListParam.getAttributeID());
		query.setParameter("CategoryID", guideAttributeListParam.getCategoryID());
		query.setParameter("KeywordType", guideAttributeListParam.getKeywordType());
		query.setParameter("KeywordText", guideAttributeListParam.getKeywordText());

		return (List<GuideAttribute>) query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<GuideUpdate> selectUpdateGuideList() {
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetGuideUpdateList");

		return (List<GuideUpdate>) query.getResultList();
	}

	public ProcedureResult modifyGuideAttribute(GuideAttributeModifyParam guideAttributeModifyParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_ModifyGuideAttribute");
		query.setParameter("WorkedBy", guideAttributeModifyParam.getWorkedBy());
		query.setParameter("AttributeTypeID", guideAttributeModifyParam.getAttributeTypeID());
		query.setParameter("MapID", guideAttributeModifyParam.getMapID());
		query.setParameter("DescriptionKor", guideAttributeModifyParam.getDescriptionKor());
		query.setParameter("DescriptionEng", guideAttributeModifyParam.getDescriptionEng());
		query.setParameter("ImageList", guideAttributeModifyParam.getImageList());
		
		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;

	}

}
