package com.opentrends.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/load")
	public String getLoad(){
		return "Loading Load Page.....Build Change";
	}
}
