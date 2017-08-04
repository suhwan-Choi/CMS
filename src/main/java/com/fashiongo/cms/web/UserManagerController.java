package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.UserManagerService;

@RestController
@RequestMapping("/user_manager")
public class UserManagerController {
	
	@Autowired
	private UserManagerService userManagerService;

}
