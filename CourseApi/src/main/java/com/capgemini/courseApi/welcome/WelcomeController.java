package com.capgemini.courseApi.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/welcome")
	public String sayWelcome() {
		return "WELCOME";
	}
	
	
}
