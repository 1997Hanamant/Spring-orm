package com.xworkz.milkshop.dto;

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
public class MilkShopDTO implements Serializable{
	
	private Integer id;
	private String brandName;
	private String shopName;
	private String type;
	private String ambassador;;
}
