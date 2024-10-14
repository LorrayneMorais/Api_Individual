package com.veterinaria.clinicapet.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clinica")
public class Clinica {

    public Clinica(Integer id, String nome, String endereco, Integer petid) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.petid = petid;
	}

	public Clinica() {
		
	}

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cur_cd_id")
    private Integer id;

    @Column(name="cur_tx_nome")
    private String nome;

    @Column(name="cur_tx_endereco")
    private String endereco;

    @Column(name="cur_int_pet_id")
    private Integer petid;

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

	public Integer getId() {
		return id;
	}

	public Integer getPetid() {
		return petid;
	}

	@Override
	public String toString() {
		return "Clinica [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", petid=" + petid + "]";
	}
    
    
}
    