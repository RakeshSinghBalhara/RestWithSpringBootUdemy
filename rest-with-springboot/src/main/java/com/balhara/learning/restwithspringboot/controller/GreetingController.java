package com.balhara.learning.restwithspringboot.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.balhara.learning.restwithspringboot.bean.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/sayHi")
	public String sayHi() {
		return "Hello Sir";		
	}	

	//	http://localhost:8080/greeting?name=Neha
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));		
	}

	//	http://localhost:8080/greeting2/Ramesh
	@RequestMapping("/greeting2/{name}")
	public Greeting greeting2(@PathVariable(value="name") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));		
	}

}
