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
import com.fashiongo.cms.model.ImageList;
import com.fashiongo.cms.model.NewItem;
import com.fashiongo.cms.model.NewItemList;
import com.fashiongo.cms.param.NewItemListParam;
import com.fashiongo.cms.service.NewItemService;

@RestController
@RequestMapping("/new_item")
public class NewItemController {
	
	@Autowired
	private NewItemService newItemService;
	
	/**
	 * 
	 * @param newItemListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 28.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<NewItemList>> list(NewItemListParam newItemListParam) throws Exception {
		JSONResponse<List<NewItemList>> jsonResponse = new JSONResponse<>();
		List<NewItemList> newItemList = new ArrayList<>();
		newItemList = newItemService.selectNewItemList(newItemListParam);
		jsonResponse.setData(newItemList);
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param productID
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 28.
	 */
	@RequestMapping(value = "/imglist/{productID}", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<ImageList>> imgList(@PathVariable Integer productID) throws Exception {
		JSONResponse<List<ImageList>> jsonResponse = new JSONResponse<>();
		List<ImageList> imageList = new ArrayList<>();
		imageList = newItemService.selectImageList(productID);
		jsonResponse.setData(imageList);
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param productID
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 28.
	 */
	@RequestMapping(value = "/detail/{productID}", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<NewItem> detailNewItem(@PathVariable Integer productID) throws Exception {
		
		JSONResponse<NewItem> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(newItemService.selectDetailNewItem(productID));
		
		return jsonResponse;
	}
}