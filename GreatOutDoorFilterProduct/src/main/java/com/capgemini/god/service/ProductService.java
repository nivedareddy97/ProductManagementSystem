package com.capgemini.god.service;

import java.util.List;

import com.capgemini.god.entity.Product;

public interface ProductService {
	
	List<Product> filterProduct(double minPrize, double maxPrize);

	


}