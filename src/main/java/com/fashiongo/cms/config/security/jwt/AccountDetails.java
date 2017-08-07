package com.fashiongo.cms.config.security.jwt;

public class AccountDetails {
	private String accesscode;
	private String ip;
	
	public AccountDetails(String accesscode, String ip) {
		this.accesscode = accesscode;
		this.ip = ip;
	}
	
	public String getAccesscode() {
		return accesscode;
	}
	
	public void setAccesscode(String accesscode) {
		this.accesscode = accesscode;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
}
