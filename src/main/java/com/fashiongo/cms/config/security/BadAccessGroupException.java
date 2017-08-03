package com.fashiongo.cms.config.security;

import org.springframework.security.core.AuthenticationException;

public class BadAccessGroupException extends AuthenticationException {
	private static final long serialVersionUID = -7933208437094821526L;

	public BadAccessGroupException() {
		super("The user's group does not exist.");
	}
}
