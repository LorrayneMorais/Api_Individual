package com.Veterinaria.ClinicaPet.security.dto;

import com.Veterinaria.ClinicaPet.security.entities.Endereco;

public class EnderecoResponseDTO {
	
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String uf;
	private String estado;
	private String regiao;
	private String localidade;
	private Integer numero;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
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
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public Endereco toEndereco() {
        return new Endereco(this.cep, this.numero, this.logradouro, this.complemento, this.bairro, this.localidade, this.regiao, this.uf, this.estado);
    }
}
