package com.Veterinaria.ClinicaPet.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.Veterinaria.ClinicaPet.security.services.EmailService;
import com.Veterinaria.ClinicaPet.security.services.EnderecoService;

public class EmailController {

	@Autowired
	EmailService emailService;

	@Autowired
	EnderecoService enderecoService;

	
	@GetMapping
	public String writerTeste() {
		emailService.writerTeste();
		return "Email enviado com sucesso";
	}

}