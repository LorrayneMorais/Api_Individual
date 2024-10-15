package com.veterinaria.clinicapet.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cur_cd_id")
    private Integer id;

    @Column(name = "cur_tx_nome_completo", nullable = false)
    private String nome;

    @Column(name = "cur_int_idade", nullable = false)
    private Integer idade;

    @Column(name = "cur_tx_tipo", nullable = false)
    private String tipo; // Alterado para String para representar tipo de espécie

    // Chave estrangeira que referencia a clínica
    @ManyToOne
    @JoinColumn(name = "clinica_id", nullable = false) // chave estrangeira
    private Clinica clinica; // Relacionamento com a clínica

    // Construtores
    public Pet() {
    }

    public Pet(String nome, Integer idade, String tipo, Clinica clinica) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.clinica = clinica; // Atribui a clínica
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    @Override
    public String toString() {
        return "Pet [id=" + id + ", nome=" + nome + ", idade=" + idade + ", tipo=" + tipo + ", clinica=" + clinica + "]";
    }
}
