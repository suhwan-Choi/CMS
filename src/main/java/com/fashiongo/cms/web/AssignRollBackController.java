package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.param.AssignRollBackListParam;
import com.fashiongo.cms.service.AssignRollBackService;

@RestController
@RequestMapping("/assign_rollback")
public class AssignRollBackController {
	
	@Autowired
	private AssignRollBackService assignRollBackService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<?> list(AssignRollBackListParam assignRollBackListParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		
		return response;
	}
	
	@RequestMapping(value = "/save_assign", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<?> saveAssign() throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		
		return response;
	}
	
	
}
