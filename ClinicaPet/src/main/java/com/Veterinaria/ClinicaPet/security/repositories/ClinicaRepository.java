package com.veterinaria.clinicapet.security.repositories;

import com.veterinaria.clinicapet.security.entities.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinica, Integer> {
   
}
