package com.mot.gamma.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mot.gamma.entiry.CaseDetails;
import com.mot.gamma.entiry.Login;
import com.mot.gamma.services.MotGrammaService;
import com.mot.gamma.util.ResponseStatus;

@RestController
public class MotGammaController {

	private static final Logger log = LoggerFactory.getLogger(MotGammaController.class);

	@Autowired
	MotGrammaService motGrammaService;

	@PostMapping("/login")
	public ResponseEntity<Object> getLogin(@RequestBody Login login) throws Exception {
		log.info("Controller get login method");
		ResponseStatus responseStatus = new ResponseStatus();
		responseStatus = motGrammaService.getLogin(login);
		return new ResponseEntity<Object>(responseStatus, HttpStatus.OK);

	}

	@GetMapping("/listCases")
	public ResponseEntity<Object> getListCases() throws Exception {
		ResponseStatus responseStatus = new ResponseStatus();
		List<CaseDetails> caseDetailsList = null;
		log.info("Controller getListCases method");
		caseDetailsList = motGrammaService.getListCases();
		if (null != caseDetailsList) {
			responseStatus.setCode(200);
			responseStatus.setStatus("success");
			responseStatus.setMessage("Retrive successful");
			responseStatus.setResult(caseDetailsList);
			return new ResponseEntity<Object>(caseDetailsList, HttpStatus.OK);
		} else {
			responseStatus.setCode(400);
			responseStatus.setStatus("Fail");
			responseStatus.setMessage("No record found");
			return new ResponseEntity<Object>(responseStatus, HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping("/submitCase")
	public ResponseEntity<Object> saveSubmitCase(@RequestBody CaseDetails caseDetails) {
		log.info(" Controller caseDetails.getCsmNo() :" + caseDetails.getCsmNo());

		motGrammaService.saveSubmitCase(caseDetails);

		ResponseStatus responseUtil = new ResponseStatus();
		responseUtil.setStatus("success");
		responseUtil.setCode(200);
		responseUtil.setMessage("Saved successful");
		return new ResponseEntity<Object>(responseUtil, HttpStatus.OK);
	}

	@GetMapping("/viewCaseDetail")
	public ResponseEntity<Object> viewCaseDetail(@RequestParam String csmNo) {
		log.info(" Controller caseDetails.getCsmNo() :" + csmNo);
		ResponseStatus responseStatus = new ResponseStatus();
		CaseDetails caseDetails = null;
		caseDetails = motGrammaService.viewCaseDetail(csmNo);

		if (null != caseDetails) {
			responseStatus.setCode(200);
			responseStatus.setStatus("success");
			responseStatus.setMessage("Retrive successful");
			responseStatus.setResult(caseDetails);
			return new ResponseEntity<Object>(caseDetails, HttpStatus.OK);
		} else {
			responseStatus.setCode(400);
			responseStatus.setStatus("Fail");
			responseStatus.setMessage("No record found");
			return new ResponseEntity<Object>(responseStatus, HttpStatus.NOT_FOUND);
		}
	}

}
