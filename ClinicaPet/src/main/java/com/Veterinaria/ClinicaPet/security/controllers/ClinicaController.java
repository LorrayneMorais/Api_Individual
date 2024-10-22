package com.Veterinaria.ClinicaPet.security.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Veterinaria.ClinicaPet.security.dto.ClinicaResponseDTO;
import com.Veterinaria.ClinicaPet.security.dto.MessageResponseDTO;
import com.Veterinaria.ClinicaPet.security.entities.Clinica;
import com.Veterinaria.ClinicaPet.security.services.ClinicaService;

@RestController
@RequestMapping("/clinica")
public class ClinicaController {
	
	@Autowired
	ClinicaService clinicaService;
	
	@GetMapping("/{id}")
	public ClinicaResponseDTO buscarEndereco(@PathVariable Integer id) {
		return ClinicaService.buscarClinica(id);
	}
	@GetMapping("/listar")
	public List<Clinica> listaClinica(){
		return clinicaService.listaClinica();
	}
	
	@PostMapping("/cadastrarClinica")
	public ResponseEntity<?> cadastrarClinica(@RequestBody ClinicaResponseDTO Clinica){
		clinicaService.cadastrarClinica(Clinica);
		return ResponseEntity.ok(new MessageResponseDTO("Clinica cadastrado com sucesso!"));
	}


}
