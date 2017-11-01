package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.ImageList;
import com.fashiongo.cms.model.AssignItemDetail;
import com.fashiongo.cms.model.AssignItemSimpleList;
import com.fashiongo.cms.model.AssignItemDetailList;
import com.fashiongo.cms.model.AssignItemThumbnailList;
import com.fashiongo.cms.param.AssignItemListParam;

@Service
public class AssignItemService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(NewItemService.class);
	
	/**
	 * 
	 * @param productID
	 * @return
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public AssignItemDetail selectDetailAssignItem(Integer productID) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetItemDetail");
		query.setParameter("ProductID", productID);

		return (AssignItemDetail) query.getSingleResult();
	}
	
	/**
	 * 
	 * @param NewItemListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<AssignItemSimpleList> selectAssignItemSimpleList(AssignItemListParam assignItemListParam) throws Exception{
		List<AssignItemSimpleList> assignItemSimpleList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAssignItemSimpleList");
		query.setParameter("Page", assignItemListParam.getPage());
		query.setParameter("PageSize", assignItemListParam.getPageSize());
		query.setParameter("KeywordType", assignItemListParam.getKeywordType());
		query.setParameter("KeywordText", assignItemListParam.getKeywordText());
		query.setParameter("CategoryID", assignItemListParam.getCategoryID());
		query.setParameter("LengthID", assignItemListParam.getLengthID());
		query.setParameter("StyleID", assignItemListParam.getStyleID());
		query.setParameter("PatternID", assignItemListParam.getPatternID());
		query.setParameter("FabricID", assignItemListParam.getFabricID());
		query.setParameter("SearchDateType", assignItemListParam.getSearchDateType());
		query.setParameter("SearchStartDate", assignItemListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", assignItemListParam.getSearchEndDate());
		query.setParameter("ViewType", assignItemListParam.getViewType());
		
		assignItemSimpleList = (List<AssignItemSimpleList>) query.getResultList();

		return assignItemSimpleList;
	}
	
	/**
	 * 
	 * @param NewItemListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<AssignItemDetailList> selectAssignItemDetailList(AssignItemListParam assignItemListParam) throws Exception{
		List<AssignItemDetailList> assignItemDetailList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAssignItemDetailList");
		query.setParameter("Page", assignItemListParam.getPage());
		query.setParameter("PageSize", assignItemListParam.getPageSize());
		query.setParameter("KeywordType", assignItemListParam.getKeywordType());
		query.setParameter("KeywordText", assignItemListParam.getKeywordText());
		query.setParameter("CategoryID", assignItemListParam.getCategoryID());
		query.setParameter("LengthID", assignItemListParam.getLengthID());
		query.setParameter("StyleID", assignItemListParam.getStyleID());
		query.setParameter("PatternID", assignItemListParam.getPatternID());
		query.setParameter("FabricID", assignItemListParam.getFabricID());
		query.setParameter("SearchDateType", assignItemListParam.getSearchDateType());
		query.setParameter("SearchStartDate", assignItemListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", assignItemListParam.getSearchEndDate());
		query.setParameter("ViewType", assignItemListParam.getViewType());
		
		assignItemDetailList = (List<AssignItemDetailList>) query.getResultList();

		return assignItemDetailList;
	}
	
	/**
	 * 
	 * @param NewItemListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<AssignItemThumbnailList> selectAssignItemThumbnailList(AssignItemListParam assignItemListParam) throws Exception{
		List<AssignItemThumbnailList> assignItemThumbnailList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetAssignItemThumbnailList");
		query.setParameter("Page", assignItemListParam.getPage());
		query.setParameter("PageSize", assignItemListParam.getPageSize());
		query.setParameter("KeywordType", assignItemListParam.getKeywordType());
		query.setParameter("KeywordText", assignItemListParam.getKeywordText());
		query.setParameter("CategoryID", assignItemListParam.getCategoryID());
		query.setParameter("LengthID", assignItemListParam.getLengthID());
		query.setParameter("StyleID", assignItemListParam.getStyleID());
		query.setParameter("PatternID", assignItemListParam.getPatternID());
		query.setParameter("FabricID", assignItemListParam.getFabricID());
		query.setParameter("SearchDateType", assignItemListParam.getSearchDateType());
		query.setParameter("SearchStartDate", assignItemListParam.getSearchStartDate());
		query.setParameter("SearchEndDate", assignItemListParam.getSearchEndDate());
		query.setParameter("ViewType", assignItemListParam.getViewType());
		
		assignItemThumbnailList = (List<AssignItemThumbnailList>) query.getResultList();

		return assignItemThumbnailList;
	}
	
	/**
	 * 
	 * @param productID
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<ImageList> selectImageList(Integer productID) throws Exception{
		List<ImageList> imageItemList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetImage");
		query.setParameter("ProductID", productID);
		
		imageItemList = (List<ImageList>) query.getResultList();

		return imageItemList;
	}
}
