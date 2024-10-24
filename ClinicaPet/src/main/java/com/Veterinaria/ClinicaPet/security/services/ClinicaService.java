package com.Veterinaria.ClinicaPet.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Veterinaria.ClinicaPet.security.dto.ClinicaResponseDTO;
import com.Veterinaria.ClinicaPet.security.entities.Clinica;
import com.Veterinaria.ClinicaPet.security.repositories.ClinicaRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClinicaService {

	@Autowired
	ClinicaRepository clinicaRepository;

	public static ClinicaResponseDTO buscarClinica(Integer id) {
		return null;
	}

	public List<Clinica> listaClinica() {
		return clinicaRepository.findAll();
	}

	public void cadastrarClinica(ClinicaResponseDTO Clinica) {
		Clinica newClinica = new Clinica();
		newClinica.setNome(Clinica.getNomeClinica());
	}
	
	 public void deletarClinica(Integer id) {
	        if (clinicaRepository.existsById(id)) {
	            clinicaRepository.deleteById(id);
	        } else {
	            throw new EntityNotFoundException("Clínica não encontrada com ID: " + id);
	        }
	 }
}
