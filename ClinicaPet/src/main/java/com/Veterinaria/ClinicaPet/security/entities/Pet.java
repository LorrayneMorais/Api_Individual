package com.Veterinaria.ClinicaPet.security.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cur_cd_id")
	private Integer id;

	@Column(name = "cur_tx_nome_pet", nullable = false)
	private String nome;

	@Column(name = "cur_int_idade", nullable = false)
	private Integer idade;

	@Column(name = "cur_tx_tipo", nullable = false)
	private String tipo;

	@ManyToOne
	@JoinColumn(name = "user_int_id", referencedColumnName = "id")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Pet(Integer id, String nome, Integer idade, String tipo, User user, String enderecoCliente,
			Clinica clinica) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.tipo = tipo;
		this.user = user;
		this.enderecoCliente = enderecoCliente;
		this.clinica = clinica;
	}

	@Column(name = "cur_tx_cliente_endereco", nullable = false)
	private String enderecoCliente;

	@ManyToOne
	@JoinColumn(name = "clinica_id", nullable = false)
	private Clinica clinica;

	public Pet() {
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

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", nome=" + nome + ", idade=" + idade + ", tipo=" + tipo + ", nomeCliente="
				+ ", enderecoCliente=" + enderecoCliente + ", clinica=" + clinica.getNome() + "]";
	}
}
