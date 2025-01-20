package com.in28minutes.rest.webserives.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webserives.restful_web_services.helloworld.beans.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	//@GetMapping("/helloworld")
	@RequestMapping(method=RequestMethod.GET, path ="/hello-world")
	public HelloWorldBean sayHelloWorld() {
		return new HelloWorldBean("Hello World Nujuma");
	}

	
	@GetMapping("/hello-world/path-variable/{name}")
		
		public HelloWorldBean sayHelloWorldName(@PathVariable String name) {
			return new HelloWorldBean("Hello World " + name);
		}
}
