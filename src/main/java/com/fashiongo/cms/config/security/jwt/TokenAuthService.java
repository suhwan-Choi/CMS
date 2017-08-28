package com.fashiongo.cms.config.security.jwt;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.BaseInfo;
import com.fashiongo.cms.model.CMSAdminUser;
import com.fashiongo.cms.model.GroupManager;
import com.fashiongo.cms.service.CategoryService;
import com.fashiongo.cms.service.GroupManagerService;
import com.fashiongo.cms.util.JWTTokenUtil;

@Component("tokenAuthService")
public class TokenAuthService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Value("${cms.jwt.header.value}")
	private String headerString;
    
    @Value("${cms.jwt.refersh-attribute.value}")
	private String attrubute;
	
	@Autowired
	private JWTTokenUtil jwtTokenUtil;
	
	@Autowired
	private GroupManagerService groupManagerService;
	
	@Autowired
	private CategoryService categoryService;
	
	@SuppressWarnings("deprecation")
	public void addAuthentication(HttpServletResponse response, String userName, CMSAdminUser adminUser)  {
		try {
			String jwtToken = jwtTokenUtil.generateToken(adminUser);
			
			logger.info("addAuthentication jwtToken :: " + jwtToken);
			
			response.addHeader(headerString, jwtToken);
			
			OutputStream ostr = response.getOutputStream();
			
			JSONResponse<BaseInfo> res = new JSONResponse<BaseInfo>();
			res.setSuccess(true);
			res.setToken(jwtToken);
			
			BaseInfo baseInfo = new BaseInfo();
			baseInfo.setMenuList(groupManagerService.selectDetailGroupManager(adminUser.getGroupId()));
			baseInfo.setCategoryList(categoryService.selectCategoryList());
			res.setData(baseInfo);
			
			ObjectMapper om = new ObjectMapper();
			String returnStr = om.defaultPrettyPrintingWriter().writeValueAsString(res);

			ostr.write(returnStr.getBytes());
			
		}catch(Exception e) {}
	}
	
	public AuthenticatedUser getAuthentication(HttpServletRequest request) {
		try {
			String jwtToken = request.getHeader(headerString);
			
			logger.info("getAuthentication jwtToken :: " + jwtToken);
			
			if(jwtTokenUtil.validateToken(jwtToken)) {
				String username = jwtTokenUtil.getUsernameFromToken(jwtToken);
				CMSAdminUser adminUser = jwtTokenUtil.getAdminUserFromToken(jwtToken);
				
				if(jwtTokenUtil.canTokenBeRefreshed(jwtToken)) {
					String refreshToken = jwtTokenUtil.generateToken(adminUser);
					request.setAttribute(attrubute, refreshToken);
					
					logger.info("refresh jwtToken :: " + refreshToken);
				}
				
				return new AuthenticatedUser(username, adminUser);
			}
			
		}catch(Exception e) {}
		
		return null;
	}
	
	
}