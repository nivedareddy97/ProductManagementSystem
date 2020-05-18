package com.capgemini.god.controller;

import java.util.List;

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
	

		// Updating Product data
		@PutMapping("/UpdateProduct")
		public ResponseEntity<String> updateProduct(@RequestBody Product emp) {
			boolean b= serviceobj.updateProduct(emp);
			if(!b)
				throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
	        return new ResponseEntity<String>("Update succesful", new HttpHeaders(), HttpStatus.OK);
		}

		


		@ExceptionHandler(IdNotFoundException.class)
		public ResponseEntity<String> userNotFound(IdNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
		
}


