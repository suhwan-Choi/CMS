package com.fashiongo.cms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fashiongo.cms.SearchApplication;
import com.fashiongo.cms.model.GroupManagerList;
import com.fashiongo.cms.param.GroupManagerListParam;

import io.jsonwebtoken.lang.Assert;



@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes= {SearchApplication.class})
public class GroupManagerServiceTest {
	@Autowired
	GroupManagerService groupManagerService;

	@Test
	public void test() {
		GroupManagerListParam groupManagerListParam = new GroupManagerListParam();
		groupManagerListParam.setPage(1);
		groupManagerListParam.setPageSize(10);
		groupManagerListParam.setGroupName("");
		groupManagerListParam.setActive(true);
		GroupManagerList groupManagerList = groupManagerService.selectGroupManagerList(groupManagerListParam);
		Assert.notNull(groupManagerList);
	}

}
