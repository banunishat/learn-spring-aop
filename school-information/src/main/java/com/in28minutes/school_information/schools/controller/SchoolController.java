package com.in28minutes.school_information.schools.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.school_information.schools.beans.School;
import com.in28minutes.school_information.schools.repository.SchoolRepository;

@RestController
public class SchoolController {

	@Autowired
	SchoolRepository schoolRepository;
	
	@GetMapping("/schools")
	public List<School> getAllSchools(){
		return schoolRepository.findAll();
		
	}
	
	@GetMapping("/schools/{schoolId}")
	public School getOneSchool(@PathVariable int schoolId){
		Optional<School> school = schoolRepository.findById(schoolId);
		if (school.isEmpty()) {
			throw new RuntimeException("School not found");
		}
		return school.get();
	}
	
@PostMapping("/schools")
public void addSchools(@RequestBody School school) {
	schoolRepository.save(school);
}


	
}
