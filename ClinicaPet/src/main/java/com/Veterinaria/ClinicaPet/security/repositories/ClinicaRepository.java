package com.Veterinaria.ClinicaPet.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Veterinaria.ClinicaPet.security.entities.Clinica;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinica, Integer> {

	Optional<Clinica> findByNome(String nome);

   
}
