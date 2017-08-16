package com.fashiongo.cms.service;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.fashiongo.cms.model.ProcedureResult;
import com.fashiongo.cms.param.MyAccountListParam;;

@Service
public class MyAccountService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(MyAccountService.class);

	public ProcedureResult modifyUserPassword(MyAccountListParam myAccountListParam) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("upWeb_ModifyUserPassword");
		
		query.setParameter("UserID", myAccountListParam.getUserID());
		query.setParameter("UserPassword", myAccountListParam.getUserPassword());
		query.setParameter("WorkedBy", myAccountListParam.getWorkedBy());

		query.execute();

		ProcedureResult procedureResult = new ProcedureResult();
		procedureResult.setResultCode((Integer) query.getOutputParameterValue("ResultCode"));
		procedureResult.setErrorMessage((String) query.getOutputParameterValue("ErrorMessage"));
		return procedureResult;
	}
}
