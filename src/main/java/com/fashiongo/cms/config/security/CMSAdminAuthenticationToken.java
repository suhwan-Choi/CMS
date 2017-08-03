package com.fashiongo.cms.config.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.fashiongo.cms.model.CMSAdminUser;

public class CMSAdminAuthenticationToken extends UsernamePasswordAuthenticationToken{
	private static final long serialVersionUID = -1598377537700667966L;
	
	private CMSAdminUser userInfo;
	
	public CMSAdminAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
	}

	public CMSAdminAuthenticationToken(Object principal, Object credentials) {
		super(principal, credentials);
	}

	public CMSAdminUser getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(CMSAdminUser userInfo) {
		this.userInfo = userInfo;
	}
}