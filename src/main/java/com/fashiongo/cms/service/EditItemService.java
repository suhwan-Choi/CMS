package com.fashiongo.cms.service;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.param.EditItemListParam;
import com.fashiongo.cms.param.EditItemListUserParam;
import com.fashiongo.cms.param.EditItmSaveItemParam;
import com.fashiongo.cms.param.EditItmSaveRollBackParam;

@Service
public class EditItemService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(EditItemService.class);
	
	public void selectList(EditItemListParam editItemListParam) {
		Query query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void selectListUser(EditItemListUserParam editItemListUserParam) {
		Query query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void updateSaveRollback(EditItmSaveRollBackParam editItmSaveRollBackParam) {
		Query query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void mergeSaveRollback(EditItmSaveItemParam editItmSaveItemParam) {
		Query query = entityManager.createNamedStoredProcedureQuery("");
	}
}
