package com.OnlineBookStore.OnlineBookStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBookStore.OnlineBookStore.entities.Category;
import com.OnlineBookStore.OnlineBookStore.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAll(){
		return categoryRepository.findAll();
	}
}
