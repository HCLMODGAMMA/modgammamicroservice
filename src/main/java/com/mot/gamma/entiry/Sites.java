package com.mot.gamma.entiry;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Entity
@Table(name = "SITES")
public class Sites {

	@Id
	@Column(name = "SITE_NO", nullable = false, updatable = false, insertable = false)
	private int siteNo;
	@Column(name = "SITE_NAME")
	private String siteName;
	@Column(name = "SITE_DESCRIPTION")
	private String siteDescription;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "CSM_NO")
	private int csmNo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sites", nullable = false)
	private CaseDetails caseDetails;

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
