package com.fashiongo.cms.config.security.jwt;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.fashiongo.cms.config.security.CMSAdminAuthenticationToken;
import com.fashiongo.cms.model.CMSAdminUser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {
	
	private final AuthenticationFailureHandler failureHandler;
	
	private TokenAuthService tokenAuthService;
	
	public JWTLoginFilter(String url, AuthenticationManager authenticationManager, AuthenticationFailureHandler failureHandler, TokenAuthService tokenAuthService) {
		super(new AntPathRequestMatcher(url));
		
		this.failureHandler = failureHandler;
		this.tokenAuthService = tokenAuthService;
		
		setAuthenticationManager(authenticationManager);
	}
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException{
		AccountCredentials credentials = new ObjectMapper().readValue(httpServletRequest.getInputStream(), AccountCredentials.class);
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(credentials.getUsername(), credentials.getPassword());
		
		return getAuthenticationManager().authenticate(token);
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication) throws IOException, ServletException {
		CMSAdminUser user = ((CMSAdminAuthenticationToken)authentication).getUserInfo();
		tokenAuthService.addAuthentication(response, authentication.getName(), user);
	}
	
	@Override
	protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
		failureHandler.onAuthenticationFailure(request, response, failed);
	}
	
}
