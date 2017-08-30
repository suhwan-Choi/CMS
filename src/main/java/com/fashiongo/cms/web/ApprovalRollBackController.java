package com.fashiongo.cms.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.param.ApprovalRollBackListApprovalParam;
import com.fashiongo.cms.param.ApprovalRollBackListRollBackParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveAssignParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveRejectParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveReshareParam;
import com.fashiongo.cms.service.ApprovalRollBackService;

@RestController
@RequestMapping("/approval_rollback")
public class ApprovalRollBackController {
	private static Logger logger = LoggerFactory.getLogger(ApprovalRollBackController.class);
	
	@Autowired
	private ApprovalRollBackService approvalRollBackService;
	
	@RequestMapping(value = "/list_assign", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<?> listAssign(ApprovalRollBackListApprovalParam assignRollBackListAssignParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		approvalRollBackService.selectApprovalList(assignRollBackListAssignParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/list_rollback", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<?> listRollback(ApprovalRollBackListRollBackParam assignRollBackListRollBackParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		approvalRollBackService.selectRollbackList(assignRollBackListRollBackParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/save_assign", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<?> saveApproval(ApprovalRollBackSaveAssignParam approvalRollBackSaveAssignParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		approvalRollBackService.mergeSaveApprove(approvalRollBackSaveAssignParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/save_reject", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<?> saveReject(ApprovalRollBackSaveRejectParam approvalRollBackSaveRejectParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		approvalRollBackService.updateSaveReject(approvalRollBackSaveRejectParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/save_reshare", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<?> saveReshare(ApprovalRollBackSaveReshareParam approvalRollBackSaveReshareParam) throws Exception{
 		JSONResponse<?> response = new JSONResponse<>();
 		approvalRollBackService.updateSaveReshare(approvalRollBackSaveReshareParam);
 		
		return response;
	}
	
}
