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
import com.fashiongo.cms.param.AccessCodeListParam;
import com.fashiongo.cms.param.AccessCodeSaveParam;
import com.fashiongo.cms.model.AccessCode;
import com.fashiongo.cms.model.AccessCodeList;
import com.fashiongo.cms.model.ProcedureResult;

import com.fashiongo.cms.service.AccessCodeService;

@RestController
@RequestMapping("/access_code")
public class AccessCodeController {

	@Autowired
	private AccessCodeService accessCodeService;

	/**
	 * 
	 * @param accessCodeListParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 9.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody JSONResponse<List<AccessCodeList>> list(AccessCodeListParam accessCodeListParam)
			throws Exception {
		JSONResponse<List<AccessCodeList>> jsonResponse = new JSONResponse<>();
		List<AccessCodeList> accessCodeList = new ArrayList<>();
		accessCodeList = accessCodeService.selectAccessCodeList(accessCodeListParam);
		jsonResponse.setData(accessCodeList);
		return jsonResponse;
	}

	/**
	 * 
	 * @param accessCodeSaveParam
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 9.
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public JSONResponse<ProcedureResult> save(@RequestBody AccessCodeSaveParam accessCodeSaveParam) throws Exception {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(accessCodeService.mergeSaveAccessCode(accessCodeSaveParam));
		return jsonResponse;
	}

	/**
	 * 
	 * @param codeID
	 * @return
	 * @throws Exception
	 * @author Reo
	 * @date 2017. 8. 10.
	 */
	@RequestMapping(value = "/delete/{codeID}", method = RequestMethod.POST)
	public JSONResponse<ProcedureResult> delete(@PathVariable Integer codeID) throws Exception {
		JSONResponse<ProcedureResult> jsonResponse = new JSONResponse<>();
		ProcedureResult result = accessCodeService.delete(codeID);
		jsonResponse.setData(result);
		return jsonResponse;
	}

	/**
	 * 
	 * @param codeID
	 * @return
	 * @throws Exception
	 * @author : Mason
	 * @date : 2017. 8. 23.
	 */
	@RequestMapping(value = "/detail/{codeID}", method = RequestMethod.GET)
	public JSONResponse<AccessCode> detail(@PathVariable Integer codeID) throws Exception {
		JSONResponse<AccessCode> jsonResponse = new JSONResponse<>();
		jsonResponse.setData(accessCodeService.selectDetailAccessCode(codeID));
		return jsonResponse;
	}
}
