package com.fashiongo.cms.config.security.jwt;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.CMSAdminUser;
import com.fashiongo.cms.util.JWTTokenUtil;

@Component("tokenAuthService")
public class TokenAuthService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Value("${cms.jwt.header.value}")
	private String headerString;
	
	@Autowired
	private JWTTokenUtil jwtTokenUtil;
	
	@SuppressWarnings("deprecation")
	public void addAuthentication(HttpServletResponse response, String userName, CMSAdminUser adminUser)  {
		try {
			String jwtToken = jwtTokenUtil.generateToken(adminUser);
			
			logger.info("addAuthentication :: " + jwtToken);
			
			response.addHeader(headerString, jwtToken);
			
			OutputStream ostr = response.getOutputStream();
			JSONResponse<String> res = new JSONResponse<String>();
			res.setSuccess(true);
			res.setData(jwtToken);
			
			ObjectMapper om = new ObjectMapper();
			String returnStr = om.defaultPrettyPrintingWriter().writeValueAsString(res);

			ostr.write(returnStr.getBytes());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public AuthenticatedUser getAuthentication(HttpServletRequest request) {
		try {
			String jwtToken = request.getHeader(headerString);
			logger.info("getAuthentication :: jwtToken = " +jwtToken);
			
			boolean isValid = jwtTokenUtil.validateToken(jwtToken);
			
			logger.info("getAuthentication :: isValid = " + isValid);
			
			if(isValid) {
				String username = jwtTokenUtil.getUsernameFromToken(jwtToken);
				CMSAdminUser adminUser = jwtTokenUtil.getAdminUserFromToken(jwtToken);
				
				return new AuthenticatedUser(username, adminUser);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}