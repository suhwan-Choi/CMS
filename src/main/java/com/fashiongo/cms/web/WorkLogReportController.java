package com.fashiongo.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.service.WorkLogReportService;

@RestController
@RequestMapping("/worklog_report")
public class WorkLogReportController {
	
	@Autowired
	private WorkLogReportService workLogReportService;
}
