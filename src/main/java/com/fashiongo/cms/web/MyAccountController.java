package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.UserManager;
import com.fashiongo.cms.service.UserManagerService;

@RestController
@RequestMapping("/my_account")
public class MyAccountController {

	@Autowired
	private UserManagerService userManagerService;

	@RequestMapping(value = "/detail/{userID}", method = RequestMethod.GET)
	public JSONResponse<UserManager> detail(@PathVariable Integer userID) {
		JSONResponse<UserManager> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(userManagerService.selectDetailUserManager(userID));
		return jsonResponse;
	}
}
