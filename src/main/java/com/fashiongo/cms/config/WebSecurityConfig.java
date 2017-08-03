package com.fashiongo.cms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fashiongo.cms.config.filter.SimpleCorsFilter;
import com.fashiongo.cms.config.security.CMSAuthenticationProvider;
import com.fashiongo.cms.config.security.jwt.JWTAuthenticationFilter;
import com.fashiongo.cms.config.security.jwt.JWTLoginFilter;
import com.fashiongo.cms.config.security.jwt.TokenAuthService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private CMSAuthenticationProvider authenticationProvider;
	
	@Autowired
	private AuthenticationFailureHandler failureHandler;
	
	@Autowired
	private TokenAuthService tokenAuthService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http 
			.addFilterBefore(new SimpleCorsFilter(), ChannelProcessingFilter.class)
			.addFilterBefore(new JWTLoginFilter("/auth/login", authenticationManager(), failureHandler, tokenAuthService), UsernamePasswordAuthenticationFilter.class)
			.addFilterBefore(new JWTAuthenticationFilter(tokenAuthService), UsernamePasswordAuthenticationFilter.class)
			.csrf().disable() 
			.authorizeRequests() 
			.antMatchers("/auth/login").permitAll() 
			.antMatchers(HttpMethod.OPTIONS, "/**").permitAll() 
			.antMatchers("/**").hasAuthority("CMS_ADMIN")
			.anyRequest().authenticated();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(this.authenticationProvider);
	}
}