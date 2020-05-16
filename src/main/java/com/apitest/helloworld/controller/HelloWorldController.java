package com.apitest.helloworld.controller;

import org.springframework.boot.context.properties.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@ConfigurationProperties(prefix="config")
@Component
public class HelloWorldController {

	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}  

	@RequestMapping(value = "/helloworld", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String HelloWorld() {  
	  
		return getText();  	  
	}	
}