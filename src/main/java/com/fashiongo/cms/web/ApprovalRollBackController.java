package com.fashiongo.cms.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.ApprovalItem;
import com.fashiongo.cms.model.EditItem;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.model.RollBackItems;
import com.fashiongo.cms.param.ApprovalItemsApproveParam;
import com.fashiongo.cms.param.ApprovalItemsRejectParam;
import com.fashiongo.cms.param.ApprovalRollBackListApprovalParam;
import com.fashiongo.cms.param.ApprovalRollBackListRollBackParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveRejectParam;
import com.fashiongo.cms.param.ApprovalRollBackSaveReshareParam;
import com.fashiongo.cms.service.ApprovalRollBackService;
import com.fashiongo.cms.service.EditItemService;
import com.fashiongo.cms.service.ItemShareService;

@RestController
@RequestMapping("/approval_rollback")
public class ApprovalRollBackController {
	private static Logger logger = LoggerFactory.getLogger(ApprovalRollBackController.class);

	@Autowired
	private ApprovalRollBackService approvalRollBackService;

	@Autowired
	private EditItemService editItemService;

	@Autowired
	private ItemShareService itemShareService;

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
	public @ResponseBody JSONResponse<List<RollBackItems>> listRollback(
			ApprovalRollBackListRollBackParam approvalRollBackListRollBackParam) throws Exception {
		JSONResponse<List<RollBackItems>> response = new JSONResponse<>();
		response.setData(approvalRollBackService.selectRollbackList(approvalRollBackListRollBackParam));
		return response;
	}

	@RequestMapping(value = "/detail/{sharedProductSeq}", method = RequestMethod.GET)
	public JSONResponse<EditItem> detailRollbackItem(@PathVariable Integer sharedProductSeq) {
		JSONResponse<EditItem> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(editItemService.selectEditItem(sharedProductSeq));
		return jsonResponse;
	}

	@RequestMapping(value = "approval/save", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<ProcedureResult> saveApproval(
			@RequestBody ApprovalItemsApproveParam approvalItemsApproveParam) throws Exception {
		JSONResponse<ProcedureResult> response = new JSONResponse<>();
		response.setData(approvalRollBackService.modifyApproveItems(approvalItemsApproveParam));
		return response;
	}

	@RequestMapping(value = "reject/save", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<ProcedureResult> saveReject(
			@RequestBody ApprovalItemsRejectParam approvalItemsRejectParam) throws Exception {
		JSONResponse<ProcedureResult> response = new JSONResponse<>();
		response.setData(approvalRollBackService.modifyRejectItems(approvalItemsRejectParam));
		return response;
	}

	@RequestMapping(value = "onereshare/save", method = RequestMethod.POST)
	public @ResponseBody JSONResponse<ProcedureResult> saveReshare(
			@RequestBody ApprovalRollBackSaveReshareParam approvalRollBackSaveReshareParam) throws Exception {
		JSONResponse<ProcedureResult> response = new JSONResponse<>();
		response.setData(itemShareService.mergeSaveItemReshare(approvalRollBackSaveReshareParam));
		return response;
	}

}
