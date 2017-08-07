package com.fashiongo.cms.model;

public class ProcedureResult {
	private Integer resultCode;
	private String errorMessage;
	
	public Integer getResultCode() {
		return resultCode;
	}
	
	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
