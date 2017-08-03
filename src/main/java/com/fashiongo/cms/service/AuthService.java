package com.fashiongo.cms.service;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.model.CMSAdminUser;

@Service
public class AuthService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(AuthService.class);

	public CMSAdminUser selectAdminUser(String username, String password) {
		logger.info("AuthService.selectAdminUser!!!");
		
		Query query = entityManager.createNamedStoredProcedureQuery("get_adminUserInfo");
		query.setParameter("username", username);
		query.setParameter("password", password);
		
		CMSAdminUser adminUser = null;
		
		try {
			adminUser = (CMSAdminUser)query.getSingleResult();
		}catch(Exception e) {}
		
		return adminUser;
	}
}
