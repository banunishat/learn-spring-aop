package com.in28minutes.school_information.schools.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.school_information.schools.beans.School;

public interface SchoolRepository extends JpaRepository<School,Integer>{

}
