package com.example.question01.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Product {

	private String productid;
	
	private String productName;
	
	
	private String unitofmeasure;
	
	
	private java.util.Date launchDate;
	
	
	
	
	
	
}
