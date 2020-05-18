package com.capgemini.god.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.god.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{


}
