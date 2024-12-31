package com.in28minutes.springboot.learn_jpa_and_hibernate;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootApplication
public class LearnJpaAndHibernateApplication {

	public static void main(String[] args) {
		
		/*var context = new AnnotationConfigApplicationContext(LearnJpaAndHibernateApplication.class);
		System.out.println("*********************getBean start");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("*********************getBean End************************");
		*/
		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

}
