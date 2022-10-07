package com.example.question03.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.question03.entity.Calender;
import com.example.question03.repository.calenderrepo;

public class serviceimpl implements calenderservice {
	
	@Autowired
	calenderrepo repo;
	
	
	public Calender add(Calender cal)
	{
		Calender newcal = repo.save(cal);
		return newcal;
	}

}
