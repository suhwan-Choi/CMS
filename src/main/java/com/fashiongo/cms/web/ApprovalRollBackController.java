package com.fashiongo.cms.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.ApprovalItem;
import com.fashiongo.cms.model.RollBackItems;
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

	/**
	 * 
	 * @param assignRollBackListAssignParam
	 * @return approveItemList
	 * @throws Exception
	 * @author : Mason
	 * @date : 2017. 8. 30.
	 */
	@RequestMapping(value = "/list_approval", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<ApprovalItem>> listAssign(
			ApprovalRollBackListApprovalParam approvalRollBackListapprovalParam) throws Exception {
		JSONResponse<List<ApprovalItem>> response = new JSONResponse<>();
		response.setData(approvalRollBackService.selectApprovalList(approvalRollBackListapprovalParam));

		return response;
	}

	@RequestMapping(value = "/list_rollback", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<RollBackItems>> listRollback(ApprovalRollBackListRollBackParam approvalRollBackListRollBackParam)
			throws Exception {
		JSONResponse<List<RollBackItems>> response = new JSONResponse<>();
		response.setData(approvalRollBackService.selectRollbackList(approvalRollBackListRollBackParam));
		return response;
	}

	@RequestMapping(value = "/save_approval", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<?> saveApproval(ApprovalRollBackSaveAssignParam approvalRollBackSaveAssignParam)
			throws Exception {
		JSONResponse<?> response = new JSONResponse<>();
		approvalRollBackService.mergeSaveApprove(approvalRollBackSaveAssignParam);

		return response;
	}

	@RequestMapping(value = "/save_reject", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<?> saveReject(ApprovalRollBackSaveRejectParam approvalRollBackSaveRejectParam)
			throws Exception {
		JSONResponse<?> response = new JSONResponse<>();
		approvalRollBackService.updateSaveReject(approvalRollBackSaveRejectParam);

		return response;
	}

	@RequestMapping(value = "/save_reshare", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<?> saveReshare(ApprovalRollBackSaveReshareParam approvalRollBackSaveReshareParam)
			throws Exception {
		JSONResponse<?> response = new JSONResponse<>();
		approvalRollBackService.updateSaveReshare(approvalRollBackSaveReshareParam);

		return response;
	}

}
