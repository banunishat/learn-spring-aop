package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {
	
	
	@Bean
	public String name() {
		return "Nujuma";
	}
	@Bean
	public int age() {
		return 44;
	}
	
	@Bean
	public Person person() {
		return new Person("Nujuma",44,new Address("Sumayyah Dr", "Irving"));
	}
	
	@Bean
	public Person personMethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person personParameterCall(String name,int age,Address address2) {
		return new Person(name,age,address2);
	}

	
	@Bean
	public Person personParameter1Call(String name,int age,@Qualifier("Address2Qualifier") Address address) {
		return new Person(name,age,address);
	}

	@Bean(name="address2")
	@Qualifier("Address2Qualifier")
	public Address address() {
		return new Address("Moberly Ln","bentonville");
	}

	@Bean
	@Primary
	public Address address3() {
		return new Address("Brake Ln","London");
	}


}
