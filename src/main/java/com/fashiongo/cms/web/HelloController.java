package com.fashiongo.cms.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.model.Employees;
import com.fashiongo.cms.model.JSONResponse;
import com.fashiongo.cms.service.HelloService;

/**
 * Sample Controller
 * @author Search Team
 */
@RestController
public class HelloController extends MainController{
	
	@Autowired
	private HelloService helloService;	
	
	@RequestMapping("/hello")
	public @ResponseBody JSONResponse<String> helloSpring(){
		JSONResponse<String> response = new JSONResponse<String>();
		response.setData(helloService.selectHello());
		response.setSuccess(true);
		
		return response;
	}
	
	@RequestMapping("/helloList")
	public @ResponseBody JSONResponse<List<Map<String,Object>>> helloSpringList(){
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("active", true);
		
		JSONResponse<List<Map<String,Object>>> response = new JSONResponse<List<Map<String,Object>>>();
		response.setData(helloService.selectEmployeesList(paramMap));
		response.setSuccess(true);
		
		return response;
	}
	
	@RequestMapping("/helloListModel")
	public @ResponseBody JSONResponse<List<Employees>> helloSpringListForModel(){
		JSONResponse<List<Employees>> response = new JSONResponse<List<Employees>>();
		response.setData(helloService.selectEmployeesListForModel(true));
		response.setSuccess(true);
		
		return response;
	}
}
