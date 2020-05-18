package com.capgemini.god.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.god.entity.Product;
import com.capgemini.god.exceptions.IdNotFoundException;
import com.capgemini.god.service.ProductService;


@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	@Autowired
	ProductService serviceobj;
	// Create Product
	@GetMapping("/GetProduct/{id}")
	public Optional<Product> getProduct(@PathVariable("id") int id) {
		Optional<Product> opt= serviceobj.getProductById(id);
		if(!opt.isPresent())
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
        return opt;
	}
		
	}


