package com.bugny.myboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String main() {
		return "index";
	}
	@GetMapping("/home")
	public String home() {
		return "index";
	}

}