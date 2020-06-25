package com.mot.gamma.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mot.gamma.entiry.CaseDetails;
import com.mot.gamma.entiry.Login;
import com.mot.gamma.repository.CaseDetailsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MotGrammaServiceTest {

	
	@MockBean
	private CaseDetailsRepository caseDetailsRepository;
	
	@Autowired
	private MotGrammaService motGrammaService;
	
	@Test
	public void getListCasesTest() throws Exception {
		when(caseDetailsRepository.findAll()).thenReturn(Stream
				.of(new CaseDetails(211, "666", "FA", "FA", new Date(), "SUBMITTED", "Subject here", "Proposal description", "Reason value")).collect(Collectors.toList()));
		assertEquals(1, motGrammaService.getListCases().size());
	}
	
	@Test
	public void getLoginSuccessTest() throws Exception {
		Login login = new Login();
		login.setUserName("manivannan.g@hcl.com");
		login.setPassword("manivannan");
			
		assertEquals(200, motGrammaService.getLogin(login).getCode());
	}
	
	@Test
	public void getLoginFailureTest() throws Exception {
		Login login = new Login();
		login.setUserName("Raj");
		login.setPassword("Raj");
			
		assertEquals(400, motGrammaService.getLogin(login).getCode());
	}

	
	
}
