package com.example.question01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.question01.repository.Productrepo;

@RestController
public class Productcontroller {

	
	
	@Autowired
	Productrepo repo;
	
	
	
	
	
}
