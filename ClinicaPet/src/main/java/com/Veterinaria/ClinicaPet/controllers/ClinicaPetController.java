package com.Veterinaria.ClinicaPet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clinica")
public class ClinicaPetController {

	@GetMapping
	public String olaMundo() {
		return "Olá Mundo!";
	}
}
