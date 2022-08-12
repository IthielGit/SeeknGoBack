package com.seekngo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seekngo.entities.User;
import com.seekngo.service.UserService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService; 
	
	@GetMapping("/list")
	public Iterable<User> getUser(){
		return userService.listAll();
	}
	
	@PostMapping("/save")
	private long save(@RequestBody User user) {
//		System.out.println(user.getName());
		userService.saveUser(user);
		return user.getIdUser();
	}
		
	@PutMapping("/update")
	public void update(@RequestBody User user) {
		userService.saveUser(user);
	}
	
	
	@RequestMapping("/{id}")
	private User getUser(@PathVariable(name = "id") int userID) {
		System.out.println("get single user...");
		return userService.getUserByID(userID);
	}
	
	@PutMapping("/delete/{id}")
	private void deleteUser(@PathVariable("id") int id) {
		System.out.println(id);
		userService.deleteUser(id);
	}
	

	
	
}
