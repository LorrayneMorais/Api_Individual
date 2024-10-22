package com.Veterinaria.ClinicaPet.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Veterinaria.ClinicaPet.security.entities.Clinica;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinica, Integer> {

	@Query(value = "select * from clinica where nome = :nome;", nativeQuery = true)
    public Clinica buscarClinica(String nome);
    

}