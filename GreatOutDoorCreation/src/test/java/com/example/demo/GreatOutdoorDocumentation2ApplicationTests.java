package com.example.demo;

import static org.junit.Assert.assertEquals;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capgemini.god.entity.Product;

@SpringBootTest
class GreatOutdoorDocumentation2ApplicationTests {

	@Test
	void contextLoads() throws URISyntaxException {  
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:"+2341+"/products/ProductCreation";
		URI uri = new URI(baseUrl);
		 
		Product p = new Product();
		p.setId(1213);
		p.setManufacture("britania");
		p.setColour("red");
		p.setDimensions("cms");
		p.setPrize(50);
		p.setProductCatogery("OutDoorProtection");
		p.setProductName("lays");
		p.setQuantity(12);
		p.setSpecifications("edible");
		p.setRetailerId(1);
		
     
        
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");      
        HttpEntity<Product> request = new HttpEntity<>(p, headers);
        
        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);
	    assertEquals(200, result.getStatusCodeValue());
	   
		
	}

}
