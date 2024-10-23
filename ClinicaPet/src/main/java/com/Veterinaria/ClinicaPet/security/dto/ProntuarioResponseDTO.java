package com.Veterinaria.ClinicaPet.security.dto;

import java.time.LocalDate;

public class ProntuarioResponseDTO {
    private Long petId;
    private String nomePet;
    private String nomeVeterinario;
    private LocalDate dataConsulta;
    private String tipoProcedimento;
	public String getNomePet() {
		return nomePet;
	}
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	public String getNomeVeterinario() {
		return nomeVeterinario;
	}
	public void setNomeVeterinario(String nomeVeterinario) {
		this.nomeVeterinario = nomeVeterinario;
	}
	public LocalDate getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getTipoProcedimento() {
		return tipoProcedimento;
	}
	public void setTipoProcedimento(String tipoProcedimento) {
		this.tipoProcedimento = tipoProcedimento;
	}
	public Long getPetId() {
		return petId;
	}

}
