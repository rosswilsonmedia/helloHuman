package com.codingdojo.helloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Human {
	@RequestMapping("/")
	public String human(@RequestParam(value="name", required=false) String name,
			@RequestParam(value="last_name", required=false) String last_name) {
		String print_name="Human";
		if(name != null) {
			print_name=name;
		}
		if(last_name != null) {
			print_name+=" " + last_name;
		}
		return "<h1>Hello " + print_name + "!</h1>"
				+ "<p>Welcome to Spring Boot</p>"
				+ "<a href='/'>Go Back</a>";
	}
}
