package com.fashiongo.cms.param;

import java.util.Date;

public class AccessIPSaveParam{
	private Integer ipID;
	private String ipAddress;
	private Boolean active;
	private String ipDescription;
	private Date workedOn;
	private Integer workedBy;
	public Integer getIpID() {
		return ipID;
	}
	public void setIpID(Integer ipID) {
		this.ipID = ipID;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getIpDescription() {
		return ipDescription;
	}
	public void setIpDescription(String ipDescription) {
		this.ipDescription = ipDescription;
	}
	public Date getWorkedOn() {
		return workedOn;
	}
	public void setWorkedOn(Date workedOn) {
		this.workedOn = workedOn;
	}
	public Integer getWorkedBy() {
		return workedBy;
	}
	public void setWorkedBy(Integer workedBy) {
		this.workedBy = workedBy;
	}
	
	
}