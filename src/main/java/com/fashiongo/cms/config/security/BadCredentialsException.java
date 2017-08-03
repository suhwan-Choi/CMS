package com.fashiongo.cms.config.security;

import org.springframework.security.core.AuthenticationException;

public class BadCredentialsException extends AuthenticationException {
	private static final long serialVersionUID = 7877931791655776182L;

	public BadCredentialsException() {
		super("The email address and password combination is invalid.");
	}
}
