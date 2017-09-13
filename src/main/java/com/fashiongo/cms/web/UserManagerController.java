package com.fashiongo.cms.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.model.UserManagerDetail;
import com.fashiongo.cms.model.UserManagerList;
import com.fashiongo.cms.param.UserManagerDeleteParam;
import com.fashiongo.cms.param.UserManagerListParam;
import com.fashiongo.cms.param.UserManagerSaveParam;
import com.fashiongo.cms.service.AuthService;
import com.fashiongo.cms.service.UserManagerService;
import com.fashiongo.cms.util.JWTTokenUtil;

@RestController
@RequestMapping("/user_manager")
public class UserManagerController {
	
	@Value("${cms.jwt.refersh-attribute.value}")
	private String attrubute;

	@Autowired
	private UserManagerService userManagerService;
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private JWTTokenUtil jwtTokenUtil;

	/**
	 * Select UserManager List
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
	public @ResponseBody JSONResponse<UserManagerDetail> detail(@PathVariable int userID) throws Exception {
		
		JSONResponse<UserManagerDetail> jsonResponse = new JSONResponse<UserManagerDetail>();
		
		UserManagerDetail detailInfo = new UserManagerDetail();
		
		if(userID > 0) {
			detailInfo.setUserDetail(userManagerService.selectDetailUserManager(userID));
		}
		
		detailInfo.setComboGroup(userManagerService.selectDetailComboAccessGroup());

		jsonResponse.setData(detailInfo);
		
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
	public @ResponseBody JSONResponse<ProcedureResult> save(HttpServletRequest request, @RequestBody UserManagerSaveParam userManagerSaveParam) throws Exception  {
		
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<ProcedureResult>();
	
		ProcedureResult procedureResult = userManagerService.mergeSaveUserManager(userManagerSaveParam);
		jsonResponse.setData(procedureResult);
		
		return jsonResponse;
	}

	/**
	 * Remove one user
	 * @param userManagerDeleteParam
	 * @return resultCode : 0 success, resultCode < 0 failure
	 * @author : Mason
	 * @date : 2017. 8. 11.
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<ProcedureResult> delete(@RequestBody UserManagerDeleteParam userManagerDeleteParam) throws Exception {
		
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<ProcedureResult>();
		
		ProcedureResult procedureResult = userManagerService.delete(userManagerDeleteParam);
		jsonResponse.setData(procedureResult);
		
		return jsonResponse;
	}
}