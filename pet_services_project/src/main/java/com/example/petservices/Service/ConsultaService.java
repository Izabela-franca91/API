package com.example.petservices.Service;


import com.example.petservices.Models.Consulta;
import com.example.petservices.Repositories.ConsultaRepository;

import java.util.List;
import java.util.Optional;

public class ConsultaService {

    private ConsultaRepository consultaRepository;

    public Consulta salvarConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultaRepository.findAll();
    }

    public Optional<Consulta> obterConsultaPorId(Long id) {
        return consultaRepository.findById(id);
    }

    public void deletarConsulta(Long id) {
        consultaRepository.deleteById(id);
    }
}

