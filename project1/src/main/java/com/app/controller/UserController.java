package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.entities.User;
import com.app.service.UserService;

@RestController // =@Controller + @ResponseBody
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
@Validated

public class UserController {
	
	@Autowired
	private UserService userService; // emp CRUD

	public UserController() {
		System.out.println("in def ctor of " + getClass());
	}
	
	

	@PostMapping
	public ResponseEntity<?> saveEmpDetails(@RequestBody User transientUser) {
		System.out.println("in save " + transientUser);// not null , id : null
		return new ResponseEntity<>(userService.addUserDetails(transientUser), HttpStatus.CREATED);
	}

	@DeleteMapping("/{userId}")
	public ApiResponse deleteUserDetails(@PathVariable Long userId) {
		return new ApiResponse(userService.deleteUser(userId));
	}

}
