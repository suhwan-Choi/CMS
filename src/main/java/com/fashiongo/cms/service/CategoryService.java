package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.CategoryList;

@Service
public class CategoryService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(CategoryService.class);
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<CategoryList> selectCategoryList() throws Exception{
		List<CategoryList> categoryList = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_ComboCategory");
		
		categoryList = (List<CategoryList>) query.getResultList();

		return categoryList;
	}
}