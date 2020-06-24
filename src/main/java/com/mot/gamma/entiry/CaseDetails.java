package com.mot.gamma.entiry;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CaseDetails {
	
	@Id	
	private int csmNo;
	private String caseSubmissionNo;
	private String caseType;
	private String caseSubType;
	//@Column(insert="false", update="false")
	private String submittedDate;
	private String caseStatus;
	private String subject;
	private String proposalDescription;
	private String reason;
	
	/*
	  @Embedded	  	  
	  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "caseDetails")
	  private List<Sites> sites = new ArrayList<>();
	  
	  
	  @Embedded	  
	  @JoinColumn(name="csmNo",referencedColumnName="id", insertable=false, updatable=false)
	  private ContactDetails contactDetails;
	  
	 */
	
	public String getSubmittedDate() {
		return submittedDate;
	}
	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
	}
	/*
	public List<Sites> getSites() {
		return sites;
	}
	public void setSites(List<Sites> sites) {
		this.sites = sites;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}*/
	public int getCsmNo() {
		return csmNo;
	}
	public void setCsmNo(int csmNo) {
		this.csmNo = csmNo;
	}
	
	public String getCaseSubmissionNo() {
		return caseSubmissionNo;
	}
	public void setCaseSubmissionNo(String caseSubmissionNo) {
		this.caseSubmissionNo = caseSubmissionNo;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public String getCaseSubType() {
		return caseSubType;
	}
	public void setCaseSubType(String caseSubType) {
		this.caseSubType = caseSubType;
	}
	

	public String getCaseStatus() {
		return caseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getProposalDescription() {
		return proposalDescription;
	}
	public void setProposalDescription(String proposalDescription) {
		this.proposalDescription = proposalDescription;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}	
	
	

}
