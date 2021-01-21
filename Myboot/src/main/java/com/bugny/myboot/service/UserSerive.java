package com.bugny.myboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bugny.myboot.domain.entity.User;
import com.bugny.myboot.repository.UserRepository;

@Service
public class UserSerive  {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public List<User> userList() {
		return userRepository.findAll();
	}
	
	@Transactional
	public void register(User user) {
		userRepository.save(user);
	}
	
	


}
