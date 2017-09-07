package com.fashiongo.cms.service;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fashiongo.cms.model.WorkLogReport;
import com.fashiongo.cms.model.WorkLogReportUser;
import com.fashiongo.cms.model.WorkLogReportExcel;
import com.fashiongo.cms.param.WorkLogReportParam;

@Service
public class WorkLogReportService extends CommonService {
	private static Logger logger = LoggerFactory.getLogger(WorkLogReportService.class);

	/**
	 * 
	 * @param workLogReportParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 9. 6.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<WorkLogReport> selectWorkLogReport(WorkLogReportParam workLogReportParam) throws Exception{
		List<WorkLogReport> workLogReport = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetStatisticsWorklog");
		query.setParameter("StartDate", workLogReportParam.getStartDate());
		query.setParameter("EndDate", workLogReportParam.getEndDate());
		
		workLogReport = (List<WorkLogReport>) query.getResultList();

		return workLogReport;
	}
	
	/**
	 * 
	 * @param workLogReportParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 9. 6.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<WorkLogReportUser> selectWorkLogReportUser(WorkLogReportParam workLogReportParam) throws Exception{
		List<WorkLogReportUser> workLogReportUser = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetStatisticsWorklogPerUser");
		query.setParameter("StartDate", workLogReportParam.getStartDate());
		
		workLogReportUser = (List<WorkLogReportUser>) query.getResultList();

		return workLogReportUser;
	}
	
	/**
	 * 
	 * @param workLogReportParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 9. 6.
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<WorkLogReportExcel> selectWorkLogReportExcel(WorkLogReportParam workLogReportParam) throws Exception{
		List<WorkLogReportExcel> workLogReportExcel = null;
		Query query = entityManager.createNamedStoredProcedureQuery("upWeb_GetStatisticsWorklogforExcel");
		query.setParameter("StartDate", workLogReportParam.getStartDate());
		query.setParameter("EndDate", workLogReportParam.getEndDate());
		
		workLogReportExcel = (List<WorkLogReportExcel>) query.getResultList();

		return workLogReportExcel;
	}
}
