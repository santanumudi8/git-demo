package com.example.git.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

	@GetMapping("/home")
	ResponseEntity<String> greetings(){
		return new ResponseEntity<String>("Welcome to our Application", HttpStatus.OK);
	}
	
}
