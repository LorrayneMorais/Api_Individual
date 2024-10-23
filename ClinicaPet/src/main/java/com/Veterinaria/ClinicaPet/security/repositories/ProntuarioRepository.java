package com.Veterinaria.ClinicaPet.security.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Veterinaria.ClinicaPet.security.entities.Prontuario;

public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {
}
