package com.opentrends.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/user/test")
	public String getLoad(){
		
		return "Authenticated";
		
	}

}
