package com.bugny.myboot.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugny.myboot.domain.User;
import com.bugny.myboot.repository.UserRepository;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/info")
	public String userInfo(Model model) {
		return "user/info";
	}
	
	@GetMapping("/list")
	public String userList(Model model) {
		List<User> user = userRepository.findAll();
		model.addAttribute("user",user);
		return "user/list";
	}
	@GetMapping("/register")
	public String register(Model model) {
		
		return "user/register";
	}
	@GetMapping("/registerOk")
	public String registerOK(Model model) {
		return "redirect:/";
	}
	@GetMapping("/login")
	public String login(Model model) {
		return "redirect:/";
	}
	@GetMapping("/logout")
	public String logout(Model model,HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}