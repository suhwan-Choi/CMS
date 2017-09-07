package com.fashiongo.cms.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.model.WorkLogReport;
import com.fashiongo.cms.model.WorkLogReportUser;
import com.fashiongo.cms.model.WorkLogReportExcel;
import com.fashiongo.cms.param.WorkLogReportParam;
import com.fashiongo.cms.service.WorkLogReportService;

@RestController
@RequestMapping("/worklog_report")
public class WorkLogReportController {
	private static Logger logger = LoggerFactory.getLogger(WorkLogReportController.class);
	
	@Autowired
	private WorkLogReportService workLogReportService;
	
	/**
	 * 
	 * @param workLogReportParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 9. 6.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<WorkLogReport>> list(WorkLogReportParam workLogReportParam) throws Exception {
		JSONResponse<List<WorkLogReport>> jsonResponse = new JSONResponse<>();
		List<WorkLogReport> workLogReport = new ArrayList<>();
		workLogReport = workLogReportService.selectWorkLogReport(workLogReportParam);
		jsonResponse.setData(workLogReport);
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param workLogReportParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 9. 6.
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<WorkLogReportUser>> user(WorkLogReportParam workLogReportParam) throws Exception {
		JSONResponse<List<WorkLogReportUser>> jsonResponse = new JSONResponse<>();
		List<WorkLogReportUser> workLogReportUser = new ArrayList<>();
		workLogReportUser = workLogReportService.selectWorkLogReportUser(workLogReportParam);
		jsonResponse.setData(workLogReportUser);
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param workLogReportParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 9. 6.
	 */
	@RequestMapping(value = "/excel", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<WorkLogReportExcel>> excel(WorkLogReportParam workLogReportParam) throws Exception {
		JSONResponse<List<WorkLogReportExcel>> jsonResponse = new JSONResponse<>();
		List<WorkLogReportExcel> workLogReportExcel = new ArrayList<>();
		workLogReportExcel = workLogReportService.selectWorkLogReportExcel(workLogReportParam);
		jsonResponse.setData(workLogReportExcel);
		return jsonResponse;
	}
}
