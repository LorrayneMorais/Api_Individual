package com.veterinaria.clinicapet.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "prontuario")
public class prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cur_cd_id")
    private Integer id;

    @Column(name = "data_atendimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data; 

    @Column(name = "nome_veterinario", nullable = false)
    private String nomeVeterinario; 

    @Column(name = "procedimento", nullable = false)
    private String procedimento; 

    @Column(name = "valor_pago", nullable = false)
    private Double valorPago; 
 
    @ManyToOne
    @JoinColumn(name = "clinica_id", nullable = false) 
    private Clinica clinica;

    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false) 
    private Pet pet;


    public prontuario() {
    }

    public prontuario(Date data, String nomeVeterinario, String procedimento, Double valorPago, Clinica clinica, Pet pet) {
        this.data = data;
        this.nomeVeterinario = nomeVeterinario;
        this.procedimento = procedimento;
        this.valorPago = valorPago;
        this.clinica = clinica;
        this.pet = pet;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeVeterinario() {
        return nomeVeterinario;
    }

    public void setNomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Prontuario [id=" + id + ", data=" + data + ", nomeVeterinario=" + nomeVeterinario +
               ", procedimento=" + procedimento + ", valorPago=" + valorPago + ", clinica=" + clinica +
               ", pet=" + pet + "]";
    }
}
