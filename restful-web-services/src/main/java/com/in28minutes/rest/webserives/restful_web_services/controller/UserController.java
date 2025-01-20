package com.in28minutes.rest.webserives.restful_web_services.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.rest.webserives.restful_web_services.beans.Post;
import com.in28minutes.rest.webserives.restful_web_services.beans.UserClass;
import com.in28minutes.rest.webserives.restful_web_services.beans.UserDaoService;
import com.in28minutes.rest.webserives.restful_web_services.beans.UserNotFoundException;
import com.in28minutes.rest.webserives.restful_web_services.repository.PostRepository;
import com.in28minutes.rest.webserives.restful_web_services.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserDaoService userDaoService;
	
	@Autowired
	PostRepository postRepository;
	
	
	
	public UserController(UserRepository userRepository, PostRepository postRepository) {
		super();
		this.userRepository = userRepository;
		this.postRepository = postRepository;
	}

	@GetMapping("/jpa/users")
	public List<UserClass> getAllUsersJPA(){
		return userRepository.findAll();
	}
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> getAllPosts(@PathVariable Integer id){
		
		
		Optional<UserClass> user = userRepository.findById(id);
		if(user==null)
			throw new UserNotFoundException("user not found");
		
		return user.get().getPosts();
		
	}
	
	@GetMapping("/jpa/users/{userid}/posts/{postid}")
	public Post getOnePost(@PathVariable Integer userid,@PathVariable Integer postid ){
		
		System.out.println("user " + "coming inside" +postid);
		Optional<UserClass> user = userRepository.findById(userid);
		if(user==null)
			throw new UserNotFoundException("user not found");
		System.out.println("user " + user.toString());
		@SuppressWarnings("deprecation")
		Post post = postRepository.getOne(postid);
		post.setUser(user.get());
		System.out.println("post " + post.toString());
		return post;
		
	
		
	}
	
	
	@GetMapping("/jpa/users/{id}")
		public UserClass getOneUserJPA(@PathVariable Integer id) {
		Optional<UserClass> user = userRepository.findById(id);
		if(user.isEmpty()) {
			throw new RuntimeException("Id is not found in the database");
		}
		return user.get();
		
	}
	

	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Post> createPostJPA(@PathVariable Integer id, @Valid @RequestBody Post post) {
		Optional<UserClass> user =userRepository.findById(id);
		if(user ==null) {
			throw new UserNotFoundException("ID" +  id);
		}
		
		post.setUser(user.get());
		
		Post savedPost =postRepository.save(post);
		System.out.println(savedPost.toString() + " "  + savedPost.getId() + "  " + ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(savedPost.getId()).toUri());
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedPost.getId()).toUri();
		System.out.println(location.toString());
		
		return 	ResponseEntity.created(location).build();
		
	}
	
	
	
	
	
	
	@PostMapping("/jpa/users")
	public void createUserJPA(@RequestBody UserClass user) {
		userRepository.save(user);
	}
	
	@DeleteMapping("/jpa/users")
		public void deleteUserJPA(Integer id) {
		userRepository.deleteById(id);
	}
	
	@GetMapping("/users")
	public List<UserClass> getAllUsers(){
		return userDaoService.getAllUsers();
		
	}
	
	@GetMapping("/users/{id}")
	public EntityModel<UserClass> getUser(@PathVariable Integer id){
		UserClass user = userDaoService.getOneUser(id);
		if(user==null) {
			System.out.println(user + "user from the console");
			throw new UserNotFoundException("Id" + id);
		}
		
		EntityModel<UserClass> entityModel = EntityModel.of(user);
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUsers());
		entityModel.add(link.withRel("all-users"));
		
		return entityModel;
	}
	
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Integer id){
		 userDaoService.deleteUserById(id);
		
		
	}
	
	@PostMapping("/users")
	public ResponseEntity<UserClass> createUser(@Valid @RequestBody UserClass user) {
	
		UserClass savedUser = userDaoService.createUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location ).build();
		
	}
	
	
	
	
		
	
	

}
