package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.GroupManagerService;

import com.fashiongo.cms.param.GroupManagerListParam;
import com.fashiongo.cms.param.GroupManagerSaveParam;
import com.fashiongo.cms.model.GroupManager;
import com.fashiongo.cms.model.GroupManagerList;

import com.fashiongo.cms.common.JSONResponse;

@RestController
@RequestMapping("/group_manager")
public class GroupManagerController {

	@Autowired
	private GroupManagerService groupManagerService;

	/**
	 * 
	 * @param groupManagerListParam
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public JSONResponse<GroupManagerList> groupManagerList(GroupManagerListParam groupManagerListParam) {
		JSONResponse<GroupManagerList> jsonResponse = new JSONResponse<>();
		GroupManagerList groupManagerList = new GroupManagerList();
		groupManagerList = groupManagerService.selectGroupManagerList(groupManagerListParam);
		jsonResponse.setData(groupManagerList);
		return jsonResponse;
	}

	/**
	 * 
	 * @param groupId
	 * @return specific Group Infor
	 */
	@RequestMapping(value = "/{groupId}}", method = RequestMethod.GET)
	public JSONResponse<GroupManager> groupManager(int groupId) {
		JSONResponse<GroupManager> jsonResponse = new JSONResponse<>();
		GroupManager groupManager = groupManagerService.selectGroupManager(groupId);
		jsonResponse.setData(groupManager);
		return jsonResponse;
	}

	public JSONResponse<GroupManager> groupManagerSave(GroupManagerSaveParam groupManagerSaveParam) {
		return null;
	}
}
