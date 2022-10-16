package com.xworkz.milkshop.dto;

import java.io.Serializable;
import java.util.concurrent.atomic.DoubleAccumulator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name="dress")
public class DressDTO implements Serializable{
	@Id
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	private Integer id;
	private String brand;
	private String size;
	private Double price;
	private String discount;
	private Double quantity;
	private String gender;
	private String color;;
	
}
