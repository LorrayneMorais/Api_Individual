package com.Veterinaria.ClinicaPet.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Veterinaria.ClinicaPet.security.dto.EnderecoRequestDTO;
import com.Veterinaria.ClinicaPet.security.dto.EnderecoResponseDTO;
import com.Veterinaria.ClinicaPet.security.services.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

		@Autowired
		EnderecoService enderecoService;
		
		@GetMapping("/{id}")
		public EnderecoResponseDTO buscarEndereco(@PathVariable Integer id) {
			return enderecoService.buscarEndereco(id);
		}
		@PostMapping("/testecep")
		public EnderecoResponseDTO testeEndereco(@RequestBody EnderecoRequestDTO enderecoDTO) {
			return enderecoService.consultarEndereco(enderecoDTO);
		}
}