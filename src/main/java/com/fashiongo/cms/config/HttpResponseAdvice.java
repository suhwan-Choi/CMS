package com.fashiongo.cms.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.fashiongo.cms.common.JSONResponse;

@ControllerAdvice
public class HttpResponseAdvice implements ResponseBodyAdvice<Object>{
	
	@Value("${cms.jwt.refersh-attribute.value}")
	private String attrubute;

	@Override
	@SuppressWarnings("unchecked")
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		
		if(request instanceof ServletServerHttpRequest && body instanceof JSONResponse) {
			HttpServletRequest httpReq = ((ServletServerHttpRequest)request).getServletRequest();
			
			Object refreshToken = httpReq.getAttribute(attrubute);
			
			if(refreshToken != null) {
				System.out.println("refreshToken :: " + refreshToken);
				((JSONResponse<Object>) body).setToken(refreshToken.toString());
			}
		}
		
		return body;
	}

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}
	
}
