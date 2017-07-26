package com.fashiongo.cms.model;

import java.io.Serializable;
import java.sql.Date;

import org.apache.ibatis.type.Alias;

@Alias("employees")
public class Employees implements Serializable{
	private static final long serialVersionUID = -289395225957815639L;

	private Integer employeeid;
	private String firstname;
	private String lastname;
	private String title;
	private String socialnumber;
	private Date birthdate;
	private Date hiredate;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	
	public Integer getEmployeeid() {
		return employeeid;
	}
	
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSocialnumber() {
		return socialnumber;
	}
	
	public void setSocialnumber(String socialnumber) {
		this.socialnumber = socialnumber;
	}
	
	public Date getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public Date getHiredate() {
		return hiredate;
	}
	
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
