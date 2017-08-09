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
import com.fashiongo.cms.model.GroupManager;
import com.fashiongo.cms.model.GroupManagerList;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.GroupManagerListParam;
import com.fashiongo.cms.param.GroupManagerSaveParam;
import com.fashiongo.cms.service.GroupManagerService;

@RestController
@RequestMapping("/group_manager")
public class GroupManagerController {

	@Autowired
	private GroupManagerService groupManagerService;

	/**
	 * 
	 * @param groupManagerListParam
	 * @return
	 * @throws Exception
	 * @author : Mason
	 * @date : 2017. 8. 9.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<GroupManagerList>> list(GroupManagerListParam groupManagerListParam)
			throws Exception {
		JSONResponse<List<GroupManagerList>> jsonResponse = new JSONResponse<>();
		List<GroupManagerList> groupManagerList = groupManagerService.selectListGroupManager(groupManagerListParam);
		jsonResponse.setData(groupManagerList);
		return jsonResponse;
	}

	/**
	 * 
	 * @param groupId
	 * @return
	 * @throws Exception
	 * @author : Mason
	 * @date : 2017. 8. 9.
	 */
	@RequestMapping(value = "/detail/{groupId}", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<GroupManager> detailGroupManager(@PathVariable Integer groupId) throws Exception {
		JSONResponse<GroupManager> jsonResponse = new JSONResponse<>();
		GroupManager groupManager = groupManagerService.selectDetailGroupManager(groupId);
		jsonResponse.setData(groupManager);
		return jsonResponse;
	}

	/**
	 * 
	 * @param groupManagerSaveParam
	 * @return
	 * @throws Exception
	 * @author : Mason
	 * @date : 2017. 8. 9.
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public JSONResponse<ProcedureResult> save(@RequestBody GroupManagerSaveParam groupManagerSaveParam) throws Exception {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(groupManagerService.mergeSaveGroupManager(groupManagerSaveParam));
		return jsonResponse;
	}

	/**
	 * 
	 * @param groupId
	 * @return
	 * @throws Exception
	 * @author : Mason
	 * @date : 2017. 8. 9.
	 */
	@RequestMapping(value = "/delete/{groupId}", method = RequestMethod.POST)
	public JSONResponse<ProcedureResult> delete(@PathVariable Integer groupId) throws Exception {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		ProcedureResult result = groupManagerService.delete(groupId);
		jsonResponse.setData(result);
		return jsonResponse;
	}
}
