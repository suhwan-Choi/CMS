package com.fashiongo.cms.config.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.fashiongo.cms.common.ErrorResponse;
import com.fashiongo.cms.common.JSONResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.fashiongo.common.ErrorCode;

@Component
public class CMSAuthFailureHandler implements AuthenticationFailureHandler {
	private final ObjectMapper mapper;
    
    @Autowired
    public CMSAuthFailureHandler(ObjectMapper mapper) {
        this.mapper = mapper;
    }	
    
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException e) throws IOException, ServletException {
		
		response.setStatus(HttpStatus.UNAUTHORIZED.value());
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		
		JSONResponse<ErrorResponse> res;
		if(e instanceof BadCredentialsException){
			res = new JSONResponse<ErrorResponse>(true, "", ErrorResponse.of("Invalid username or password", ErrorCode.Authentication_Failure, HttpStatus.UNAUTHORIZED));
		}else{
			res = new JSONResponse<ErrorResponse>(true, "", ErrorResponse.of(e.getMessage(), ErrorCode.Authentication_Failure, HttpStatus.UNAUTHORIZED));
		}

		mapper.writeValue(response.getWriter(), res);
	}
}
