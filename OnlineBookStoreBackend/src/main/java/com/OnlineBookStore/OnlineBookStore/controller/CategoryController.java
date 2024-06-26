package com.OnlineBookStore.OnlineBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineBookStore.OnlineBookStore.entities.Category;
import com.OnlineBookStore.OnlineBookStore.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/getAll")
	public List<Category> getAll() {
		return categoryService.getAll();
	}
}