package com.swagger.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.dao.Product;

@RestController
public class productController {
	
	@GetMapping("/api/getProduct")
	public String getProduct() {
		return "Spring Boot Swagger";
	}
	@PostMapping("/api/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product produc) {
		Product product = new Product(1,"Santhor","100");
		return new ResponseEntity<>(product, HttpStatus.OK);      		
	}
	
	

}
