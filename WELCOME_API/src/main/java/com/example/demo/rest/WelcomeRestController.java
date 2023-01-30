package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	@GetMapping("/welcome")
	public String welcomeMsg() {

		logger.info("welcomeMsg() execution - start");

		String welcomeMsg = "Welcome to Ashok IT..!!";

		logger.info("welcomeMsg() execution - end ");

		return welcomeMsg ;
	}
}