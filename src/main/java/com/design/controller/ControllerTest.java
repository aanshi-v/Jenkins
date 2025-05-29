package com.design.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	
	@GetMapping("/test")
	public String Test() {
		return "ControllerTest is working.";
	}
	
	

}
