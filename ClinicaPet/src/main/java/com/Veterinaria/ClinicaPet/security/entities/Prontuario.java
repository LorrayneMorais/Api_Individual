package com.Veterinaria.ClinicaPet.security.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;


    private LocalDate dataConsulta;
    private String tipoProcedimento;

    // Construtores, getters e setters

    public Prontuario() {}

    public Prontuario(Pet pet, LocalDate dataConsulta, String tipoProcedimento) {
        this.pet = pet;
       
        this.dataConsulta = dataConsulta;
        this.tipoProcedimento = tipoProcedimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getTipoProcedimento() {
        return tipoProcedimento;
    }

    public void setTipoProcedimento(String tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }
}
