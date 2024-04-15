package com.OnlineBookStore.OnlineBookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineBookStore.OnlineBookStore.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
