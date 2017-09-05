package com.fashiongo.cms.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.service.ItemShareService;
import com.fashiongo.cms.param.ItemShareParam;
import com.fashiongo.cms.model.ItemShareUser;
import com.fashiongo.cms.model.ProcedureResult;

@RestController
@RequestMapping("/item_share")
public class ItemShareController {
	
	@Autowired
	private ItemShareService itemShareService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<ItemShareUser>> list() throws Exception {
		JSONResponse<List<ItemShareUser>> jsonResponse = new JSONResponse<>();
		List<ItemShareUser> itemShareUser = new ArrayList<>();
		itemShareUser = itemShareService.selectItemShareUser();
		jsonResponse.setData(itemShareUser);
		return jsonResponse;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public JSONResponse<ProcedureResult> save(@RequestBody ItemShareParam itemShareParam) throws Exception {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(itemShareService.mergeSaveItemShare(itemShareParam));
		return jsonResponse;
	}
}