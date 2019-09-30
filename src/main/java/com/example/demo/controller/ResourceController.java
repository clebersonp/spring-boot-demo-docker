package com.example.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class ResourceController {

	@Autowired
	private Environment env;

	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping
	public String sayHello() throws UnknownHostException {
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-mm HH:MM:SS");
		final LocalDateTime now = LocalDateTime.now();
		final String serverPort = env.getProperty("server.port");
		final String hostName = InetAddress.getLocalHost().getHostName();

		return String.format("This is a spring boot application and docker demo <b>%s</b></br><p><b>"
				+ "Hostname: </b>%s</br><b>Port: </b>%s</p>", formatter.format(now), hostName, serverPort);

	}

}
