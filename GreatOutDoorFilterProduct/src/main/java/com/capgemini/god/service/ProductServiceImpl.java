package com.capgemini.god.service;

import java.util.List;

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
	public List<Product> filterProduct(double minPrize, double maxPrize) {
		return dao.filterProduct(minPrize,maxPrize);
	}



}
