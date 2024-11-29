package com.example.petservices.Repositories;

import com.example.petservices.Models.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
    // Métodos customizados para Localizacao
}

