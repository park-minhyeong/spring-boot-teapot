package com.springboot.teapot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.teapot.model.domain.User;

@RestController
public class UserController {
	@GetMapping("/users")
	public List<User> getUsers() {

		return Arrays.asList(
				new User("John", "john@test.com"));
	}
}
