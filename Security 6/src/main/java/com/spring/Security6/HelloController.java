package com.spring.Security6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/admin")
	public String admin()
	{	
		return "Welcome Admin";
	}
	

}
