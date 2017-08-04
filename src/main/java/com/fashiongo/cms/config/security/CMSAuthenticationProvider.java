package com.fashiongo.cms.config.security;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.fashiongo.cms.model.CMSAdminUser;
import com.fashiongo.cms.service.AuthService;

@Component
public class CMSAuthenticationProvider implements AuthenticationProvider{
	private static final Logger logger = LoggerFactory.getLogger(CMSAuthenticationProvider.class);
	
	@Autowired
	private AuthService authService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		Object password = authentication.getCredentials();
		
		logger.info("username :: " + username + " / password :: " + password);
		CMSAdminUser adminUser = authService.selectAdminUser(username, password.toString());
		
		if(adminUser == null) {
			throw new BadCredentialsException();
		}
		
		if(!adminUser.getGroupActive()) {
			throw new BadAccessGroupException();
		}

		List<GrantedAuthority> grantedAuths = new ArrayList<>();
		grantedAuths.add(new SimpleGrantedAuthority("CMS_ADMIN"));
		
		CMSAdminUser userInfo = new CMSAdminUser();
		userInfo.setUserId(adminUser.getUserId());
		userInfo.setUserName(adminUser.getUserName());
		userInfo.setUserAccount(adminUser.getUserAccount());
		userInfo.setGroupId(adminUser.getGroupId());
		userInfo.setGroupName(adminUser.getGroupName());
		userInfo.setGroupActive(adminUser.getGroupActive());
		
		CMSAdminAuthenticationToken authToken = new CMSAdminAuthenticationToken(username, password, grantedAuths);
		authToken.setUserInfo(userInfo);
		
		return authToken;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}
}