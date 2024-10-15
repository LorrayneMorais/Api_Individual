package com.veterinaria.clinicapet.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clinica")
public class Clinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cur_cd_id")
    private Integer id;

    @Column(name = "cur_tx_nome", nullable = false)
    private String nome;

    @Column(name = "cur_tx_endereco", nullable = false)
    private String endereco;

    @OneToMany(mappedBy = "clinica", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Pet> pets; // Lista de pets associados à clínica

    // Construtores
    public Clinica() {
    }

    public Clinica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Clinica [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", pets=" + pets + "]";
    }
}
