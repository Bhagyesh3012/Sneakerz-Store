package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.User;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private UserRepository userRepo;
	

	

	@Override
	public User addUserDetails(User transientEmp) {
		
		return userRepo.save(transientEmp);
	}




	@Override
	public String deleteUser(Long userId) {
		String msg="Invalid user email, User is not get delete";
		if(userRepo.existsById(userId)) {
			userRepo.deleteById(userId);
			msg="User with ID="+ userId + "deleted !";
		}
		return msg;
	}

}
