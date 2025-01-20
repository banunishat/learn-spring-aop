package com.in28minutes.rest.webserives.restful_web_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webserives.restful_web_services.beans.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{

}
