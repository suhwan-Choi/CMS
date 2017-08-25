package com.fashiongo.cms.service;

import java.util.Date;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional(readOnly = true)
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
	@Transactional(readOnly = true)
	public CMSAdminUser selectAdminUser(String username, String password) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetLoginUser");
		query.setParameter("UserAccount", username);
		query.setParameter("Password", password);
		
		return (CMSAdminUser)query.getSingleResult();
	}
	
	/**
	 * Get UserInfo(UserID)
	 * @author Ian Lee
	 * @param username
	 * @param password
	 * @return
	 */
	@Transactional(readOnly = true)
	public CMSAdminUser selectAdminUser(Integer userId) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_GetLoginUserForID");
		query.setParameter("UserID", userId);
		
		return (CMSAdminUser)query.getSingleResult();
	}

	/**
	 * Insert Login History
	 * @param authentication
	 * @param userInfo
	 * @return
	 */
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult insertLoginHistory(Authentication authentication, CMSAdminUser userInfo) {
		AccountDetails details = (AccountDetails)authentication.getDetails();
		
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_CreateLogLogin");
		query.setParameter("SessionKey", userInfo.getSessionId());
		query.setParameter("UserID", userInfo.getUserId());
		query.setParameter("UserAccount", userInfo.getUserAccount());
		query.setParameter("UserName", userInfo.getUserName());
		query.setParameter("GroupID", userInfo.getGroupId());
		query.setParameter("GroupName", userInfo.getGroupName());
		query.setParameter("IPAddress", details.getIp());
		query.setParameter("AccessCode", details.getAccesscode());
		
		query.execute();
		
		ProcedureResult result = new ProcedureResult();
		result.setResultCode((Integer)query.getOutputParameterValue("ResultCode"));
		result.setErrorMessage((String)query.getOutputParameterValue("ErrorMessage"));
		
		return result;
	}
}
