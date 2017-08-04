package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.service.NewItemService;

@RestController
@RequestMapping("/new_item")
public class NewItemController {
	
	@Autowired
	private NewItemService newItemService;
	
	@RequestMapping("/list")
 	public @ResponseBody JSONResponse<String> list() throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();

		response.setData("test");
		
		return response;
	}
}
