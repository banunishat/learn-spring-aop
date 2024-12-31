package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	private static String INSERT_QUERY =
			"""
			insert into course(id, name, author) values(?,?,?);
			""";
	
	private static String DELETE_QUERY =
			"""
			delete from course  where id =?;
			""";
	
	private static String SELECTBYID_QUERY =
			"""
			select * from course where id =?;
			""";
	public void update(Course course) {
			
		jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
		
	}
	public void delete(Course course6) {
		
			
		jdbcTemplate.update(DELETE_QUERY,course6.getId());
		
	}
	
	public Course selectByID(int id) {
		
		return jdbcTemplate.queryForObject(SELECTBYID_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
		
	}
	
		
	

}
