package com.fashiongo.cms.service;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.param.AssignRollBackAssignListParam;
import com.fashiongo.cms.param.AssignRollBackRollBackListParam;
import com.fashiongo.cms.param.AssignRollBackSaveAssignParam;
import com.fashiongo.cms.param.AssignRollBackSaveRejectParam;
import com.fashiongo.cms.param.AssignRollBackSaveReshareParam;

@Service
public class AssignRollBackService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(AssignRollBackService.class);
	
	public void selectAssignList(AssignRollBackAssignListParam assignRollBackAssignListParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void selectRollbackList(AssignRollBackRollBackListParam assignRollBackRollBackListParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void mergeSaveAssign(AssignRollBackSaveAssignParam assignRollBackSaveAssignParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void updateSaveReject(AssignRollBackSaveRejectParam assignRollBackSaveRejectParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void updateSaveReshare(AssignRollBackSaveReshareParam assignRollBackSaveReshareParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
}
