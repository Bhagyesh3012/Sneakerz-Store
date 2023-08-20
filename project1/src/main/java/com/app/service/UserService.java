package com.app.service;

import java.util.List;

import com.app.dto.AuthRequestDTO;
import com.app.dto.AuthRespDTO;
import com.app.entities.User;

public interface UserService {
//add a method to get all emps
	//List<User> getAllEmployees();

	User addUserDetails(User transientUser);
	
	String deleteUser(Long userId);


}
