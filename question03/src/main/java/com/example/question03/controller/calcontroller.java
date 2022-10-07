package com.example.question03.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.question03.entity.Calender;
import com.example.question03.service.calenderservice;

@RestController
public class calcontroller {

	@Autowired
	calenderservice Calservice;
	
	
	
	 @PostMapping("/add")
    public ResponseEntity<Calender> add(@RequestBody Calender cal) {
        
		 Calender newCal = Calservice.add(cal);
        ResponseEntity<Calender> responseEntity = new ResponseEntity<Calender>(newCal, HttpStatus.ACCEPTED);
       
        return responseEntity;
    }
	 
	
	
}
