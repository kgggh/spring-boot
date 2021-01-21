package com.bugny.myboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bugny.myboot.domain.entity.Board;
import com.bugny.myboot.dto.BoardDTO;
import com.bugny.myboot.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	@Transactional(readOnly = true)
	public List<Board> boardList(){
		return boardRepository.findAll();
		
	}
	@Transactional
	public Long WriteOK(BoardDTO board) {
		 return boardRepository.save(board.toEntity()).getId();
	}
	
	@Transactional
	public Board detail(Long id) {
		return boardRepository.findById(id).get();
	}
	@Transactional
	public void delete(Long id) {
		boardRepository.deleteById(id);
	}	

}
