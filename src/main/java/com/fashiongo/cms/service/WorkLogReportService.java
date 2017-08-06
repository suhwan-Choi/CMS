package com.fashiongo.cms.service;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WorkLogReportService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(WorkLogReportService.class);

	public void selectList(String yearMonth) {
		Query query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void selectDetail(String date) {
		Query query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void selectExportExcel(String yearMonth) {
		Query query = entityManager.createNamedStoredProcedureQuery("");
	}
}
