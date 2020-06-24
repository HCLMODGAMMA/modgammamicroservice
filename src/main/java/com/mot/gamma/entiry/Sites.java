package com.mot.gamma.entiry;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Sites {
	
	@Id
	private int siteNo;
	private String siteName;
	private String siteDescription;
	private String location;
	private int csmNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sites", nullable = false)
    private CaseDetails  caseDetails;
	

	public int getSiteNo() {
		return siteNo;
	}
	public void setSiteNo(int siteNo) {
		this.siteNo = siteNo;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSiteDescription() {
		return siteDescription;
	}
	public void setSiteDescription(String siteDescription) {
		this.siteDescription = siteDescription;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCsmNo() {
		return csmNo;
	}
	public void setCsmNo(int csmNo) {
		this.csmNo = csmNo;
	}	
	
	
}
