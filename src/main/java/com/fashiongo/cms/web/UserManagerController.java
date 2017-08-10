package com.fashiongo.cms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.UserManager;
import com.fashiongo.cms.model.UserManagerList;
import com.fashiongo.cms.param.UserManagerListParam;
import com.fashiongo.cms.service.UserManagerService;

@RestController
@RequestMapping("/user_manager")
public class UserManagerController {

	@Autowired
	private UserManagerService userManagerService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<UserManagerList>> list(UserManagerListParam userManagerParam)
			throws Exception {
		JSONResponse<List<UserManagerList>> jsonResponse = new JSONResponse<>();

		List<UserManagerList> userManagerList = userManagerService.selectListUserManager(userManagerParam);
		jsonResponse.setData(userManagerList);

		return jsonResponse;
	}

	@RequestMapping(value = "/detail/{userID}", method = RequestMethod.GET)
	public JSONResponse<UserManager> detail(@PathVariable int userID) throws Exception {
		JSONResponse<UserManager> jsonResponse = new JSONResponse<>();
		UserManager userManager = userManagerService.selectDetailUserManager(userID);
		jsonResponse.setData(userManager);
		return jsonResponse;
	}
}
