package com.Veterinaria.ClinicaPet.security.dto;

public class PetResponseDTO {
	private String nomePet;
    private String nomeUser;
    private String nomeClinica;

    public String getNomePet() {
        return nomePet;
    }
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }
    public String getNomeClinica() {
        return nomeClinica;
    }
    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }
	public String getNomeUser() {
		return nomeUser;
	}
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}
}