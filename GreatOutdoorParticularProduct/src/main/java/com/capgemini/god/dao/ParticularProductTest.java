package com.capgemini.god.dao;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



public class ParticularProductTest{
	@Test
	public void  getProductById() throws URISyntaxException
	{
		RestTemplate rest=new RestTemplate();
		final String baseUrl ="http://localhost:2343/products/GetProduct/80";
		URI uri = new URI(baseUrl);
		ResponseEntity<String> result=rest.exchange(uri, HttpMethod.GET,null,String.class);
		assertEquals(200, result.getStatusCodeValue());
	}
	
}

