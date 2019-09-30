package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/usuarios")
public class LoginController {

	@Autowired
	private LoginService service;

	@GetMapping
	public List<Login> getLogins() {
		return this.service.listarLogins();
	}

}
