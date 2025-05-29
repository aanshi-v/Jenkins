package com.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsTestApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsTestApplication.class); 
	
	@PostConstruct
	public void intt() {
		logger.info("Jenkins Application started...");
	}

	public static void main(String[] args) {
		logger.info("Jenkins Application execued...");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
