package com.mot.gamma.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mot.gamma.entiry.CaseDetails;
import com.mot.gamma.entiry.Login;
import com.mot.gamma.exception.MotGammaNotFoundException;
import com.mot.gamma.repository.CaseDetailsRepository;
import com.mot.gamma.util.ResponseStatus;

@Service
public class MotGrammaService {

	@Autowired
	CaseDetailsRepository motGrammaRepository;
	
	public ResponseStatus getLogin(Login login) {
		
		ResponseStatus responseStatus = new ResponseStatus();
		Map<String, String> loginMap = new HashMap<String, String>();		
		loginMap.put("manivannan.g@hcl.com", "Manivannan");
		loginMap.put("roshan.shareef@hcl.com", "Roshan");
		loginMap.put("harish.bh@hcl.com", "Harish");
		loginMap.put("nehemiah-settu@hcl.com", "Nehemiah");
		loginMap.put("paresh.belavale@hcl.com", "Paresh");
		loginMap.put("prabusankar.s@hcl.com", "Prabusankar");
		loginMap.put("SachinB@hcl.com", "Sachin");
		loginMap.put("tarun.verma@hcl.com", "Tarun");		
		loginMap.put("n.singh@hcl.com", "Nitesh");
		loginMap.put("amitaggarwal@hcl.com", "Amit");		
		
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
	
	public List<CaseDetails> getListCases() throws Exception{		
		List<CaseDetails> caseDetailsList = null;		
		caseDetailsList = motGrammaRepository.findAll();			
		if (null != caseDetailsList && !caseDetailsList.isEmpty() ){				
			return caseDetailsList;
		}
		else
		{
		  throw new MotGammaNotFoundException();
		}
	}		
	
	public CaseDetails saveSubmitCase(CaseDetails caseDetails)   
	{  
		//System.out.println(" Controller caseDetails.getCsmNo() :"+caseDetails.getCsmNo());
		CaseDetails caseDetailsRes = new CaseDetails();
		caseDetailsRes = motGrammaRepository.save(caseDetails);		
		return caseDetailsRes; 
	}

	public CaseDetails viewCaseDetail(String csmNo) {		
		return motGrammaRepository.findById(Integer.parseInt(csmNo)).orElse(null);
		
	}
	
}
