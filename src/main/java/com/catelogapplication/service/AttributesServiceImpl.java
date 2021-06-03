package com.catelogapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.catelogapplication.entity.Attributes;
import com.catelogapplication.entity.Category;
import com.catelogapplication.repository.AttributesRepository;
import com.catelogapplication.repository.CategoryRepository;

@Service
public class AttributesServiceImpl implements AttributesService{

	private final Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	private AttributesRepository attributesRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void createAttribute(Attributes attributes) {
		logger.info("Inside Attributes() method ====> "+attributes);

		try {		
			attributesRepository.save(attributes);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<Attributes> getCategoryAttributeUsingCategoryId(Long categoryid) {
		
		logger.info("Inside getCategoryAttributeUsingCategoryId() method ====> "+categoryid);
		
		List<Attributes> listOfAttributes = new ArrayList<>();

		try {
			Optional<Category> category = categoryRepository.findById(categoryid);
			if(category.isPresent()) {
				Category categoryObject = category.get();
				listOfAttributes = attributesRepository.findByCategory(categoryObject);
				logger.info("List Data : "+listOfAttributes);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfAttributes;
	}
	
}
