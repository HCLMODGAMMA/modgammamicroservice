package com.mot.gamma.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mot.gamma.entiry.CaseDetails;
import com.mot.gamma.entiry.Login;
import com.mot.gamma.repository.MotGrammaRepository;
import com.mot.gamma.util.ResponseStatus;

@Service
public class MotGrammaService {

	@Autowired
	MotGrammaRepository motGrammaRepository;
	
	public ResponseStatus getLogin(Login login) {
		
		ResponseStatus responseStatus = new ResponseStatus();
		Map<String, String> loginMap = new HashMap<String, String>();		
		loginMap.put("manivannan", "Manivannan");
		loginMap.put("roshan", "Roshan");
		loginMap.put("harish", "Harish");
		loginMap.put("nehemiah", "Nehemiah");
		loginMap.put("paresh", "Paresh");
		loginMap.put("prabusankar", "Prabusankar");
		loginMap.put("sachin", "Sachin");
		loginMap.put("tarun", "Tarun");
		loginMap.put("deepak", "Deepak");
		loginMap.put("nitesh", "Nitesh");
		loginMap.put("amit", "Amit");		
		
		String pw=loginMap.get(login.getUserName().toLowerCase());
		if(null != pw && pw.equalsIgnoreCase(login.getPassword())) {			
			responseStatus.setCode(200);
			responseStatus.setStatus("success");
			responseStatus.setMessage("Login successful");
			responseStatus.setToken("qwertyuiopasdfghjklzxcvbnm123456");		
		}else
		{		
			responseStatus.setCode(400);
			responseStatus.setMessage("invalid login details");
			responseStatus.setStatus("Fail");
		}		
		return responseStatus;
	}
	
	public List<CaseDetails> getListCases(){		
		List<CaseDetails> caseDetailsList = null;		
		caseDetailsList = motGrammaRepository.findAll();
		return caseDetailsList;		
	}	
	
	public CaseDetails saveSubmitCase(CaseDetails caseDetails)   
	{  
		System.out.println(" Controller caseDetails.getCsmNo() :"+caseDetails.getCsmNo());
		CaseDetails caseDetailsRes = new CaseDetails();
		caseDetailsRes = motGrammaRepository.save(caseDetails);		
		return caseDetailsRes; 
	}

	public CaseDetails viewCaseDetail(String csmNo) {		
		return motGrammaRepository.findById(Integer.parseInt(csmNo)).orElse(null);
		
	}
	
}
