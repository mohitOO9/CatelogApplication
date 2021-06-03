package com.catelogapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catelogapplication.entity.Attributes;
import com.catelogapplication.entity.Category;

@Repository
public interface AttributesRepository extends JpaRepository<Attributes, Long>{
	
	public List<Attributes> findByCategory(Category category);
}
