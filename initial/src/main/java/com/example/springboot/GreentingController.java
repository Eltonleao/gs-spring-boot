package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreentingController {

	@GetMapping("/hello")
	public String index() {
		return "heeelooo dear!";
	}

	@GetMapping("/hello2")
	public String index2() {
		return "lksdajfhdskgjfhk!";
	}

}
