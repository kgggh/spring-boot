package com.bugny.myboot.dto;

import java.time.LocalDateTime;

import com.bugny.myboot.domain.entity.Board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDTO  {
	private long id;
	private String userId;
	private String title;
	private String content;
	private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    
    public Board toEntity() {
    	Board build = Board.builder()
    			.id(id)
    			.userId(userId)
    			.title(title)
    			.content(content)
    			.build();
    	return build;
    }

}
