package com.fashiongo.cms.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;

/**
 * Sample Controller
 * @author Search Team
 */
@RestController
@RequestMapping("/sample")
public class HelloController {
	
	@RequestMapping("/hello")
	public @ResponseBody JSONResponse<String> helloSpring(){
		JSONResponse<String> response = new JSONResponse<String>();
		response.setData("welcome to the sample!!");
		response.setSuccess(true);
		
		return response;
	}
}
