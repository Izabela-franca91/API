package com.example.petservices.Models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Localizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String endereco;
    private String cidade;
    private String tipoDeServico;

    @OneToMany(mappedBy = "localizacao")
    private List<Usuario> usuarios;

    public Localizacao(Long id, String endereco, String cidade, String tipoDeServico, List<Usuario> usuarios) {
        this.id = id;
        this.endereco = endereco;
        this.cidade = cidade;
        this.tipoDeServico = tipoDeServico;
        this.usuarios = usuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}

