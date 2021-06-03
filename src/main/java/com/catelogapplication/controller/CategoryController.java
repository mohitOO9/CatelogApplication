package com.catelogapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catelogapplication.entity.Category;
import com.catelogapplication.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/category")
	public void createCategory(@RequestBody Category category){
	
		categoryService.createCategory(category);
	}
	
	
}
