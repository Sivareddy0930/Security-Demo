package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping("/get")
	public String getMethod() {
		return " with Security get";
	}
	
	@GetMapping("/getAll")
	public String getAll() {
		return " with Security getAll";
	}
}
