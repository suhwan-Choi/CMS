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
import com.fashiongo.cms.service.AccessIPService;
import com.fashiongo.cms.param.AccessCodeListParam;
import com.fashiongo.cms.param.AccessIPListParam;
import com.fashiongo.cms.model.AccessCode;
import com.fashiongo.cms.model.AccessIP;

import com.fashiongo.cms.common.JSONResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.AccessCodeService;

@RestController
@RequestMapping("/access_code")
public class AccessCodeController {
	
	@Autowired
	private AccessCodeService accessCodeService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<AccessCode>> list(AccessCodeListParam accessCodeListParam) throws Exception {
		JSONResponse<List<AccessCode>> jsonResponse = new JSONResponse<>();
		List<AccessCode> accessCodeList = new ArrayList<>();
		accessCodeList = accessCodeService.selectAccessCodeList(accessCodeListParam);
		jsonResponse.setData(accessCodeList);
		return jsonResponse;
	}
}
