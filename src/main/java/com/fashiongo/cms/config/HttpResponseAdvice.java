package com.fashiongo.cms.config;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.fashiongo.cms.model.EditItem;

@ControllerAdvice
public class HttpResponseAdvice implements ResponseBodyAdvice<Object>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
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
				((JSONResponse<Object>) body).setToken(refreshToken.toString());
			}
			
			Object test = ((JSONResponse<Object>) body).getData();
			
			if (test instanceof List<?>) {
				if (((List) test).get(0) instanceof EditItem) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					logger.info("===============================================================");
					logger.info(((List<EditItem>)test).get(0).getSeq() + "");
					logger.info(((List<EditItem>)test).get(0).getAssignedOn().getTime() + "");
					logger.info(sdf.format(((List<EditItem>)test).get(0).getAssignedOn()));
					logger.info("===============================================================");
				}
			}
			
		}
		
		return body;
	}

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}
	
}
