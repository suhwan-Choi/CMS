package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.param.EditItemListParam;
import com.fashiongo.cms.param.EditItemListUserParam;
import com.fashiongo.cms.param.EditItmSaveItemParam;
import com.fashiongo.cms.param.EditItmSaveRollBackParam;
import com.fashiongo.cms.service.EditItemService;

@RestController
@RequestMapping("/edit_item")
public class EditItemController {
	
	@Autowired
	private EditItemService editItemService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<String> list(EditItemListParam editItemListParam) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		editItemService.selectList(editItemListParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/list_user", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<String> listUser(EditItemListUserParam editItemListUserParam) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		editItemService.selectListUser(editItemListUserParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/save_rollback", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<String> saveRollback(EditItmSaveRollBackParam editItmSaveRollBackParam) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		editItemService.updateSaveRollback(editItmSaveRollBackParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/save_item", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<String> saveItem(EditItmSaveItemParam editItmSaveItemParam) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		editItemService.mergeSaveRollback(editItmSaveItemParam);
 		
		return response;
	}
}
