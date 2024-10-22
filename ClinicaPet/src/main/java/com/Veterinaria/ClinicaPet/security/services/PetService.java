package com.Veterinaria.ClinicaPet.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Veterinaria.ClinicaPet.security.dto.PetResponseDTO;
import com.Veterinaria.ClinicaPet.security.entities.Clinica;
import com.Veterinaria.ClinicaPet.security.entities.Pet;
import com.Veterinaria.ClinicaPet.security.entities.User;
import com.Veterinaria.ClinicaPet.security.repositories.ClinicaRepository;
import com.Veterinaria.ClinicaPet.security.repositories.PetRepository;
import com.Veterinaria.ClinicaPet.security.repositories.UserRepository;

@Service
public class PetService {

	@Autowired
	PetRepository petRepository;

	@Autowired
	ClinicaRepository clinicaRepository;
	
	@Autowired
	UserRepository userRepository;

	public static PetResponseDTO buscarPet(Integer id) {
		return null;
	}

	public List<Pet> listaPet() {
		return petRepository.findAll();
	}

	public void cadastrarPet(PetResponseDTO pet) {
		Pet newPet = new Pet();
		newPet.setNome(pet.getNomeClinica());

		Clinica clinica = clinicaRepository.buscarClinica(pet.getNomeClinica());
		if (clinica == null) {
			throw new IllegalArgumentException("Clínica com nome " + pet.getNomeClinica() + " não encontrada.");
		}
		newPet.setClinica(clinica);

		User user = userRepository.buscarUser(pet.getNomeUser());
		if (user == null) {
			throw new IllegalArgumentException("Usuario com nome " + pet.getNomeUser() + " não encontrada.");
		}
		newPet.setUser(user);
		
		petRepository.save(newPet);
	}
}
