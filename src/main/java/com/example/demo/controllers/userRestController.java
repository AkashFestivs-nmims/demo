package com.example.demo.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.userDao;

@RestController
public class userRestController {

	@Autowired userDao ud;

	@GetMapping("/status")
	public List<Map<String, Object>> getApplicationStatus() {
		System.out.println("Status called");
		return ud.getUsers();
	}
}
