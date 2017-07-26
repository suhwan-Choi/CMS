package com.fashiongo.cms.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.mapper.HelloMapper;
import com.fashiongo.cms.model.Employees;

/**
 * Sampler Service
 * @author Search Team
 */
@Service
public class HelloService {
	
	@Autowired
	private HelloMapper helloMapper;
	
	/**
	 * Select Hello(Test)
	 * @return
	 */
	@Transactional(readOnly=true)
	public String selectHello() {
		return helloMapper.selectHello();
	}
	
	/**
	 * Select EmployeesList(Test)
	 * @param paramMap
	 * @return
	 */
	@Transactional(readOnly=true)
	public List<Map<String,Object>> selectEmployeesList(Map<String,Object> paramMap) {
		return helloMapper.selectEmployees(paramMap);
	}
	
	/**
	 * Select EmployeesList(Test)
	 * @param paramMap
	 * @return
	 */
	@Transactional(readOnly=true)
	public List<Employees> selectEmployeesListForModel(boolean active) {
		return helloMapper.selectEmployeesForModel(active);
	}
}
