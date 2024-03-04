package com.bonami.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "product-service")
public interface IProductSerivce {

	@GetMapping("/productapi/msg")
	public ResponseEntity<String> getMessage();
	
	@GetMapping("/productapi/usn")
	public ResponseEntity<String> getUsnPwd();
}
