package com.bugny.myboot.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugny.myboot.domain.entity.Board;
import com.bugny.myboot.dto.BoardDTO;
import com.bugny.myboot.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	@GetMapping("/list")
	public String main(Model model) {
		List<Board> board = boardService.boardList();
		model.addAttribute("board",board);
		
		return "board/list";
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/write";
	}
	@PostMapping("/write")
	public String writeOK(BoardDTO board) {
		boardService.WriteOK(board);
		return "redirect:/board/list";
	}

	@GetMapping("/post/{id}")
	public String detail(@PathVariable("id")Long id,Model model) {
		model.addAttribute("board",boardService.detail(id));
		return "board/detail";
	}
	@GetMapping("/post/edit/{id}")
	public String edit(@PathVariable("id")Long id,Model model) {
		model.addAttribute("board",boardService.detail(id));
		return "board/edit";
	}
	@PutMapping("/post/edit/{id}")
	public String editOK(BoardDTO board) {
		boardService.WriteOK(board);
		return "redirect:/board/list";
	}
	@DeleteMapping("/post/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		boardService.delete(id);
		return "redirect:/board/list";
	}
}