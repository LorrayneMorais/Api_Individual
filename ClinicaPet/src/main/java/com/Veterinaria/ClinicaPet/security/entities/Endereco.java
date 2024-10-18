package com.Veterinaria.ClinicaPet.security.entities;

import jakarta.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;

  
    @Column(name = "numero") // Definindo como NOT NULL no banco de dados
    private Integer numero;

//    @OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL)
//    private Clinica clinica;

    // Construtores, getters e setters

    public Endereco() {}

    public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String regiao, String uf, String estado, Integer numero) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.estado = estado;
        this.regiao = regiao;
        this.numero = numero;  
    }

   

    public Endereco(String cep, Integer numero, String logradouro, String complemento, String bairro, String localidade,
			String regiao, String uf, String estado) {
    	this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.estado = estado;
        this.regiao = regiao;
        this.numero = numero;
	
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

//    public Clinica getClinica() {
//        return clinica;
//    }
//
//    public void setClinica(Clinica clinica) {
//        this.clinica = clinica;
//    }

//    @Override
//    public String toString() {
//        return "Endereco [id=" + id + ", cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento
//                + ", bairro=" + bairro + ", localidade=" + localidade + ", uf=" + uf + ", estado=" + estado
//                + ", regiao=" + regiao + ", numero=" + numero + ", clinica=" + clinica + "]";
//    }
}
