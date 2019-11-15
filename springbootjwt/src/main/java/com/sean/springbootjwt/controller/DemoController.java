package com.sean.springbootjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(value="/demo")
	public String demo() {
		return "jwt demo";
	}
	
	@GetMapping(value="/signup")
	public String signup() {
		return "signup";
	}
	
	@GetMapping(value="/signup/test")
	public String signuptest() {
		return "signuptest";
	}

}
