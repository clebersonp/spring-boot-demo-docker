package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.LoginRepository;
import com.example.demo.model.Login;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repository;

	public List<Login> listarLogins() {
		return this.repository.findAll();
	}

}
