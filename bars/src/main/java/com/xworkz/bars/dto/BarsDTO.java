package com.xworkz.bars.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="bar")
@NamedQueries({@NamedQuery(name = "findAll",query = "Select info from BarsDTO info"),
	@NamedQuery(name="findByName",query = "Select info from BarsDTO info where info.name=:nm"),
	@NamedQuery(name = "findFileNameByPriceAndLocation",query = "select info.fileName from BarsDTO info where info.price=:pr and info.location=:lo")})
public class BarsDTO implements Serializable {
	@Id
	@GenericGenerator(name = "boss",strategy = "increment")
	@GeneratedValue(generator = "boss")
	private Integer id;
	private String name;
	private String location;
	private Double price;
	private String ownerName;
	private Integer noOfWorkers;
	private String fileName;
	

}
