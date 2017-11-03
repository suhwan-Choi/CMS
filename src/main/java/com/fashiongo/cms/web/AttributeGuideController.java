package com.fashiongo.cms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.GuideAttribute;
import com.fashiongo.cms.model.GuideCategory;
import com.fashiongo.cms.model.GuideUpdate;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.GuideAttributeListParam;
import com.fashiongo.cms.param.GuideAttributeModifyParam;
import com.fashiongo.cms.param.GuideCategoryListParam;
import com.fashiongo.cms.service.AttributeGuideService;

@RestController
@RequestMapping("/attribute_guide")
public class AttributeGuideController {

	@Autowired
	AttributeGuideService attributeGuideService;

	@RequestMapping(value = "/category/list", method = RequestMethod.GET)
	public JSONResponse<List<GuideCategory>> listGuideCategory(GuideCategoryListParam guideCategoryListParam) {
		JSONResponse<List<GuideCategory>> response = new JSONResponse<List<GuideCategory>>();
		response.setData(attributeGuideService.selectGuideCategoryList(guideCategoryListParam));
		return response;
	}

	@RequestMapping(value = "/attribute/list", method = RequestMethod.GET)
	public JSONResponse<List<GuideAttribute>> listGuideAttribute(GuideAttributeListParam guideAttributeListParam) {
		JSONResponse<List<GuideAttribute>> response = new JSONResponse<List<GuideAttribute>>();
		response.setData(attributeGuideService.selectGuideAttributeList(guideAttributeListParam));
		return response;
	}

	@RequestMapping(value = "/update/list", method = RequestMethod.GET)
	public JSONResponse<List<GuideUpdate>> listGuideUpdate() {
		JSONResponse<List<GuideUpdate>> response = new JSONResponse<List<GuideUpdate>>();
		response.setData(attributeGuideService.selectUpdateGuideList());
		return response;
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<ProcedureResult> modifyGuideAttribute(
			@RequestBody GuideAttributeModifyParam guideAttributeModifyParam) {
		JSONResponse<ProcedureResult> response = new JSONResponse<>();
		response.setData(attributeGuideService.modifyGuideAttribute(guideAttributeModifyParam));
		return response;

	}
}
