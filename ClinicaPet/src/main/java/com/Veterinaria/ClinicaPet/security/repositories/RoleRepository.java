package com.Veterinaria.ClinicaPet.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Veterinaria.ClinicaPet.security.entities.Role;
import com.Veterinaria.ClinicaPet.security.enums.RoleEnum;


@Repository("role")
public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Optional<Role> findByName(RoleEnum name);
}