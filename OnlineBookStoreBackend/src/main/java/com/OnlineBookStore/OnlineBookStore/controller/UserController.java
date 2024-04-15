package com.OnlineBookStore.OnlineBookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineBookStore.OnlineBookStore.entities.User;
import com.OnlineBookStore.OnlineBookStore.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getAll")
	public List<User> getAll(){
		return userService.getAll();
	}
}
