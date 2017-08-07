package com.fashiongo.cms.config.security.jwt;

import org.apache.commons.lang3.StringUtils;

public class AccountCredentials {
	private String username;
	private String password;
	private String accesscode;
	private String ip;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccesscode() {
		return accesscode;
	}

	public void setAccesscode(String accesscode) {
		if(StringUtils.isNotBlank(accesscode)) {
			accesscode = StringUtils.trim(accesscode);
		}else {
			accesscode = null;
		}
		
		this.accesscode = accesscode;
	}

	public String getIp() {
		if(StringUtils.isNotBlank(ip)) {
			ip = StringUtils.trim(ip);
		}else {
			ip = null;
		}
		
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}