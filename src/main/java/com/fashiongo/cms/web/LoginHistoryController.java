package com.fashiongo.cms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.LoginHistory;
import com.fashiongo.cms.param.LoginHistoryListParam;
import com.fashiongo.cms.service.LoginHistoryService;

@RestController
@RequestMapping("/login_history")
public class LoginHistoryController {
	
	@Autowired
	private LoginHistoryService loginHistoryService;

	/**
	 * Login History List
	 * @param loginHistoryListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 11.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<LoginHistory>> list(LoginHistoryListParam loginHistoryListParam) throws Exception {
		
		JSONResponse<List<LoginHistory>> jsonResponse = new JSONResponse<List<LoginHistory>>();
		jsonResponse.setData(loginHistoryService.selectAccessLoginHistoryList(loginHistoryListParam));
		
		return jsonResponse;
	}
}
