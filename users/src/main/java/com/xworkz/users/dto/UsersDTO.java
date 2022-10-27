package com.xworkz.users.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "start")
@NamedQueries({ @NamedQuery(name = "findAll", query = "select info from UsersDTO info"),
		@NamedQuery(name = "findByUserName", query = "select info from UsersDTO info where info.userName=:na") })
public class UsersDTO {
	@Id
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	private Integer id;

	@NotNull
	@NotEmpty
	@Length(max = 30)
	@Length(min = 3)
	private String userName;

	@NotNull
	@NotEmpty
	@Length(max = 30)
	@Length(min = 3)
	private String email;

	@NotNull
	@NotEmpty
	@Length(max = 100)
	@Length(min = 3)
	private String fileName;

}
