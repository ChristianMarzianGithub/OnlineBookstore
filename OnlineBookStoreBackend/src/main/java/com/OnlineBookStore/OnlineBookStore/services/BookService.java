package com.OnlineBookStore.OnlineBookStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBookStore.OnlineBookStore.entities.Book;
import com.OnlineBookStore.OnlineBookStore.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getAll(){
		return bookRepository.findAll();
	}
}
