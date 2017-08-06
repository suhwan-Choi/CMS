package com.fashiongo.cms.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.service.WorkLogReportService;

@RestController
@RequestMapping("/worklog_report")
public class WorkLogReportController {
	private static Logger logger = LoggerFactory.getLogger(WorkLogReportController.class);
	
	@Autowired
	private WorkLogReportService workLogReportService;
	
	@RequestMapping(value = "/list/{yearMonth}", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<String> list(@PathVariable("yearMonth") String yearMonth) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		workLogReportService.selectList(yearMonth);
 		
		return response;
	}
	
	@RequestMapping(value = "/detail/{date}", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<String> detail(@PathVariable("date") String date) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		workLogReportService.selectDetail(date);
 		
		return response;
	}
	
	@RequestMapping(value = "/export_excel/{yearMonth}", method = RequestMethod.GET)
 	public @ResponseBody JSONResponse<String> exportExcel(@PathVariable("yearMonth") String yearMonth) throws Exception{
 		JSONResponse<String> response = new JSONResponse<String>();
 		workLogReportService.selectExportExcel(yearMonth);
 		
		return response;
	}
}
