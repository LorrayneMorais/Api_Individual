package com.Veterinaria.ClinicaPet.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Veterinaria.ClinicaPet.security.entities.User;



@Repository

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String username);


	Boolean existsByUsername(String username);


	Boolean existsByEmail(String email);
}