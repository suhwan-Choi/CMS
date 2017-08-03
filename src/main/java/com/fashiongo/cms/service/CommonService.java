package com.fashiongo.cms.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CommonService {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	@Autowired
	protected JdbcTemplate jdbcTemplate;
}
