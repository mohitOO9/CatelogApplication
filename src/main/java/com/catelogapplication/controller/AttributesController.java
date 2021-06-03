package com.catelogapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catelogapplication.entity.Attributes;
import com.catelogapplication.service.AttributesService;

@RestController
@RequestMapping("/api")
public class AttributesController {
	
	@Autowired
	private AttributesService attributesService; 

	@PostMapping("/attributes")
	public void createCategoryAttributres(@RequestBody Attributes attributes) {
		attributesService.createAttribute(attributes);
	}
	
	@GetMapping("/attributes/{categoryid}")
	public List<Attributes> getCategoryAttributes(@PathVariable("categoryid") Long categoryid) {
		List<Attributes> list = attributesService.getCategoryAttributeUsingCategoryId(categoryid);
		return list;
	}
}
