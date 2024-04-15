package com.OnlineBookStore.OnlineBookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineBookStore.OnlineBookStore.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
