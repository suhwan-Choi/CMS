package com.fashiongo.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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
public class SearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	}
}
