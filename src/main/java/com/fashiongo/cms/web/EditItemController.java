package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.EditItemService;

@RestController
@RequestMapping("/edit_item")
public class EditItemController {
	
	@Autowired
	private EditItemService editItemService;

}
