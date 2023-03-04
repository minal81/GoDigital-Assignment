package com.user.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.entity.UserDetails;
import com.user.service.UserDetailsService;
import com.user.service.UserService;

import jakarta.validation.Valid;


@RestController
public class UserController {
	
	@Autowired 
	private UserService userService; 
	private UserDetailsService  userDetailsService ;
	
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user)
	{
		return new ResponseEntity<User> (userService.CreateUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/viewUser/{id}")
	public ResponseEntity<User> viewUser(@Valid @RequestBody User user,@PathVariable int id)
	{
		return new ResponseEntity<User> (userService.ViewUser(id),HttpStatus.OK);
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user,@PathVariable int id)
	{
		return new ResponseEntity<User> (userService.UpdateUser(user, id),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@Valid @RequestBody User user,@PathVariable int id)
	{
		return userService.DeleteUser(id);
	}
	
	@PostMapping("/createUserD")
	public ResponseEntity<UserDetails> createUserD(@Valid @RequestBody UserDetails userD)
	{
		return new ResponseEntity<UserDetails> (userDetailsService.CreateUserDetails(userD),HttpStatus.CREATED);
	}
	
	@GetMapping("/viewUserD/{id}")
	public ResponseEntity<UserDetails> viewUserD(@Valid @RequestBody UserDetails user,@PathVariable int id)
	{
		return new ResponseEntity<UserDetails> (userDetailsService.ViewUserDEtails(id),HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/deleteUserD/{id}")
	public String deleteUserD(@Valid @RequestBody UserDetails userD,@PathVariable int id)
	{
		return userDetailsService.DeleteUserDetails(id);
	}
	
	
	

}
