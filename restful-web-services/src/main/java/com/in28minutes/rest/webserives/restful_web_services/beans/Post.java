package com.in28minutes.rest.webserives.restful_web_services.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private int id;
	private String description;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JsonIgnore
	private UserClass user;
	
	public UserClass getUser() {
		return user;
	}

	public void setUser(UserClass user) {
		this.user = user;
	}
	
	public Post() {}

	public Post(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}
	

}
