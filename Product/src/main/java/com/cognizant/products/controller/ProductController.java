package com.cognizant.products.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cognizant.products.model.Product;
import com.cognizant.products.service.ProductService;



@RestController
public class ProductController {
	@Autowired
	ProductService productService; 
	
	
	 @GetMapping(value = "/cool")
	    public ResponseEntity<Object> test() {
		 
		
	        return new ResponseEntity<>("${url}",HttpStatus.OK);
	    }
	 
	/*
	@RequestMapping("&")
	public @ResponseBody Product getProducts(
			@RequestParam(value="productID", String productCode) {
		return productService.getProductByReducedPrice(productCode);
	} */
}
