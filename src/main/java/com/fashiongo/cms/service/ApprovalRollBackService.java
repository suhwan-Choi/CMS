package com.fashiongo.cms.service;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.param.ApprovalRollBackListApprovalParam;
import com.fashiongo.cms.param.ApprovalRollBackListRollBackParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveAssignParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveRejectParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveReshareParam;

@Service
public class ApprovalRollBackService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(ApprovalRollBackService.class);

	public void selectApprovalList(ApprovalRollBackListApprovalParam approvalRollBackListApprovalParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetApprovalItemList");
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
