package com.OnlineBookStore.OnlineBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineBookStore.OnlineBookStore.entities.UserType;
import com.OnlineBookStore.OnlineBookStore.services.UserTypeService;

@RestController
@RequestMapping("/userType")
public class UserTypeController {

	@Autowired
	UserTypeService userTypeService;
	
	@GetMapping("/getAll")
	public List<UserType> getAll(){
		return userTypeService.getAll();
	}
}