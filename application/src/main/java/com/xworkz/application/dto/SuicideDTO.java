package com.xworkz.application.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SuicideDTO implements Serializable{
	
	private String name;
	private Integer age;
	private String reason;
	private String gender;
	private Integer noOfAttempts;
	private String spot;
	private String dateAndTime;
	private String type;
	
}
