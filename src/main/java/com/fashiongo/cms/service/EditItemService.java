package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.EditItem;
import com.fashiongo.cms.model.EditItemUser;
import com.fashiongo.cms.param.EditItemListParam;
import com.fashiongo.cms.param.EditItemListUserParam;
import com.fashiongo.cms.param.EditItmSaveItemParam;
import com.fashiongo.cms.param.EditItmSaveRollBackParam;

@Service
public class EditItemService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(EditItemService.class);
	
	@SuppressWarnings("unchecked")
	public List<EditItem> selectList(EditItemListParam editItemListParam) {
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetEditItemList");
		
		query.setParameter("Page", editItemListParam.getPn());
		query.setParameter("PageSize", editItemListParam.getPs());
		query.setParameter("UserID", editItemListParam.getUserID());
		query.setParameter("SearchDateType", editItemListParam.getSearchDateType());
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
	
	@SuppressWarnings("unchecked")
	public List<EditItemUser> selectListUser(EditItemListUserParam editItemListUserParam) {
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetEditItemUser");
		
		query.setParameter("SearchDateType", editItemListUserParam.getSearchDateType());
		query.setParameter("SearchStartDate", editItemListUserParam.getSearchStartDate());
		query.setParameter("SearchEndDate", editItemListUserParam.getSearchEndDate());
		
		return (List<EditItemUser>) query.getResultList();
	}
	
	public void updateSaveRollback(EditItmSaveRollBackParam editItmSaveRollBackParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void mergeSaveRollback(EditItmSaveItemParam editItmSaveItemParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
}
