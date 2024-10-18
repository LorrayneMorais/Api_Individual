package com.Veterinaria.ClinicaPet.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Veterinaria.ClinicaPet.security.entities.Role;
import com.Veterinaria.ClinicaPet.security.repositories.RoleRepository;

@Service
public class RoleService {
	@Autowired
	RoleRepository roleRepository;
	
	public Role save(Role role) {
		return roleRepository.save(role);
	}
}
