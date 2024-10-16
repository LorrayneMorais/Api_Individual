package com.veterinaria.clinicapet.security.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clinica")
public class Clinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinica_id")
    private Integer id;

    @Column(name = "clinica_nome", nullable = false)
    private String nome;

    @Column(name = "clinica_endereco", nullable = false)
    private String endereco;

  
    @OneToMany(mappedBy = "clinica", cascade = CascadeType.ALL)
    private List<Pet> pets;

  
    @OneToMany(mappedBy = "clinica", cascade = CascadeType.ALL)
    private List<Veterinario> veterinarios;

 
    public Clinica() {
    }

    public Clinica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

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

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }
}
