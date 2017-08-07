package com.fashiongo.cms.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.GroupManagerService;

import com.fashiongo.cms.param.GroupManagerListParam;
import com.fashiongo.cms.param.GroupManagerSaveParam;
import com.fashiongo.cms.model.GroupManager;

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
	public @ResponseBody JSONResponse<List<GroupManager>> list(GroupManagerListParam groupManagerListParam)
			throws Exception {
		JSONResponse<List<GroupManager>> jsonResponse = new JSONResponse<>();
		List<GroupManager> groupManagerList = new ArrayList<>();
		groupManagerList = groupManagerService.selectGroupManagerList(groupManagerListParam);
		jsonResponse.setData(groupManagerList);
		return jsonResponse;
	}

	/**
	 * 
	 * @param groupId
	 * @return
	 */
	@RequestMapping(value = "/detail/{groupId}", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<GroupManager> detailGroupManager(@PathVariable Integer groupId) {
		JSONResponse<GroupManager> jsonResponse = new JSONResponse<>();
		GroupManager groupManager = groupManagerService.selectGroupManager(groupId);
		jsonResponse.setData(groupManager);
		return jsonResponse;
	}

	public JSONResponse<GroupManager> save(GroupManagerSaveParam groupManagerSaveParam) {
		return null;
	}
}
