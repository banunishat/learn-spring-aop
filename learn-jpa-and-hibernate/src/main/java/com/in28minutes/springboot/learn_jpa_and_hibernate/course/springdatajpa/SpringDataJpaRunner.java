package com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

@Component
public class SpringDataJpaRunner implements CommandLineRunner {

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("from the Spring data JPA runner");
		repository.save(new Course(12,"Learn SpringData JPA from SprigDataJPA", "Jasmine"));
		repository.save(new Course(13,"Learn XYZ from SprigDataJPA", "Jasmine"));
		//repository.deleteById(12);
	/*	System.out.println("SpringData JPA"+ repository.findById(13));
		List<Course>  courseByAuthor = repository.findByAuthor("Jasmine");
		courseByAuthor.stream().forEach(System.out::println);
		
		List<Course>  courseByName = repository.findByName("Learn SpringData JPA from SprigDataJPA");
		System.out.println("finding the records with name");
		courseByName.stream().forEach(System.out::println);
		*/
		
		List<Course>  course = repository.findAll();
		System.out.println("finding all records from SpringData JPA");
		course.stream().forEach(System.out::println);
		
		
	}
	
	
}
