package com.wellsfargo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.dto.OrderRequest;
import com.wellsfargo.model.Customer;
import com.wellsfargo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
}
