package com.catelogapplication.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catelogapplication.entity.Category;
import com.catelogapplication.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	private final Logger logger = Logger.getLogger(CategoryServiceImpl.class.getName());

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void createCategory(Category category) {
		logger.info("Inside createCategory() method ====>" + category);

		try {
			categoryRepository.save(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
