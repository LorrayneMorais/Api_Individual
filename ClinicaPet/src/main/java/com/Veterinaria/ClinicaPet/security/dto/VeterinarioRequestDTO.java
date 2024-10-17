package com.veterinaria.clinicapet.security.dto;

import com.veterinaria.clinicapet.security.entities.Clinica;
import com.veterinaria.clinicapet.security.entities.Veterinario;

public class VeterinarioRequestDTO {

    private String nome;
    private String telefone;
    private Integer clinicaId;

    // Construtores
    public VeterinarioRequestDTO() {
    }

    public VeterinarioRequestDTO(String nome, String telefone, Integer clinicaId) {
        this.nome = nome;
        this.telefone = telefone;
        this.clinicaId = clinicaId;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getClinicaId() {
        return clinicaId;
    }

    public void setClinicaId(Integer clinicaId) {
        this.clinicaId = clinicaId;
    }

    // Método para converter DTO para entidade
    public Veterinario toEntity(Clinica clinica) {
        return new Veterinario(this.nome, this.telefone, clinica);
    }
}
