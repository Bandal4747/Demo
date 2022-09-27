package com.Day16postman.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("welcome")
	public String welcome(){
		return "Welcome Rest";
	}
	

}
