package com.fashiongo.cms.service;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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
}
