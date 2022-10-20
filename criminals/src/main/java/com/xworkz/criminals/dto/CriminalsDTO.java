package com.xworkz.criminals.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

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
@Entity
@Table(name="criminal_info")

@NamedQueries({@NamedQuery(name ="findAll", query = "select info from CriminalsDTO info" ),
	@NamedQuery(name = "findByName" ,query ="select info from CriminalsDTO info where info.name=:na"),
	@NamedQuery(name = "findByAgeCountryAndCriminalType",query = "select info from CriminalsDTO info where info.gender=:gn and info.country=:co and info.criminalType=:cr "),
@NamedQuery(name = "findMarriedByAge",query = "Select info.married from CriminalsDTO info where info.age=:ag")
})
	
public class CriminalsDTO implements Serializable{
	@Id
	@GenericGenerator(name = "boss",strategy = "increment")
	@GeneratedValue(generator = "boss")
	@Min(value = 1)
    private Integer id;
	@NotNull
	private String name;
	@NotNull
	private Integer age;
	@NotNull
	private String country;
	@NotNull
	private String criminalType;
	@Min(value = 1)
	private Integer noOfCases;
	@NotNull
	private String alive;
	@NotNull
	private String gender;
	@NotNull
	private String international;
	@NotNull
	private String married;
	@NotNull
	private Double jailTerm;
	@NotNull
	private String wifeName;
	@NotNull
	private String rightHandName;
	@NotNull
	private String leftHandName;
	@NotNull
	private String prisonName;
	@NotNull
	private Double netWorth;	
}
