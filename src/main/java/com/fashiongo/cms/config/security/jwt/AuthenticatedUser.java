package com.fashiongo.cms.config.security.jwt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.fashiongo.cms.model.CMSAdminUser;

public class AuthenticatedUser implements Authentication {
	private static final long serialVersionUID = -1613901678347896828L;
	
	private String name;
	private CMSAdminUser adminUser;
    private boolean authenticated = true;

    public AuthenticatedUser(String name, CMSAdminUser adminUser){
        this.name = name;
        this.adminUser = adminUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    	List<GrantedAuthority> grantedAuths = new ArrayList<>();
		grantedAuths.add(new SimpleGrantedAuthority("CMS_ADMIN"));
		
        return grantedAuths;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public CMSAdminUser getDetails() {
        return adminUser;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return this.authenticated;
    }

    @Override
    public void setAuthenticated(boolean b) throws IllegalArgumentException {
        this.authenticated = b;
    }

    @Override
    public String getName() {
        return this.name;
    }
}