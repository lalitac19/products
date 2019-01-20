package com.cognizant.products.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cognizant.products.model.Product;
import com.cognizant.products.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService; 
	/*
	@RequestMapping("&")
	public @ResponseBody Product getProducts(
			@RequestParam(value="productID", String productCode) {
		return productService.getProductByReducedPrice(productCode);
	} */
}
