package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.god.dao.ProductDao;
import com.capgemini.god.entity.Product;
import com.capgemini.god.service.ProductServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class GreatOutdoorDocumentation2ApplicationTests {
	@Mock
    private ProductDao dao;
@InjectMocks
private ProductServiceImpl productService;

/*@Before
public void setup(){
MockitoAnnotations.initMocks(this);
}
@Test
public void getAllProduct(){
Product pro = new Product(2,20,"cream","15","edible","britania",30,1,"marriegold",1);

dao.findAll();
  verify(dao, Mockito.times(1)).findAll();
}
	@Test
	void contextLoads() {
	}
*/
@Test
public void  getProductByIdTest() {
	Mockito.when(dao.getOne(2)).thenReturn(new Product(2,20,"cream","15","edible","britania",30,"OutDoorProtection","marriegold",1));
	Optional<Product> pro=productService.getProductById(2);
	assertEquals(2,pro.get());
}


}








/*import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Date;
import java.util.Optional;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.god.dao.ProductDao;
import com.capgemini.god.entity.Product;
import com.capgemini.god.service.ProductServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GreatOutdoorDocumentation2ApplicationTests {
	
	@Mock
    private ProductDao dao;
	
@InjectMocks
private ProductServiceImpl productService;

@Before
public void setup(){
MockitoAnnotations.initMocks(this);
}

@Test
public void getAllProductTest() {
	Product pro=new Product();
	pro.setId(2);
	pro.setProductName("Buscuit");
	pro.setColour("red");
	pro.setManufacture("Britania");
	pro.setDimensions("cm");
	pro.setPrize(30);
	pro.setQuantity(5);
	pro.setSpecifications("edible");
	pro.setRetailerId(11);
	pro.setProductCatogery(101);
	
	//productService.save(pro);
	
}

@Test
public void  getProductByIdTest() {
	Mockito.when(dao.getOne(2)).thenReturn(new Product(2,20,"cream","15","edible","britania",30,1,"marriegold",1));
	Optional<Product> pro=productService.getProductById(2);
	assertEquals(2,pro.get());
}


}
*/