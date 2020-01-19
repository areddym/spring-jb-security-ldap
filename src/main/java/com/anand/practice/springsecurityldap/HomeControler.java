package com.anand.practice.springsecurityldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {
	@GetMapping("/")
	public String index() {
		return "Hello anand";
	}

}
