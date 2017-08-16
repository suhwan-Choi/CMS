package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.MyAccountListParam;
import com.fashiongo.cms.service.MyAccountService;

@RestController
@RequestMapping("/my_account")
public class MyAccountController {
	
	@Autowired
	private MyAccountService myAccountService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public JSONResponse<ProcedureResult> save(@RequestBody MyAccountListParam myAccountListParam) throws Exception {
		
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(myAccountService.modifyUserPassword(myAccountListParam));
		
		return jsonResponse;
	}
}
