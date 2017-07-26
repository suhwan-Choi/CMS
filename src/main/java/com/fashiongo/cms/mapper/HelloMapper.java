package com.fashiongo.cms.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fashiongo.cms.model.Employees;

@Mapper
public interface HelloMapper {
	public String selectHello();
	public List<Map<String,Object>> selectEmployees(Map<String,Object> paramMap);
	public List<Employees> selectEmployeesForModel(boolean active);
}
