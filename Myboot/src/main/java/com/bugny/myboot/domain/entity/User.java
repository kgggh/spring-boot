package com.bugny.myboot.domain.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseTimeEntity{
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
    
    @Builder
	public User(Long id,String userId, String password, String userName, String email) {
    	this.id = id;
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.email = email;
	}
    
    public User toEntity() {
        return User.builder()
        		.id(id)
        		.userId(userId)
        		.password(password)
        		.userName(userName)
        		.email(email)
        		.build();
                   
    }
	
	
}