package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.AssignRollBackService;

@RestController
@RequestMapping("/assign_rollback")
public class AssignRollBackController {
	
	@Autowired
	private AssignRollBackService assignRollBackService;
}
