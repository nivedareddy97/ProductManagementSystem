package com.capgemini.god.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.god.dao.ProductDao;
import com.capgemini.god.entity.Product;

@Service
@Transactional

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;

	@Override
	public String productCreation(Product pro) {
		 dao.save(pro);
		return "Product inserted successfully";
	}
	@Override
	public Optional<Product> getProductById(int id) {
		return dao.findById(id);
	}
}