package com.capgemini.god.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.god.entity.Product;

public interface ProductService {
	
	public String productCreation(Product pro) ;
	public Optional<Product> getProductById(int id);
	

	
}
