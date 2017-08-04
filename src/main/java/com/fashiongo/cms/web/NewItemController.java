package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.param.NewItemListParam;
import com.fashiongo.cms.param.NewItemSaveShareParam;
import com.fashiongo.cms.service.NewItemService;

@RestController
@RequestMapping("/new_item")
public class NewItemController {
	
	@Autowired
	private NewItemService newItemService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<String> list(NewItemListParam newItemListParam) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		newItemService.selectList(newItemListParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/save_share", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<String> saveShare(NewItemSaveShareParam newItemSaveShareParam) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		newItemService.mergeSaveShare(newItemSaveShareParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/detail/{itemId}", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<String> detail(@PathVariable("itemId") Integer itemId) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		newItemService.selectDetail(itemId);
		
		return response;
	}
}