package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.EditDetailItem;
import com.fashiongo.cms.model.EditItem;
import com.fashiongo.cms.model.EditItemUser;
import com.fashiongo.cms.model.EditSimpleItem;
import com.fashiongo.cms.model.EditThumbnailItem;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.EditItemListParam;
import com.fashiongo.cms.param.EditItemSaveItemParam;
import com.fashiongo.cms.param.EditItemSaveRollBackParam;

@Service
public class EditItemService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(EditItemService.class);
	
	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<EditSimpleItem> selectSimpleList(EditItemListParam editItemListParam) {
		
		StoredProcedureQuery query = setListParameter(entityManager.createNamedStoredProcedureQuery("upWeb_GetEditItemSimpleList"), editItemListParam);
		
		return (List<EditSimpleItem>) query.getResultList(); 
	}
	
	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<EditThumbnailItem> selectThumbnailList(EditItemListParam editItemListParam) {
		
		StoredProcedureQuery query = setListParameter(entityManager.createNamedStoredProcedureQuery("upWeb_GetEditItemThumbnailList"), editItemListParam);
		
		return (List<EditThumbnailItem>) query.getResultList(); 
	}
	
	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<EditDetailItem> selectDetailList(EditItemListParam editItemListParam) {
		
		StoredProcedureQuery query = setListParameter(entityManager.createNamedStoredProcedureQuery("upWeb_GetEditItemDetailList"), editItemListParam);
		
		return (List<EditDetailItem>) query.getResultList(); 
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
		
		query.setParameter("KeywordType", editItemListParam.getKeywordType());
		query.setParameter("KeywordText", editItemListParam.getKeywordText());
		query.setParameter("CategoryID", editItemListParam.getCategoryID());
		query.setParameter("LengthID", editItemListParam.getLengthID());
		query.setParameter("StyleID", editItemListParam.getStyleID());
		query.setParameter("PatternID", editItemListParam.getPattrenID());
		query.setParameter("FabricID", editItemListParam.getFabricID());
		query.setParameter("SearchDateType", editItemListParam.getSearchDateType());
		query.setParameter("SearchStartDate", editItemListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", editItemListParam.getSearchEndDate());
		query.setParameter("Status", editItemListParam.getStatus());
		
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
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult approveSaveItem(EditItemSaveItemParam editItemSaveItemParam) {
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_ModifyEditApproveItem");
		
		query.setParameter("WorkedBy", editItemSaveItemParam.getWorkedBy());
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
	
	private StoredProcedureQuery setListParameter(StoredProcedureQuery query, EditItemListParam editItemListParam) {
		
		query.setParameter("Page", editItemListParam.getPn());
		query.setParameter("PageSize", editItemListParam.getPs());
		query.setParameter("UserID", editItemListParam.getUserID());
		query.setParameter("KeywordType", editItemListParam.getKeywordType());
		query.setParameter("KeywordText", editItemListParam.getKeywordText());
		query.setParameter("CategoryID", editItemListParam.getCategoryID());
		query.setParameter("LengthID", editItemListParam.getLengthID());
		query.setParameter("StyleID", editItemListParam.getStyleID());
		query.setParameter("PatternID", editItemListParam.getPattrenID());
		query.setParameter("FabricID", editItemListParam.getFabricID());
		query.setParameter("SearchDateType", editItemListParam.getSearchDateType());
		query.setParameter("SearchStartDate", editItemListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", editItemListParam.getSearchEndDate());
		query.setParameter("Status", editItemListParam.getStatus());
		query.setParameter("ViewType", editItemListParam.getViewType());
		
		return query;
	}
}
