package com.OnlineBookStore.OnlineBookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineBookStore.OnlineBookStore.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
