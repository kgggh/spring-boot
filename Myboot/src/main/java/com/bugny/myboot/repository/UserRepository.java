package com.bugny.myboot.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bugny.myboot.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findAll();
	public void save();
}
