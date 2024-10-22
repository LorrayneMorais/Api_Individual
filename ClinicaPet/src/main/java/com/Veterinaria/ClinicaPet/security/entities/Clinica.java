package com.Veterinaria.ClinicaPet.security.entities;

import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "clinica")
public class Clinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinica_id")
    private Integer id;

    @Column(name = "clinica_nome", nullable = false)
    private String nome;

   
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    @OneToMany(mappedBy = "clinica", cascade = CascadeType.ALL)
    private List<Pet> pets;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "clinica_users",
        joinColumns = @JoinColumn(name = "clinica_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id"))    
    private Set<User> users;

    public Clinica() {}

	public Clinica(Integer id, String nome, Endereco endereco, List<Pet> pets, Set<User> users) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.pets = pets;
		this.users = users;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Integer getId() {
		return id;
	}

}