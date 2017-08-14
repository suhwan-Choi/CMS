package com.fashiongo.cms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.model.UserManager;
import com.fashiongo.cms.model.UserManagerList;
import com.fashiongo.cms.param.UserManagerDeleteParam;
import com.fashiongo.cms.param.UserManagerListParam;
import com.fashiongo.cms.param.UserManagerSaveParam;
import com.fashiongo.cms.service.UserManagerService;

@RestController
@RequestMapping("/user_manager")
public class UserManagerController {

	@Autowired
	private UserManagerService userManagerService;

	/**
	 * 
	 * @param userManagerParam
	 * @return
	 * @throws Exception
	 * @author : Mason
	 * @date : 2017. 8. 11.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<UserManagerList>> list(UserManagerListParam userManagerParam) throws Exception {
		JSONResponse<List<UserManagerList>> jsonResponse = new JSONResponse<List<UserManagerList>>();
		jsonResponse.setData(userManagerService.selectListUserManager(userManagerParam));

		return jsonResponse;
	}

	/**
	 * Search one user
	 * @param userID
	 * @return 
	 * @throws Exception
	 * @author : Mason
	 * @date : 2017. 8. 11.
	 */
	@RequestMapping(value = "/detail/{userID}", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<UserManager> detail(@PathVariable int userID) throws Exception {
		JSONResponse<UserManager> jsonResponse = new JSONResponse<>();
		UserManager userManager = userManagerService.selectDetailUserManager(userID);
		jsonResponse.setData(userManager);
		return jsonResponse;
	}

	/**
	 * Save one user
	 * @param userManagerSaveParam
	 * @return resultCode: SaveUserId success, other failure 
	 * @author : Mason
	 * @date : 2017. 8. 11.
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<ProcedureResult> save(@RequestBody UserManagerSaveParam userManagerSaveParam) {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		ProcedureResult procedureResult = userManagerService.mergeSaveUserManager(userManagerSaveParam);
		jsonResponse.setData(procedureResult);
		return jsonResponse;
	}

	/**
	 * Remove one user
	 * @param userManagerDeleteParam
	 * @return resultCode:0 success, resultCode<0 failure
	 * @author : Mason
	 * @date : 2017. 8. 11.
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<ProcedureResult> delete(@RequestBody UserManagerDeleteParam userManagerDeleteParam) {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		ProcedureResult procedureResult = userManagerService.delete(userManagerDeleteParam);
		jsonResponse.setData(procedureResult);
		return jsonResponse;
	}

}
