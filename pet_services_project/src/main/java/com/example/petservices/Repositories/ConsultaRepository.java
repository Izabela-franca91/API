package com.example.petservices.Repositories;

import com.example.petservices.Models.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    // Métodos customizados para Consulta
}

