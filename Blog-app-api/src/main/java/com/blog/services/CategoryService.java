package com.blog.services;

import java.util.List;

import com.blog.payloads.CategoryDto;

// we are using interface concept to achieve loose coupling
public interface CategoryService {
    //create 
	//INTERFACE METHODS ARE BY DEFAULT PUBLIC AND ABSTRACT
	 CategoryDto createCategory(CategoryDto categoryDto);
	
	//update 
	 CategoryDto updateCategory(CategoryDto categoryDto,Integer caterotyId);
	 
	//delete
	void deleteCategory(Integer categoryId);
	
	//get
	 CategoryDto getCategory(Integer categoryId);
	 
	//getAll
	 List<CategoryDto> getAllCategory();
}
