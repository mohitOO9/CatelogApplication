package com.catelogapplication.service;

import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catelogapplication.entity.Product;
import com.catelogapplication.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	private final Logger logger = Logger.getLogger(getClass().getName());

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void createProduct(Product product) {
		logger.info("Inside createProduct() method ====> "+product);
		try {
			productRepository.save(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Product fetchProductUsingID(Long id) {
		Product product = new Product();
		try {
			Optional<Product> productOptional = productRepository.findById(id);
			if(productOptional.isPresent()) {
				product = productOptional.get();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

	
	
}
