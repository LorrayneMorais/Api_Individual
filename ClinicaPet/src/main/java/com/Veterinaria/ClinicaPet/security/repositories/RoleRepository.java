package com.veterinaria.clinicapet.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterinaria.clinicapet.security.entities.Role;
import com.veterinaria.clinicapet.security.enums.RoleEnum;

@Repository("role")
public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Optional<Role> findByName(RoleEnum name);
}