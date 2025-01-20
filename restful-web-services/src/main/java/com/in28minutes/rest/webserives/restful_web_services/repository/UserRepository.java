package com.in28minutes.rest.webserives.restful_web_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webserives.restful_web_services.beans.UserClass;

public interface UserRepository extends JpaRepository<UserClass,Integer> {

}
