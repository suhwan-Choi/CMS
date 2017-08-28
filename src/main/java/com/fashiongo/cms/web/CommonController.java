package com.fashiongo.cms.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.CategoryList;
import com.fashiongo.cms.service.CategoryService;

@RestController
@RequestMapping("/common")
public class CommonController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/categorylist", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<CategoryList>> list() throws Exception {
		JSONResponse<List<CategoryList>> jsonResponse = new JSONResponse<>();
		List<CategoryList> categoryList = new ArrayList<>();
		categoryList = categoryService.selectCategoryList();
		jsonResponse.setData(categoryList);
		return jsonResponse;
	}
}