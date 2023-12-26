package com.example.git.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.git.entity.GitEntity;
import com.example.git.repository.GitRepository;

@RestController
@CrossOrigin
public class GitController {
	
	@Autowired
	private GitRepository gitRepository;

	@GetMapping("/home")
	ResponseEntity<String> greetings(){
		return new ResponseEntity<String>("Welcome to our Application", HttpStatus.OK);
	}
	
	@PostMapping(path = "/add/git-details")
	ResponseEntity<GitEntity> addGitDetails(@RequestBody GitEntity gitEntities){
		
		GitEntity response = gitRepository.save(gitEntities);
		
		return new ResponseEntity<GitEntity>(response, HttpStatus.CREATED);
	}
	
	
	@GetMapping(path = "/get/all/git-details")
	ResponseEntity<List<GitEntity>> getALlGitDetails(){
		
		List<GitEntity> response = gitRepository.findAll();
		
		return new ResponseEntity<List<GitEntity>>(response, HttpStatus.OK);
	}
	
	
}
