package com.in28minutes.learn_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println("Name bean" +context.getBean("name")	);
		System.out.println("Age bean" +context.getBean("age")	);
		System.out.println("Person " +  context.getBean("person")	);
		System.out.println("Method Call" +context.getBean("personMethodCall")	);
		System.out.println("Parameter Call" + context.getBean("personParameterCall")	);
		System.out.println(context.getBean("address2")	);
		System.out.println("Calling from class" + context.getBean(Address.class)	);
		System.out.println("Address"+context.getBean("address3")	);
		System.out.println("PersonParameter1call"+context.getBean("personParameter1Call")	);
		
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		


	}

}
