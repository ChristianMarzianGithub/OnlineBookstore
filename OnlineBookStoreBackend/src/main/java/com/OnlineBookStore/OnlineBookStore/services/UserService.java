package com.OnlineBookStore.OnlineBookStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBookStore.OnlineBookStore.entities.User;
import com.OnlineBookStore.OnlineBookStore.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public List<User> getAll() {
		return repository.findAll();
	}
	
}
