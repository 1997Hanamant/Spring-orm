package com.xworkz.companydetails.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CompanyDetailsDTO implements Serializable {
	
	private String name;
	private String founderName;
	private String since;
	private String employes;
	private String address;
	private String business;
	
	public CompanyDetailsDTO() {
	System.out.println("Calling CompanyDetailsDTO  by default construtor");
	}

	public CompanyDetailsDTO(String name, String founderName, String since, String employes, String address,
			String business) {
		super();
		this.name = name;
		this.founderName = founderName;
		this.since = since;
		this.employes = employes;
		this.address = address;
		this.business = business;
	}

	@Override
	public String toString() {
		return "CompanyDetailsDTO [name=" + name + ", founderName=" + founderName + ", since=" + since + ", employes="
				+ employes + ", address=" + address + ", business=" + business + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFounderName() {
		return founderName;
	}

	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public String getEmployes() {
		return employes;
	}

	public void setEmployes(String employes) {
		this.employes = employes;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}
	
	
}
