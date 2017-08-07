package com.fashiongo.cms.service;

import javax.persistence.StoredProcedureQuery;

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
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void selectListUser(EditItemListUserParam editItemListUserParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void updateSaveRollback(EditItmSaveRollBackParam editItmSaveRollBackParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void mergeSaveRollback(EditItmSaveItemParam editItmSaveItemParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
}
