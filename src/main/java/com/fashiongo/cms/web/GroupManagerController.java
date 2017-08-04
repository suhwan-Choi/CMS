package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.GroupManagerService;

@RestController
@RequestMapping("/group_manager")
public class GroupManagerController {
	
	@Autowired
	private GroupManagerService groupManagerService;
}
