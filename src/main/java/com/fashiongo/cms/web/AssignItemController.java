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
import com.fashiongo.cms.model.AssignItemDetail;
import com.fashiongo.cms.model.AssignItemSimpleList;
import com.fashiongo.cms.model.AssignItemDetailList;
import com.fashiongo.cms.model.AssignItemThumbnailList;
import com.fashiongo.cms.param.AssignItemListParam;
import com.fashiongo.cms.service.AssignItemService;

@RestController
@RequestMapping("/assign_item")
public class AssignItemController {
	
	@Autowired
	private AssignItemService assignItemService;
	
	/**
	 * 
	 * @param assignItemListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@RequestMapping(value = "/simplelist", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<AssignItemSimpleList>> simplelist(AssignItemListParam assignItemListParam) throws Exception {
		JSONResponse<List<AssignItemSimpleList>> jsonResponse = new JSONResponse<>();
		List<AssignItemSimpleList> assignItemSimpleList = new ArrayList<>();
		assignItemSimpleList = assignItemService.selectAssignItemSimpleList(assignItemListParam);
		jsonResponse.setData(assignItemSimpleList);
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param assignItemListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@RequestMapping(value = "/detaillist", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<AssignItemDetailList>> detaillist(AssignItemListParam assignItemListParam) throws Exception {
		JSONResponse<List<AssignItemDetailList>> jsonResponse = new JSONResponse<>();
		List<AssignItemDetailList> assignItemDetailList = new ArrayList<>();
		assignItemDetailList = assignItemService.selectAssignItemDetailList(assignItemListParam);
		jsonResponse.setData(assignItemDetailList);
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param assignItemListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@RequestMapping(value = "/thumbnaillist", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<AssignItemThumbnailList>> thumbnaillist(AssignItemListParam assignItemListParam) throws Exception {
		JSONResponse<List<AssignItemThumbnailList>> jsonResponse = new JSONResponse<>();
		List<AssignItemThumbnailList> assignItemThumbnailList = new ArrayList<>();
		assignItemThumbnailList = assignItemService.selectAssignItemThumbnailList(assignItemListParam);
		jsonResponse.setData(assignItemThumbnailList);
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param productID
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@RequestMapping(value = "/imglist/{productID}", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<ImageList>> imgList(@PathVariable Integer productID) throws Exception {
		JSONResponse<List<ImageList>> jsonResponse = new JSONResponse<>();
		List<ImageList> imageList = new ArrayList<>();
		imageList = assignItemService.selectImageList(productID);
		jsonResponse.setData(imageList);
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param productID
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 10. 31.
	 */
	@RequestMapping(value = "/detail/{productID}", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<AssignItemDetail> detailNewItem(@PathVariable Integer productID) throws Exception {
		
		JSONResponse<AssignItemDetail> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(assignItemService.selectDetailAssignItem(productID));
		
		return jsonResponse;
	}
}