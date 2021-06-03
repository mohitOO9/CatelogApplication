package com.catelogapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.catelogapplication.entity.Attributes;

public interface AttributesService {

	public void createAttribute(Attributes attributes);

	public List<Attributes> getCategoryAttributeUsingCategoryId(Long categoryid);

}
