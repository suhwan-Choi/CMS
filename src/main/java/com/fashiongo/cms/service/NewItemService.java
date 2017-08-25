package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.AccessIP;
import com.fashiongo.cms.model.NewItem;
import com.fashiongo.cms.model.NewItemList;
import com.fashiongo.cms.param.NewItemListParam;
import com.fashiongo.cms.param.NewItemSaveShareParam;

@Service
public class NewItemService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(NewItemService.class);
	
	public void selectList(NewItemListParam newItemListParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void mergeSaveShare(NewItemSaveShareParam newItemSaveShareParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void selectDetail(Integer itemId) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<NewItem> selectDetailNewItem(Integer productID) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetItemDetail");
		query.setParameter("ProductID", productID);

		return (List<NewItem>) query.getResultList();
	}
	
	/**
	 * 
	 * @param NewItemListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 25.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<NewItemList> selectNewItemList(NewItemListParam NewItemListParam) throws Exception{
		List<NewItemList> newItemList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetNewItemList");
		query.setParameter("Page", NewItemListParam.getPage());
		query.setParameter("PageSize", NewItemListParam.getPageSize());
		query.setParameter("KeywordType", NewItemListParam.getKeywordType());
		query.setParameter("KeywordText", NewItemListParam.getKeywordText());
		query.setParameter("CategoryID1", NewItemListParam.getCategoryID1());
		query.setParameter("CategoryID2", NewItemListParam.getCategoryID2());
		query.setParameter("CategoryID3", NewItemListParam.getCategoryID3());
		query.setParameter("SearchDateType", NewItemListParam.getSearchDateType());
		query.setParameter("SearchStartDate", NewItemListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", NewItemListParam.getSearchEndDate());
		
		newItemList = (List<NewItemList>) query.getResultList();

		return newItemList;
	}
	
	/**
	 * 
	 * @param productID
	 * @return
	 * @author Reo
	 * @date 2017. 8. 25.
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	@SuppressWarnings("unchecked")
	public List<NewItem> selectDetailAccessIP(Integer productID) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAccessIP");
		query.setParameter("ProductID", productID);

		return (List<NewItem>) query.getResultList();
	}
}
