package com.apitest.helloworld.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.context.properties.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@ConfigurationProperties(prefix="config")
@Component
public class HelloWorldController {	

	@RequestMapping(value = "/helloworld", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String HelloWorld() {  

		return "Spring API 1 - Hello World";  	  
	}	

}