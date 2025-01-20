package com.in28minutes.rest.webserives.restful_web_services.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		
		//All requests should be authenticated
		
		http.authorizeHttpRequests(
				auth ->auth.anyRequest().authenticated()
				);
		
		//Show a basic Http Authenticator pop up 
		http.httpBasic(Customizer.withDefaults());
		
		//disable the CSRF
		http.csrf().disable();
		
		return http.build();
	}

}
