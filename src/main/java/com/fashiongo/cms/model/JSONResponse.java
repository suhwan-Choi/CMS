package com.fashiongo.cms.model;

/**
 * JSONResponse<T>
 * @author SearchTeam
 * @param <T>
 */
public class JSONResponse<T> {
	private boolean success;
	private String reason;
	private long totalCount;
	private T data;
	
	public boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public long getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
}
