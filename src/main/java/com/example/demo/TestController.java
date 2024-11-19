package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

	@GetMapping("/")
	public String Home() {
		System.out.println("Home pages");
		return "hello";
	}
	
	@GetMapping("/contact")
	public String Contact() {
		return "contact";
	}
}
