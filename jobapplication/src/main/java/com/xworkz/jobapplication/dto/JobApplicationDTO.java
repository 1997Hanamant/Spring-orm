package com.xworkz.jobapplication.dto;

import java.io.Serializable;

public class JobApplicationDTO implements Serializable {
	
	private String name;
	private String email;
	private Long phoneNo;
	private Long alternatePhoneNo;
	private String  gender;
	private String  qualification;
	private Integer  yearOfPassout;
	private String  university;
	private String  adress;
	private String  skill;
	private  Double salary;
	private String  experince;
	private String  idProof;
	private Long  idProofNumber;
	
	public JobApplicationDTO() {
		System.out.println(this.getClass().getSimpleName());
	}
	
	
	public JobApplicationDTO(String name, String email, Long phoneNo, Long alternatePhoneNo, String gender,
			String qualification, Integer yearOfPassout, String university, String adress, String skill, Double salary,
			String experince, String idProof, Long idProofNumber) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.alternatePhoneNo = alternatePhoneNo;
		this.gender = gender;
		this.qualification = qualification;
		this.yearOfPassout = yearOfPassout;
		this.university = university;
		this.adress = adress;
		this.skill = skill;
		this.salary = salary;
		this.experince = experince;
		this.idProof = idProof;
		this.idProofNumber = idProofNumber;
	}


	@Override
	public String toString() {
		return "JobApplicationDTO [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", alternatePhoneNo="
				+ alternatePhoneNo + ", gender=" + gender + ", qualification=" + qualification + ", yearOfPassout="
				+ yearOfPassout + ", university=" + university + ", adress=" + adress + ", skill=" + skill + ", salary="
				+ salary + ", experince=" + experince + ", idProof=" + idProof + ", idProofNumber=" + idProofNumber
				+ "]";
	}
	
	
}
