package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerApplication implements CommandLineRunner {

	@Autowired
	private AppConfigBean appConfigBean;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.err.println(String.format("DB configuration: %s", this.appConfigBean));
		Thread.sleep(500L);
		System.out.println("\nTo test open:");
		System.out.println("\n\nhttp://localhost:8080/demo");
		System.out.println("http://localhost:8080/usuarios");
	}

}
