package com.veterinaria.clinicapet.security.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prontuario")
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prontuario_id")
    private Integer id;

    @Column(name = "prontuario_data", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Column(name = "prontuario_procedimento", nullable = false)
    private String procedimento;

    @Column(name = "prontuario_valor_pago", nullable = false)
    private Float valorPago;

    @Column(name = "prontuario_cliente_nome", nullable = false)
    private String nomeCliente;

    @ManyToOne
    @JoinColumn(name = "veterinario_id", nullable = false)
    private Veterinario veterinario;

    @ManyToOne
    @JoinColumn(name = "clinica_id", nullable = false)
    private Clinica clinica;

    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;

    public Prontuario() {}

    public Prontuario(Date data, String procedimento, Float valorPago, String nomeCliente, Veterinario veterinario, Clinica clinica, Pet pet) {
        this.data = data;
        this.procedimento = procedimento;
        this.valorPago = valorPago;
        this.nomeCliente = nomeCliente;
        this.veterinario = veterinario;
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

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
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
        return "Prontuario [id=" + id + ", data=" + data + ", procedimento=" + procedimento +
               ", valorPago=" + valorPago + ", nomeCliente=" + nomeCliente +
               ", veterinario=" + veterinario.getNome() + ", clinica=" + clinica.getNome() +
               ", pet=" + pet.getNome() + "]";
    }
}
