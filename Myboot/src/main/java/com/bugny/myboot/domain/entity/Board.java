package com.bugny.myboot.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Board extends BaseTimeEntity{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 12,name = "userId",nullable = false)
	private String userId;
	
	@Column(length = 300,name = "title",nullable = false)
	private String title;
	
	@Column(length = 500,name = "content",nullable = false)
	private String content;
    
    @Builder
	public Board(Long id,String userId, String title, String content) {
    	this.id = id;
		this.userId = userId;
		this.title = title;
		this.content = content;
	}
	
}
