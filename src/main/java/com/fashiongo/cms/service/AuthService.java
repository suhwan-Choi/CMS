package com.fashiongo.cms.service;

import java.util.Date;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.fashiongo.cms.config.security.jwt.AccountDetails;
import com.fashiongo.cms.model.CMSAdminUser;
import com.fashiongo.cms.model.ProcedureResult;

@Service
public class AuthService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(AuthService.class);
	
	/**
	 * User Login Check
	 * @author Ian Lee
	 * @param authentication
	 * @return
	 */
	public ProcedureResult selectAdminLoginCheck(Authentication authentication) {
		AccountDetails details = (AccountDetails)authentication.getDetails();
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetLoginUserCheck");
		query.setParameter("UserAccount", authentication.getName());
		query.setParameter("Password", authentication.getCredentials().toString());
		query.setParameter("IpAddress", details.getIp());
		query.setParameter("AccessCode", details.getAccesscode());
		query.setParameter("NowOn", new Date());
		
		query.execute();
		
		ProcedureResult result = new ProcedureResult();
		result.setResultCode((Integer)query.getOutputParameterValue("ResultCode"));
		result.setErrorMessage((String)query.getOutputParameterValue("ErrorMessage"));
		
		return result;
	}

	/**
	 * Get UserInfo
	 * @author Ian Lee
	 * @param username
	 * @param password
	 * @return
	 */
	public CMSAdminUser selectAdminUser(String username, String password) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetLoginUser");
		query.setParameter("UserAccount", username);
		query.setParameter("Password", password);
		
		return (CMSAdminUser)query.getSingleResult();
	}
}
