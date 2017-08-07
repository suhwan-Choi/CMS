package com.fashiongo.cms.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.param.AssignRollBackAssignListParam;
import com.fashiongo.cms.param.AssignRollBackRollBackListParam;
import com.fashiongo.cms.param.AssignRollBackSaveAssignParam;
import com.fashiongo.cms.param.AssignRollBackSaveRejectParam;
import com.fashiongo.cms.param.AssignRollBackSaveReshareParam;
import com.fashiongo.cms.service.AssignRollBackService;

@RestController
@RequestMapping("/assign_rollback")
public class AssignRollBackController {
	private static Logger logger = LoggerFactory.getLogger(AssignRollBackController.class);
	
	@Autowired
	private AssignRollBackService assignRollBackService;
	
	@RequestMapping(value = "/assign_list", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<?> assignList(AssignRollBackAssignListParam assignRollBackAssignListParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		assignRollBackService.selectAssignList(assignRollBackAssignListParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/rollback_list", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<?> rollbackList(AssignRollBackRollBackListParam assignRollBackRollBackListParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		assignRollBackService.selectRollbackList(assignRollBackRollBackListParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/save_assign", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<?> saveAssign(AssignRollBackSaveAssignParam assignRollBackSaveAssignParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		assignRollBackService.mergeSaveAssign(assignRollBackSaveAssignParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/save_reject", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<?> saveReject(AssignRollBackSaveRejectParam assignRollBackSaveRejectParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		assignRollBackService.updateSaveReject(assignRollBackSaveRejectParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/save_reshare", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<?> saveReshare(AssignRollBackSaveReshareParam assignRollBackSaveReshareParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		assignRollBackService.updateSaveReshare(assignRollBackSaveReshareParam);
 		
		return response;
	}
	
}
