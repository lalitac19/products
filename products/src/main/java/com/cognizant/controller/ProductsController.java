package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.service.ProductService;

@RestController
public class ProductsController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(value="/cool")
	public ResponseEntity<Object> testing() {
		
		return new ResponseEntity<>("https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma", HttpStatus.OK);
	}

}
