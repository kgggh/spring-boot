package com.bugny.myboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 12,name = "userId",nullable = false)
	private String userId;
	
	@Column(length = 15,name = "password",nullable = false)
	private String password;
	
	@Column(name = "userName",nullable = false)
	private String userName;
	
	@Column(name = "email",nullable = false)
	private String email;
	
}