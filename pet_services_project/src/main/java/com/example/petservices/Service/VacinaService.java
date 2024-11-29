package com.example.petservices.Service;


import com.example.petservices.Models.Vacina;
import com.example.petservices.Repositories.VacinaRepository;

import java.util.List;
import java.util.Optional;

public class VacinaService {

    private VacinaRepository vacinaRepository;

    public Vacina salvarVacina(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    public List<Vacina> listarVacinas() {
        return vacinaRepository.findAll();
    }

    public Optional<Vacina> obterVacinaPorId(Long id) {
        return vacinaRepository.findById(id);
    }

    public void deletarVacina(Long id) {
        vacinaRepository.deleteById(id);
    }
}

