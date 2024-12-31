package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository courseJdbcRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("from the commandLineRunner run method");
		Course course6 = new Course(6,"Learn JPA","Nujuma");
		courseJdbcRepository.update(course6);
		courseJdbcRepository.update(new Course(7,"Learn AWS from JPA","Parveen"));
		courseJdbcRepository.update(new Course(8,"Learn GenAI from JDBC","Nujuma"));
		courseJdbcRepository.delete(course6);
		System.out.println(courseJdbcRepository.selectByID(7));
		System.out.println(courseJdbcRepository.selectByID(8));
		
	}

}
