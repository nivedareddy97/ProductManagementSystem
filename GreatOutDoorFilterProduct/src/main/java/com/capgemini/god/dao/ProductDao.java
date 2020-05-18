package com.capgemini.god.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.god.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

	

	
	@Query("Select p from Product p where p.prize >=?1 and p.prize<=?2")
	List<Product> filterProduct(double minPrize, double maxPrize);


}
