package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.EditItem;
import com.fashiongo.cms.model.EditItemUser;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.EditItemListParam;
import com.fashiongo.cms.param.EditItemSaveItemParam;
import com.fashiongo.cms.param.EditItemSaveRollBackParam;

@Service
public class EditItemService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(EditItemService.class);
	
	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<EditItem> selectList(EditItemListParam editItemListParam) {
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetEditItemList");
		
		query.setParameter("Page", editItemListParam.getPn());
		query.setParameter("PageSize", editItemListParam.getPs());
		query.setParameter("UserID", editItemListParam.getUserID());
		query.setParameter("SearchStartDate", editItemListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", editItemListParam.getSearchEndDate());
		query.setParameter("KeywordType", editItemListParam.getKeywordType());
		query.setParameter("KeywordText", editItemListParam.getKeywordText());
		query.setParameter("Status", editItemListParam.getStatus());
		query.setParameter("CategoryID1", editItemListParam.getCategoryID1());
		query.setParameter("CategoryID2", editItemListParam.getCategoryID2());
		query.setParameter("CategoryID3", editItemListParam.getCategoryID3());

		return (List<EditItem>) query.getResultList();
	}
	
	@Transactional(readOnly=true)
	public EditItem selectEditItem(int sharedProductSeq) {
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetEditItem");
		
		query.setParameter("SharedProductSeq", sharedProductSeq);
		
		return (EditItem) query.getSingleResult();
	}
	
	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<EditItemUser> selectListUser(EditItemListParam editItemListParam) {
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetEditItemUser");
		
		query.setParameter("SearchStartDate", editItemListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", editItemListParam.getSearchEndDate());
		query.setParameter("KeywordType", editItemListParam.getKeywordType());
		query.setParameter("KeywordText", editItemListParam.getKeywordText());
		query.setParameter("Status", editItemListParam.getStatus());
		query.setParameter("CategoryID1", editItemListParam.getCategoryID1());
		query.setParameter("CategoryID2", editItemListParam.getCategoryID2());
		query.setParameter("CategoryID3", editItemListParam.getCategoryID3());
		
		return (List<EditItemUser>) query.getResultList();
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult insertSaveRollback(EditItemSaveRollBackParam editItemSaveRollBackParam) {
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_CreateRollbackRequest");
		
		query.setParameter("WorkedBy", editItemSaveRollBackParam.getWorkedBy());
		query.setParameter("SessionKey", editItemSaveRollBackParam.getSessionKey());
		query.setParameter("Reason", editItemSaveRollBackParam.getReason());
		query.setParameter("RollbackList", editItemSaveRollBackParam.getRollbackList());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));
		
		return procedureResult;
		
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult mergeSaveItem(EditItemSaveItemParam editItemSaveItemParam) {
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_ModifyEditItem");
		
		query.setParameter("WorkedBy", editItemSaveItemParam.getWorkedBy());
		query.setParameter("RoIeIDofWorked", editItemSaveItemParam.getRoIeIDofWorked());
		query.setParameter("SessionKey", editItemSaveItemParam.getSessionKey());
		query.setParameter("SharedProductSeq", editItemSaveItemParam.getSharedProductSeq());
		query.setParameter("ItemName", editItemSaveItemParam.getItemName());
		query.setParameter("CategoryID", editItemSaveItemParam.getCategoryID());
		query.setParameter("ParentCategoryID", editItemSaveItemParam.getParentCategoryID());
		query.setParameter("ParentParentCategoryID", editItemSaveItemParam.getParentParentCategoryID());
		query.setParameter("LengthID", editItemSaveItemParam.getLengthID());
		query.setParameter("StyleID", editItemSaveItemParam.getStyleID());
		query.setParameter("PatternID", editItemSaveItemParam.getPatternID());
		query.setParameter("FabricID", editItemSaveItemParam.getFabricID());
		query.setParameter("SearchKeyword", editItemSaveItemParam.getSearchKeyword());
		query.setParameter("HashTag", editItemSaveItemParam.getHashTag());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));
		
		return procedureResult;
	}
}
