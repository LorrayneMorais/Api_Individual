package com.veterinaria.clinicapet.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clinica")
public class Pet {

	public Pet(Integer id, String nome, Integer idade, Integer tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.tipo = tipo;
	}

	public Pet() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cur_cd_id")
	private Integer id;

	@Column(name = "cur_tx_nome_completo")
	private String nome;

	@Column(name = "cur_int_cpf")
	private Integer idade;

	@Column(name = "cur_int_cpf")
	private Integer tipo;

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

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", nome=" + nome + ", idade=" + idade + ", tipo=" + tipo + "]";
	}

}