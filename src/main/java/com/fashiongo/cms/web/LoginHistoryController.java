package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.LoginHistoryService;

@RestController
@RequestMapping("/login_history")
public class LoginHistoryController {
	
	@Autowired
	private LoginHistoryService loginHistoryService;

}
