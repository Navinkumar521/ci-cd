package com.example.cicd_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/welcome")
public class welcomecontroller {
	@GetMapping
	public ResponseEntity<String> welcome(){
		return ResponseEntity.ok("Welcome to the cicd paga");
	}
	@GetMapping
	@RequestMapping("/test")
	public String test()
	{
		return "hi";
	}
	@GetMapping
	@RequestMapping("/test1")
	public ResponseEntity<String> welcome1(){
		return ResponseEntity.status(200).body("hiiiiiii");
	}
}
