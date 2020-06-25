package com.mot.gamma.entiry;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CASE_DETAILS")
public class CaseDetails {

	public CaseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "CSM_NO", nullable = false, updatable = false, insertable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int csmNo;

	@Column(name = "CASE_SUBMISSION_NO")
	private String caseSubmissionNo;
	@Column(name = "CASE_TYPE")
	private String caseType;
	@Column(name = "CASE_SUB_TYPE")
	private String caseSubType;
	// @Column(insert="false", update="false")
	@Column(name = "SUBMITTED_DATE")
	private Date submittedDate;

	@Column(name = "CASE_STATUS")
	private String caseStatus;
	@Column(name = "SUBJECT")
	private String subject;
	@Column(name = "PROPOSAL_DESCRIPTION")
	private String proposalDescription;
	@Column(name = "REASON")
	private String reason;

	/*
	 * @Embedded
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy =
	 * "caseDetails") private List<Sites> sites = new ArrayList<>();
	 * 
	 * 
	 * @Embedded
	 * 
	 * @JoinColumn(name="csmNo",referencedColumnName="id", insertable=false,
	 * updatable=false) private ContactDetails contactDetails;
	 * 
	 */

	public Date getSubmittedDate() {
		return submittedDate;
	}

	public CaseDetails(int csmNo, String caseSubmissionNo, String caseType, String caseSubType, Date submittedDate,
			String caseStatus, String subject, String proposalDescription, String reason) {
		super();
		this.csmNo = csmNo;
		this.caseSubmissionNo = caseSubmissionNo;
		this.caseType = caseType;
		this.caseSubType = caseSubType;
		this.submittedDate = submittedDate;
		this.caseStatus = caseStatus;
		this.subject = subject;
		this.proposalDescription = proposalDescription;
		this.reason = reason;
	}

	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}

	/*
	 * public List<Sites> getSites() { return sites; } public void
	 * setSites(List<Sites> sites) { this.sites = sites; } public ContactDetails
	 * getContactDetails() { return contactDetails; } public void
	 * setContactDetails(ContactDetails contactDetails) { this.contactDetails =
	 * contactDetails; }
	 */
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
