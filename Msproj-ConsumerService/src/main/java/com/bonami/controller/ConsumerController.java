package com.bonami.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonami.service.IProductSerivce;

@RestController
@RequestMapping("/consumerapi")
public class ConsumerController {
	private static final Logger logger=LoggerFactory.getLogger(ConsumerController.class);
	
	@Autowired
	private IProductSerivce service;
	
	@GetMapping("/msg")
	public ResponseEntity<?> getMessage() {
		logger.info("========get message method of consumer api=========");
		return service.getMessage();
	}
	
	@GetMapping("/usnpwd")
	public ResponseEntity<?> getUsnPwd() {
		logger.info("========get usn and pwd method of consumer api=========");
		return service.getUsnPwd();
	}

}
