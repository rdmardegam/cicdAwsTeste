package com.example.aws.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestExemple {
	
	@GetMapping("/test")
	public String exemplo () {
		System.out.println("TESTE");
		return "ESTOU VIVO";
	}
}