package com.sneakerz_store.service;

import com.sneakerz_store.entity.User;
import com.sneakerz_store.exception.UserException;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
