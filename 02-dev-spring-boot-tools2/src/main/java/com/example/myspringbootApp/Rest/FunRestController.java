package com.example.myspringbootApp.Rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coach;
	@Value("${team.name}")
	private String team;
	
	@GetMapping("/template")
	public String sayTemplate(){
		return "Coach : "+coach+" Team :"+team;
	}
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time is " + LocalDateTime.now();
	}
	
	@GetMapping("/testing")
	public String workout() {
		return "workOut daily ";
	}

}
