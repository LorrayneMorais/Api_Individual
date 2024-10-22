package com.Veterinaria.ClinicaPet.security.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Veterinaria.ClinicaPet.security.dto.MessageResponseDTO;
import com.Veterinaria.ClinicaPet.security.dto.PetResponseDTO;
import com.Veterinaria.ClinicaPet.security.entities.Pet;
import com.Veterinaria.ClinicaPet.security.services.ClinicaService;
import com.Veterinaria.ClinicaPet.security.services.PetService;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	PetService petService;

	@Autowired
	ClinicaService clinicaService;
	
	@GetMapping("/{id}")
	public PetResponseDTO buscarEndereco(@PathVariable Integer id) {
		return PetService.buscarPet(id);
	}
	@GetMapping("/listar")
	public List<Pet> listaPet(){
		return petService.listaPet();
	}
	
	@PostMapping("/cadastrarPet")
	public ResponseEntity<?> cadastrarPet(@RequestBody PetResponseDTO pet){
		petService.cadastrarPet(pet);
		return ResponseEntity.ok(new MessageResponseDTO("Pet cadastrado com sucesso!"));
	}
	@DeleteMapping("/deleteId/{id}")
    public ResponseEntity<String> deletarClinica(@PathVariable Integer id) {
        try {
            clinicaService.deletarClinica(id);  
            return ResponseEntity.noContent().build();  
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build(); 
        }
    }
}