package com.Veterinaria.ClinicaPet.security.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Veterinaria.ClinicaPet.security.dto.VeterinarioRequestDTO;
import com.Veterinaria.ClinicaPet.security.entities.Clinica;
import com.Veterinaria.ClinicaPet.security.entities.Veterinario;
import com.Veterinaria.ClinicaPet.security.repositories.ClinicaRepository;
import com.Veterinaria.ClinicaPet.security.repositories.VeterinarioRepository;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Autowired
    private ClinicaRepository clinicaRepository;

    public Veterinario cadastrarVeterinario(VeterinarioRequestDTO veterinarioDTO) {
     
        Optional<Clinica> clinicaOptional = clinicaRepository.findById(veterinarioDTO.getClinicaId());

        if (!clinicaOptional.isPresent()) {
            throw new RuntimeException("Clínica não encontrada com o ID: " + veterinarioDTO.getClinicaId());
        }

        Clinica clinica = clinicaOptional.get();    
        Veterinario veterinario = veterinarioDTO.toEntity(clinica);
        return veterinarioRepository.save(veterinario);
    }
}
