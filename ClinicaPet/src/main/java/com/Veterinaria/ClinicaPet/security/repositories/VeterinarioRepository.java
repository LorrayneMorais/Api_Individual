package com.Veterinaria.ClinicaPet.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Veterinaria.ClinicaPet.security.entities.Veterinario;


@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {
}
