package com.Veterinaria.ClinicaPet.security.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "foto")
public class Foto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	

	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "nome")
	private String nome;
	
	@Lob
	@Column(name = "dados")
	private byte[] dados;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "usuario_id")
	private User user;
	
	public Foto() {
	
	}

	public Foto(Integer id, String tipo, String nome, byte[] dados, User user) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.dados = dados;
		this.user = user;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getDados() {
		return dados;
	}

	public void setDados(byte[] dados) {
		this.dados = dados;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}
	
}
