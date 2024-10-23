package com.Veterinaria.ClinicaPet.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Veterinaria.ClinicaPet.security.entities.Prontuario;
import com.Veterinaria.ClinicaPet.security.repositories.ProntuarioRepository;

import java.util.List;

@Service
public class ProntuarioService {

    @Autowired
    private ProntuarioRepository prontuarioRepository;

    public List<Prontuario> listarProntuarios() {
        return prontuarioRepository.findAll();
    }

    public Prontuario cadastrarProntuario(Prontuario prontuario) {
        return prontuarioRepository.save(prontuario);
    }

    public void deletarProntuario(Long id) {
        prontuarioRepository.deleteById(id);
    }
}
