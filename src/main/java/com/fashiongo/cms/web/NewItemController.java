package com.fashiongo.cms.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.NewItem;
import com.fashiongo.cms.model.NewItemList;
import com.fashiongo.cms.param.NewItemListParam;
import com.fashiongo.cms.param.NewItemSaveShareParam;
import com.fashiongo.cms.service.NewItemService;

@RestController
@RequestMapping("/new_item")
public class NewItemController {
	
	@Autowired
	private NewItemService newItemService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<NewItemList>> list(NewItemListParam newItemListParam) throws Exception {
		JSONResponse<List<NewItemList>> jsonResponse = new JSONResponse<>();
		List<NewItemList> newItemList = new ArrayList<>();
		newItemList = newItemService.selectNewItemList(newItemListParam);
		jsonResponse.setData(newItemList);
		return jsonResponse;
	}
	
	@RequestMapping(value = "/save_share", method = RequestMethod.POST)
 	public @ResponseBody JSONResponse<String> saveShare(NewItemSaveShareParam newItemSaveShareParam) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		newItemService.mergeSaveShare(newItemSaveShareParam);
 		
		return response;
	}
	
	@RequestMapping(value = "/detail/{productID}", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<NewItem>> detailNewItem(@PathVariable Integer productID) throws Exception {
		JSONResponse<List<NewItem>> jsonResponse = new JSONResponse<>();
		List<NewItem> newItem = newItemService.selectDetailNewItem(productID);
		jsonResponse.setData(newItem);
		return jsonResponse;
	}
}