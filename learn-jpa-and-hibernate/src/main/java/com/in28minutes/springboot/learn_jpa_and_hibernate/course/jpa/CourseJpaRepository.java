package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Course selectById(int id) {
		
		return entityManager.find(Course.class, id);
		
	}
	
public void update(Course course) {
	entityManager.merge(course);
		
	}
public void delete(int id) {
	Course course = entityManager.find(Course.class, id);
	entityManager.remove(course);
}




}
