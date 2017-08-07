package com.fashiongo.cms.config.security;

import org.springframework.security.core.AuthenticationException;

import com.fashiongo.cms.model.ProcedureResult;

/**
 * BadCredentialsException
 * @author SearchTeam
 */
public class BadCredentialsException extends AuthenticationException {
	private static final long serialVersionUID = 7877931791655776182L;
	
	private Integer resultCode;
	
	public BadCredentialsException(ProcedureResult result) {
		super(result.getErrorMessage());
		
		this.resultCode = result.getResultCode();
	}

	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}
}
