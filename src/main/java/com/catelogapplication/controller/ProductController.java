package com.catelogapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catelogapplication.entity.Product;
import com.catelogapplication.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/product")
	public void createProduct(@RequestBody Product product) {
		productService.createProduct(product);
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		Product productObject = productService.fetchProductUsingID(id);
		return productObject;
	}
}
