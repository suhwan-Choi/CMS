package com.fashiongo.cms.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.param.AssignRollBackListAssignParam;
import com.fashiongo.cms.param.AssignRollBackListRollBackParam;
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
	
	@RequestMapping(value = "/list_assign", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<?> listAssign(AssignRollBackListAssignParam assignRollBackListAssignParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		assignRollBackService.selectAssignList(assignRollBackListAssignParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/list_rollback", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<?> listRollback(AssignRollBackListRollBackParam assignRollBackListRollBackParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		assignRollBackService.selectRollbackList(assignRollBackListRollBackParam);
 		
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
