package com.OnlineBookStore.OnlineBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineBookStore.OnlineBookStore.entities.Book;
import com.OnlineBookStore.OnlineBookStore.services.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/getAll")
	public List<Book> getAll(){
		return bookService.getAll();
	}
	
}