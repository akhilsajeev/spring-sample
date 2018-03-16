package com.opentrends.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String getLoad(){
		return "Welcome";
	}
	
	@RequestMapping("/load")
	public String getLoad(){
		return "Loading.....";
	}
}
