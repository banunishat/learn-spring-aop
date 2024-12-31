package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

@Component

public class JpaCommandLineRunner implements CommandLineRunner {
	
		@Autowired
		private CourseJpaRepository courseJpaRepository;
		
		public void run(String... args) throws Exception {
			
			courseJpaRepository.update(new Course(11,"Learn JPA","Nujuma"));
			courseJpaRepository.update(new Course(9,"Learn AWS from JPA","Nujuma"));
			courseJpaRepository.update(new Course(10,"Learn GenAI from JPA","Nujuma"));
			courseJpaRepository.delete(11);
			System.out.println("JPA "+courseJpaRepository.selectById(9));
			System.out.println("JPA"+courseJpaRepository.selectById(10));
			
			System.out.println("Printing all the available values from JPA");
			//List<Course> course = courseJpaRepository.findAll();
			//course.stream().forEach(System.out::println);
			
		}

	}



