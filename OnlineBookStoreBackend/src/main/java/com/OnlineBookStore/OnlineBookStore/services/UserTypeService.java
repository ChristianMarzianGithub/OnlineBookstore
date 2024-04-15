package com.OnlineBookStore.OnlineBookStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineBookStore.OnlineBookStore.entities.UserType;
import com.OnlineBookStore.OnlineBookStore.repositories.UserTypeRepository;

@Service
public class UserTypeService {

	@Autowired
	UserTypeRepository userTypeRepository;
	
	public List<UserType> getAll(){
		return userTypeRepository.findAll();
	}
}