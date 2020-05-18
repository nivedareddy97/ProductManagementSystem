package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.capgemini.god.entity.Product;

class GreatOutdoorDocumentation2ApplicationTests {

	@Test
	void contextLoads() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();

		final String baseUrl = "http://localhost:" + 2342 + "/products/GetAllProducts";
		URI uri = new URI(baseUrl);

		ResponseEntity<Product[]> datalist = restTemplate.getForEntity(uri, Product[].class);

	     assertEquals(200, datalist.getStatusCodeValue());
	}
	

}
