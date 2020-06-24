package com.mot.gamma.util;

import java.util.List;

import com.mot.gamma.entiry.CaseDetails;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MotGammaResponse {
	
	private String status;
	private int code;
	private String message;
	private List<CaseDetails> result;
	
}
