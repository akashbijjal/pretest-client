package com.example.question03.entity;

import java.time.LocalTime;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Calender {

	private String locationid;
	
	private String day;
	
	private LocalTime cutofftime;

	
}
