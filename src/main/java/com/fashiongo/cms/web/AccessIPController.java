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
import com.fashiongo.cms.param.AccessIPListParam;
import com.fashiongo.cms.model.AccessIP;

import com.fashiongo.cms.common.JSONResponse;

@RestController
@RequestMapping("/access_ip")
public class AccessIPController {
	
	@Autowired
	private AccessIPService accessIPService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<AccessIP>> list(AccessIPListParam accessIPListParam) throws Exception {
		JSONResponse<List<AccessIP>> jsonResponse = new JSONResponse<>();
		List<AccessIP> accessIPList = new ArrayList<>();
		accessIPList = accessIPService.selectAccessIPList(accessIPListParam);
		jsonResponse.setData(accessIPList);
		return jsonResponse;
	}
}
