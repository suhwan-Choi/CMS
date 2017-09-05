package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.ApprovalItem;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.model.RollBackItems;
import com.fashiongo.cms.param.ApprovalItemsApproveRejectParam;
import com.fashiongo.cms.param.ApprovalRollBackListApprovalParam;
import com.fashiongo.cms.param.ApprovalRollBackListRollBackParam;
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

	@SuppressWarnings("unchecked")
	/**
	 * 
	 * @param approvalRollBackListRollBackParam
	 * @return
	 * @author : Mason
	 * @date : 2017. 9. 4.
	 */
	public List<RollBackItems> selectRollbackList(ApprovalRollBackListRollBackParam approvalRollBackListRollBackParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetRollbackItemList");
		query.setParameter("Page", approvalRollBackListRollBackParam.getPn());
		query.setParameter("PageSize", approvalRollBackListRollBackParam.getPs());
		query.setParameter("SearchStartDate", approvalRollBackListRollBackParam.getSearchStartDate());
		query.setParameter("SearchEndDate", approvalRollBackListRollBackParam.getSearchEndDate());
		query.setParameter("KeywordType", approvalRollBackListRollBackParam.getKeywordType());
		query.setParameter("KeywordText", approvalRollBackListRollBackParam.getKeywordText());
		query.setParameter("Status", approvalRollBackListRollBackParam.getStatus());
		query.setParameter("CategoryID1", approvalRollBackListRollBackParam.getCategoryID1());
		query.setParameter("CategoryID2", approvalRollBackListRollBackParam.getCategoryID2());
		query.setParameter("CategoryID3", approvalRollBackListRollBackParam.getCategoryID3());

		return (List<RollBackItems>) query.getResultList();
	}

	/**
	 * 
	 * @param approvalItemsSaveParam
	 * @return
	 * @author : Mason
	 * @date : 2017. 9. 5.
	 */
	public ProcedureResult modifyApproveItems(ApprovalItemsApproveRejectParam approvalItemsApproveRejectParam) {
		StoredProcedureQuery query;
		if(approvalItemsApproveRejectParam.getMode().equals("approve")) {
			query = entityManager.createNamedStoredProcedureQuery("upWeb_ModifyApproveItem");
		}else {
			query = entityManager.createNamedStoredProcedureQuery("upWeb_ModifyRejectItem");
		}
		query.setParameter("WorkedBy", approvalItemsApproveRejectParam.getWorkedBy());
		query.setParameter("SessionKey", approvalItemsApproveRejectParam.getSessionKey());
		query.setParameter("ApproveList", approvalItemsApproveRejectParam.getApproveList());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));

		return procedureResult;

	}	

	public void updateSaveReshare(ApprovalRollBackSaveReshareParam assignRollBackSaveReshareParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
}
