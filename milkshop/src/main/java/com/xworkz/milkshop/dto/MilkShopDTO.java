package com.xworkz.milkshop.dto;

import java.io.Serializable;

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
@Table(name="milk_shop")
public class MilkShopDTO implements Serializable{
	@Id
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	private Integer id;
	private String brandName;
	private String shopName;
	private String type;
	private String ambassador;;
}
