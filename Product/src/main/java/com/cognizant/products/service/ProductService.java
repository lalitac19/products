package com.cognizant.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.products.model.Product;

@Service("productService")
public class ProductService {

	@Autowired
	Product product;
	public Product getProductByReducedPrice(String productCode) {
		
		return null;
	}

}
