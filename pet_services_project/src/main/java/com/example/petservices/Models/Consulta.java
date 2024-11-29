package com.example.petservices.Models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Consulta extends Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String veterinario;
    private LocalDate data;
    private LocalTime hora;

    @ManyToOne
    private Pet pet;

    @ManyToOne
    private Localizacao localizacao;

    public Consulta(Long id, String local, LocalDate data, String tipoDeServico, Long id1,
                    String veterinario, LocalDate data1, LocalTime hora, Pet pet, Localizacao localizacao) {
        super(id, local, data, tipoDeServico);
        this.id = id1;
        this.veterinario = veterinario;
        this.data = data1;
        this.hora = hora;
        this.pet = pet;
        this.localizacao = localizacao;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public LocalDate getData() {
        return data;
    }

    @Override
    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}

