package com.veterinaria.clinicapet.security.services;
import java.util.Optional;

import com.veterinaria.clinicapet.security.dto.VeterinarioRequestDTO;
import com.veterinaria.clinicapet.security.entities.Clinica;
import com.veterinaria.clinicapet.security.entities.Veterinario;
import com.veterinaria.clinicapet.security.repositories.ClinicaRepository;
import com.veterinaria.clinicapet.security.repositories.VeterinarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Autowired
    private ClinicaRepository clinicaRepository;

    public Veterinario cadastrarVeterinario(VeterinarioRequestDTO veterinarioDTO) {
        // Recupera a clínica pelo ID
        Optional<Clinica> clinicaOptional = clinicaRepository.findById(veterinarioDTO.getClinicaId());

        if (!clinicaOptional.isPresent()) {
            throw new RuntimeException("Clínica não encontrada com o ID: " + veterinarioDTO.getClinicaId());
        }

        Clinica clinica = clinicaOptional.get();

        // Converte o DTO para entidade
        Veterinario veterinario = veterinarioDTO.toEntity(clinica);

        // Salva no banco de dados
        return veterinarioRepository.save(veterinario);
    }
}
