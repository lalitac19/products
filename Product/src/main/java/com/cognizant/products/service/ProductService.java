package com.cognizant.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.products.model.Product;

@Service
public interface ProductService {
	List <Product> getDiscountedProducts();
}
