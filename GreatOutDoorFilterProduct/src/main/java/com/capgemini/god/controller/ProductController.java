package com.capgemini.god.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.god.entity.Product;
import com.capgemini.god.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	@Autowired
	ProductService serviceobj;

	@GetMapping("/FilterProducts/{minPrize}/{maxPrize}")
	public ResponseEntity<List<Product>> searchProduct(@PathVariable double minPrize, @PathVariable double maxPrize) {
		List<Product> filterList = serviceobj.filterProduct(minPrize, maxPrize);
		return new ResponseEntity<>(filterList, HttpStatus.OK);

	}

}
