package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

	@RequestMapping("/login")
	public String login() {
		return "success";
	}
	
	@RequestMapping("/number")
	public int number() {
	return 10;
	}
}