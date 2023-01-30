package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feignclient.WelcomeApiClient;

@RestController
public class UserRestController {

	private Logger logger = LoggerFactory.getLogger(UserRestController.class);

	@Autowired
	private WelcomeApiClient welcomeClient;

	@GetMapping("/user")
	public String userMsg() {

		logger.info("userMsg() execution - start");

		String userMsg = "Hi I am sharad !!!";

		String welcomeMsg = welcomeClient.invokeWelcomeApi();

		logger.info("userMsg() execution - end ");

		return userMsg + ", " + welcomeMsg;
	}
}