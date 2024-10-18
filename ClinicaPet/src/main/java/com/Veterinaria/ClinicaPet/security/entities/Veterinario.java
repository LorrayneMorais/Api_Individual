package com.Veterinaria.ClinicaPet.security.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "veterinario")
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "veterinario_id")
    private Integer id;

    @Column(name = "veterinario_nome", nullable = false)
    private String nome;

    @Column(name = "veterinario_telefone", nullable = false)
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "clinica_id", nullable = false)
    private Clinica clinica;

    // Construtores
    public Veterinario() {
    }

    public Veterinario(String nome, String telefone, Clinica clinica) {
        this.nome = nome;
        this.telefone = telefone;
        this.clinica = clinica;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    @Override
    public String toString() {
        return "Veterinario [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", clinica=" + clinica.getNome() + "]";
    }
}
