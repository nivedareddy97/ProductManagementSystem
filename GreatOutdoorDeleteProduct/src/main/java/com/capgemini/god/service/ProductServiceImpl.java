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
	public boolean deleteProduct(int id) {
		boolean b = dao.existsById(id);
		if (b) {
			dao.deleteById(id);
		} 
		return b;
	}

	

}

