package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.ApprovalItem;
import com.fashiongo.cms.param.ApprovalRollBackListApprovalParam;
import com.fashiongo.cms.param.ApprovalRollBackListRollBackParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveAssignParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveRejectParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveReshareParam;

@Service
public class ApprovalRollBackService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(ApprovalRollBackService.class);

	@SuppressWarnings("unchecked")
	public List<ApprovalItem> selectApprovalList(ApprovalRollBackListApprovalParam approvalRollBackListApprovalParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetApprovalItemList");
		
		query.setParameter("Page", approvalRollBackListApprovalParam.getPn());
		query.setParameter("PageSize", approvalRollBackListApprovalParam.getPs());
		query.setParameter("SearchStartDate", approvalRollBackListApprovalParam.getSearchStartDate());
		query.setParameter("SearchEndDate", approvalRollBackListApprovalParam.getSearchEndDate());
		query.setParameter("KeywordType", approvalRollBackListApprovalParam.getKeywordType());
		query.setParameter("KeywordText", approvalRollBackListApprovalParam.getKeywordText());
		query.setParameter("Status", approvalRollBackListApprovalParam.getStatus());
		query.setParameter("CategoryID1", approvalRollBackListApprovalParam.getCategoryID1());
		query.setParameter("CategoryID2", approvalRollBackListApprovalParam.getCategoryID2());
		query.setParameter("CategoryID3", approvalRollBackListApprovalParam.getCategoryID3());

		return (List<ApprovalItem>) query.getResultList();

	}

	public void selectRollbackList(ApprovalRollBackListRollBackParam approvalRollBackListRollBackParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}

	public void mergeSaveApprove(ApprovalRollBackSaveAssignParam assignRollBackSaveAssignParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}

	public void updateSaveReject(ApprovalRollBackSaveRejectParam assignRollBackSaveRejectParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}

	public void updateSaveReshare(ApprovalRollBackSaveReshareParam assignRollBackSaveReshareParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
}
