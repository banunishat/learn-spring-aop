package com.in28minutes.learn_spring_aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learn_spring_aop.aopexample.business.BusinessService1;
import com.in28minutes.learn_spring_aop.aopexample.business.BusinessService2;

@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner {
	
	BusinessService1 businessService1;
	BusinessService2 businessService2;
	Logger logger = LoggerFactory.getLogger(this.getClass());
	public LearnSpringAopApplication(BusinessService1 businessService1, BusinessService2 businessService2) {
		this.businessService1 = businessService1;
		this.businessService2 = businessService2;
	}
	
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	logger.info("the returned value is {}",businessService1.calculateMax());
	logger.info("the returned value is {}",businessService2.calculateMin());
	
}
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}

}
