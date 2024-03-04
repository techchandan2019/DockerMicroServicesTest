package com.bonami.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productapi")
public class ProductController {
	
	private static final Logger logger=LoggerFactory.getLogger(ProductController.class);
	
	@Value("${db.username}")
	private String dbuser;
	@Value("${db.password}")
	private String dbpwd;

	@GetMapping("/msg")
	public ResponseEntity<?> getMessage(){
		logger.info("========get message method of product api=========");
		return new ResponseEntity<>("Hi,Good Morning",HttpStatus.OK);
	}
	@GetMapping("/usn")
	public ResponseEntity<?> getUsnPwd(){
		logger.info("========get usn and pwd method of product api=========");
		return new ResponseEntity<String>(dbuser+" "+dbpwd,HttpStatus.OK);
	}
}
