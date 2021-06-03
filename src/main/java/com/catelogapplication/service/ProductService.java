package com.catelogapplication.service;

import com.catelogapplication.entity.Product;

public interface ProductService {
	public void createProduct(Product product);
	
	public Product fetchProductUsingID(Long id);
}
