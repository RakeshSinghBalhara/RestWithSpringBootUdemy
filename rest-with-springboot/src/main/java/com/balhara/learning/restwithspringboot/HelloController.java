package com.balhara.learning.restwithspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/sayHi")
	public String sayHi() {
		return "Hello Sir";		
	}	

}
