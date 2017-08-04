package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.MyAccountService;

@RestController
@RequestMapping("/my_account")
public class MyAccountController {
	
	@Autowired
	private MyAccountService myAccountService;
}
