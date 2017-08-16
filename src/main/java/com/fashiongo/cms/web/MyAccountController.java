package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.model.UserManager;
import com.fashiongo.cms.param.MyAccountSaveParam;
import com.fashiongo.cms.service.MyAccountService;
import com.fashiongo.cms.service.UserManagerService;

@RestController
@RequestMapping("/my_account")
public class MyAccountController {

	@Autowired
	private UserManagerService userManagerService;

	@Autowired
	private MyAccountService myAccountService;

	@RequestMapping(value = "/detail/{userID}", method = RequestMethod.GET)
	public JSONResponse<UserManager> detail(@PathVariable Integer userID) throws Exception {
		JSONResponse<UserManager> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(userManagerService.selectDetailUserManager(userID));
		return jsonResponse;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public JSONResponse<ProcedureResult> save(@RequestBody MyAccountSaveParam myAccounSaveParam) throws Exception {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(myAccountService.modifyUserPassword(myAccounSaveParam));
		return jsonResponse;
	}
}
