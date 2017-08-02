package com.fashiongo.cms.security.model;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;

public class UserContext {
	private final String username;
	private final List<GrantedAuthority> authories;

	private UserContext(String username, List<GrantedAuthority> authorities) {
		this.username = username;
		this.authories = authorities;

	}
	
	private static UserContext create(String username, List<GrantedAuthority> authorities) {
		if(StringUtils.isBlank(username)) throw new IllegalArgumentException("Username is blank" + username);
		return new UserContext(username, authorities);
	}
	

}
