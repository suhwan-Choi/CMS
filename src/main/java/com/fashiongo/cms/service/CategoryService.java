package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.CategoryList;
import com.fashiongo.cms.model.CodeInfo;

@Service
public class CategoryService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(CategoryService.class);
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<CategoryList> selectCategoryList() throws Exception{
		
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_ComboCategory");

		return (List<CategoryList>) query.getResultList();
	}
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<CodeInfo> selectCodeList() throws Exception{

		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_ComboBaseCode");

		return (List<CodeInfo>) query.getResultList();
	}
}