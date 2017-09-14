package com.fashiongo.cms;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * SearchApplication
 * Guide (http://docs.spring.io/spring-boot/docs/1.2.2.RELEASE/reference/htmlsingle/#using-boot-maven)
 * @author Search Team
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SearchApplication extends SpringBootServletInitializer{
	
	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SearchApplication.class);
	}
}
