package com.bugny.myboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRepository {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void save() {
		userRepository.save();
	}
}
