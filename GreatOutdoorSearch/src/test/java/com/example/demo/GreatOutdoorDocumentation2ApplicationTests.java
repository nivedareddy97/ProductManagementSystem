package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import junit.framework.Assert;

@SpringBootTest
class GreatOutdoorDocumentation2ApplicationTests {

	@Test
	void contextLoads() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = "http://localhost:"+2330+"/products/DeleteProduct/1";// Enter present id
		URI uri = new URI(baseUrl);
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, null, String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

}
