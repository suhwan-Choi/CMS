package com.fashiongo.cms.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * CommonException
 * @author SearchTeam
 */
@ControllerAdvice
public class CommonException {
	
	@ExceptionHandler(value = Exception.class)
	public @ResponseBody JSONResponse<String> exceptionHander(Exception e){
		JSONResponse<String> response = new JSONResponse<String>();
		response.setReason(e.toString());
		response.setSuccess(false);
		
		return response;
	}
}
