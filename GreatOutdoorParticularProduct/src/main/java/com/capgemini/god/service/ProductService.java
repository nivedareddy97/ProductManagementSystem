package com.capgemini.god.service;

import java.util.Optional;

import com.capgemini.god.entity.Product;

public interface ProductService {
	
	public Optional<Product> getProductById(int id);

	
}
