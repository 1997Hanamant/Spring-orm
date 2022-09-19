package com.xworkz.nirmala.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "nirmala_details")
@ToString(callSuper = true)

public class NirmalaEntity extends ParentNirmalaEntity {
	@Id
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	@Min(value = 1)
	private Integer id;
	@NotNull
	private String location;
	@NotNull
	private String gender;
	@NotNull
	private String type;
	@NotNull
	private Double cost;
	@NotNull
	private LocalTime duration;

	public NirmalaEntity(String location, String gender, String type, Double cost,LocalTime duration, String createdBy,
			LocalDate ceratedDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, ceratedDate, updatedBy, updatedDate);
		// this.id = id;
		this.location = location;
		this.gender = gender;
		this.type = type;
		this.cost = cost;
		this.duration=duration;
	}

}
