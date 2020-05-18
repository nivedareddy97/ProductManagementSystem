package com.capgemini.god.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.god.entity.Product;
import com.capgemini.god.exceptions.IdAlreadyExistsException;
import com.capgemini.god.exceptions.IdNotFoundException;
import com.capgemini.god.service.ProductService;


@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	@Autowired
	ProductService serviceobj;
	// Create Product
		@PostMapping("/ProductCreation")
		public ResponseEntity<String> ProductCreation(@RequestBody Product pro) {
			Optional<Product> opt= serviceobj.getProductById(pro.getId());
	        if(!opt.isPresent())
			{serviceobj.productCreation(pro);
			return new ResponseEntity<String>("Product inserted successfully",HttpStatus.OK);
			}
	        else
				throw new IdAlreadyExistsException("Id Already exists");
	        	
		}

		
		
		@ExceptionHandler(IdAlreadyExistsException.class)
		public ResponseEntity<String> alreadyExists(IdAlreadyExistsException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
	}


