package com.fashiongo.cms.service;

import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WorkLogReportService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(WorkLogReportService.class);

	public void selectList(String yearMonth) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void selectDetail(String date) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
	
	public void selectExportExcel(String yearMonth) {
		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("");
	}
}
