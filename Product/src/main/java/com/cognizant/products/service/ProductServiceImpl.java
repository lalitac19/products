package com.cognizant.products.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.products.model.PriceLabel;
import com.cognizant.products.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	Product product;
	
	@Autowired
	PriceLabel priceLabel;
	
	ArrayList<Product> products = new ArrayList<Product>();
/*
	@Override
	public List<Product> getDiscountedProducts() {
		List <Product> discountedProducts = new ArrayList <Product>();
		
		double priceReduction; 
		for(int x = 0; x <= discountedProducts.size(); x++) {
			if (discountedProducts.) {
				discountedProducts.add(arg0);
			}
		}
		return Collections.sort(product.));
	}

*/

	@Override
	public List<Product> getDiscountedProducts() {
		// TODO Auto-generated method stub
		return null;
	}
}
