package com.Veterinaria.ClinicaPet.security.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Veterinaria.ClinicaPet.security.entities.Prontuario;
import com.Veterinaria.ClinicaPet.security.services.ProntuarioService;

import java.util.List;

@RestController
@RequestMapping("/prontuarios")
public class ProntuarioController {

    @Autowired
    private ProntuarioService prontuarioService;

    @GetMapping
    public List<Prontuario> listarProntuarios() {
        return prontuarioService.listarProntuarios();
    }

    @PostMapping
    public ResponseEntity<Prontuario> cadastrarProntuario(@RequestBody Prontuario prontuario) {
        Prontuario novoProntuario = prontuarioService.cadastrarProntuario(prontuario);
        return ResponseEntity.ok(novoProntuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProntuario(@PathVariable Long id) {
        prontuarioService.deletarProntuario(id);
        return ResponseEntity.noContent().build();
    }
}
