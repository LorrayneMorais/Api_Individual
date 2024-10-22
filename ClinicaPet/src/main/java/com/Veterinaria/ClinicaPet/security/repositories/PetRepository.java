package com.Veterinaria.ClinicaPet.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Veterinaria.ClinicaPet.security.entities.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{
	
	

}
