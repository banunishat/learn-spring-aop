package com.in28minutes.rest.webserives.restful_web_services.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<UserClass> users = new ArrayList<>();
	private static int userCount=0;
	
	static {
		users.add(new UserClass(++userCount,"Nisha",LocalDate.now().minusYears(30)));
		users.add(new UserClass(++userCount,"Nujuma",LocalDate.now().minusYears(35)));
		users.add(new UserClass(++userCount,"Jasmine",LocalDate.now().minusYears(45)));
		
	}
	
	public List<UserClass> getAllUsers(){
		return users;
	}

	public UserClass getOneUser(Integer id) {
		
		Predicate<? super UserClass> predicate = user-> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
public void deleteUserById(Integer id) {
		
		Predicate<? super UserClass> predicate = user-> user.getId().equals(id);
		users.removeIf(predicate);
	}
	
	public UserClass createUser(UserClass user) {
		user.setId(++userCount);
		users.add(user);
		return user;
		}
}
