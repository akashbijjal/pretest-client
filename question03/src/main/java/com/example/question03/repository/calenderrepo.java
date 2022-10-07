package com.example.question03.repository;

import java.time.LocalTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.question03.entity.Calender;

public interface calenderrepo extends JpaRepository<Calender, String> {

	static boolean existsById(LocalTime cutofftime) {
		// TODO Auto-generated method stub
		return existsById(cutofftime);
	}

}
