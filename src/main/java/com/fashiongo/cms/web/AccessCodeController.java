package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.AccessCodeService;

@RestController
@RequestMapping("/access_code")
public class AccessCodeController {
	
	@Autowired
	private AccessCodeService accessCodeService;
}
