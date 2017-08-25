package com.fashiongo.cms.service;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.MyAccountSaveParam;;

@Service
public class MyAccountService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(MyAccountService.class);
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public ProcedureResult modifyUserPassword(MyAccountSaveParam myAccountSaveParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_ModifyUserPassword");
		
		query.setParameter("UserID", myAccountSaveParam.getUserID());
		query.setParameter("UserPassword", myAccountSaveParam.getUserPassword());
		query.setParameter("WorkedBy", myAccountSaveParam.getWorkedBy());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));
		return procedureResult;
	}
}
