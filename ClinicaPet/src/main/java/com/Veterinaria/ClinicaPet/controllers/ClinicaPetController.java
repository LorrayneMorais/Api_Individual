package com.veterinaria.clinicapet.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/teste")
public class clinicapetController {

	@GetMapping
	public String olaMundo() {
		return ("Hello world!");
	}

}