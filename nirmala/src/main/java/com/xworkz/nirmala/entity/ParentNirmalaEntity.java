package com.xworkz.nirmala.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
@ToString
public class ParentNirmalaEntity {
	
	@NotNull
	private String createdBy;
	@PastOrPresent
	private LocalDate ceratedDate;
	@NotNull
	private String updatedBy;
	@PastOrPresent
	private LocalDate updatedDate;
	
	

}
