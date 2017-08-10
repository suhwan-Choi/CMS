package com.fashiongo.cms.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fashiongo.cms.common.JSONResponse;
import com.fashiongo.cms.service.AccessIPService;
import com.fashiongo.cms.param.AccessIPListParam;
import com.fashiongo.cms.param.AccessIPSaveParam;
import com.fashiongo.cms.model.AccessIP;
import com.fashiongo.cms.model.ProcedureResult;

@RestController
@RequestMapping("/access_ip")
public class AccessIPController {
	
	@Autowired
	private AccessIPService accessIPService;
	
	/**
	 * 
	 * @param accessIPListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 10.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<AccessIP>> list(AccessIPListParam accessIPListParam) throws Exception {
		JSONResponse<List<AccessIP>> jsonResponse = new JSONResponse<>();
		List<AccessIP> accessIPList = new ArrayList<>();
		accessIPList = accessIPService.selectAccessIPList(accessIPListParam);
		jsonResponse.setData(accessIPList);
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param accessIPSaveParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 10.
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public JSONResponse<ProcedureResult> save(@RequestBody AccessIPSaveParam accessIPSaveParam) throws Exception {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(accessIPService.mergeSaveAccessIP(accessIPSaveParam));
		return jsonResponse;
	}
	
	/**
	 * 
	 * @param ipID
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 10.
	 */
	@RequestMapping(value = "/delete/{ipID}", method = RequestMethod.POST)
	public JSONResponse<ProcedureResult> delete(@PathVariable Integer ipID) throws Exception {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		ProcedureResult result = accessIPService.delete(ipID);
		jsonResponse.setData(result);
		return jsonResponse;
	}
}
