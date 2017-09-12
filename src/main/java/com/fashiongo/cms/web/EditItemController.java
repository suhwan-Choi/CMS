package com.fashiongo.cms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.EditItem;
import com.fashiongo.cms.model.EditItemSaveResult;
import com.fashiongo.cms.model.EditItemUser;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.EditItemListParam;
import com.fashiongo.cms.param.EditItemSaveItemParam;
import com.fashiongo.cms.param.EditItemSaveRollBackParam;
import com.fashiongo.cms.service.EditItemService;

@RestController
@RequestMapping("/edit_item")
public class EditItemController {
	
	@Autowired
	private EditItemService editItemService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<List<EditItem>> list(EditItemListParam editItemListParam) throws Exception{
		
 		JSONResponse<List<EditItem>> response = new JSONResponse<List<EditItem>>();
 		response.setData(editItemService.selectList(editItemListParam));
 		
		return response;
	}
	
	@RequestMapping(value = "/list_user", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<List<EditItemUser>> listUser(EditItemListParam editItemListParam) throws Exception{
		
 		JSONResponse<List<EditItemUser>> response = new JSONResponse<List<EditItemUser>>();
 		response.setData(editItemService.selectListUser(editItemListParam));
 		
		return response;
	}
	
	@RequestMapping(value = "/save_rollback", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<ProcedureResult> saveRollback(@RequestBody EditItemSaveRollBackParam editItmSaveRollBackParam) throws Exception{
 		
		JSONResponse<ProcedureResult> response = new JSONResponse<ProcedureResult>();
		response.setData(editItemService.insertSaveRollback(editItmSaveRollBackParam));
 		
		return response;
	}
	
	@RequestMapping(value = "/detail/{sharedProductSeq}", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<EditItem> detail(@PathVariable int sharedProductSeq) throws Exception{
		
 		JSONResponse<EditItem> response = new JSONResponse<EditItem>();
 		response.setData(editItemService.selectEditItem(sharedProductSeq));
 		
		return response;
	}
	
	@RequestMapping(value = "/save_item", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<EditItemSaveResult> saveItem(@RequestBody EditItemSaveItemParam editItemSaveItemParam) throws Exception{
 		
		JSONResponse<EditItemSaveResult> response = new JSONResponse<EditItemSaveResult>();
		EditItemSaveResult editItemSaveResult = new EditItemSaveResult();
		
		ProcedureResult procedureResult = editItemService.mergeSaveItem(editItemSaveItemParam);
		editItemSaveResult.setProcedureResult(procedureResult);
		
		if (procedureResult.getResultCode() == 0) {
			editItemSaveResult.setEditItem(editItemService.selectEditItem(editItemSaveItemParam.getSharedProductSeq()));
		}
		
		response.setData(editItemSaveResult);
 		
		return response;
	}
}
