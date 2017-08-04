package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.AccessIPService;

@RestController
@RequestMapping("/access_ip")
public class AccessIPController {
	
	@Autowired
	private AccessIPService accessIPService;

}
