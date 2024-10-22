package com.Veterinaria.ClinicaPet.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Veterinaria.ClinicaPet.security.dto.PetResponseDTO;
import com.Veterinaria.ClinicaPet.security.services.PetService;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	PetService enderecoService;

	@GetMapping("/{id}")
	public PetResponseDTO buscarEndereco(@PathVariable Integer id) {
		return PetService.buscarPet(id);
	}
}