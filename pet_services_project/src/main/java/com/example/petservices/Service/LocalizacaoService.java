package com.example.petservices.Service;

import com.example.petservices.Models.Localizacao;
import com.example.petservices.Repositories.LocalizacaoRepository;
import java.util.List;
import java.util.Optional;

public class LocalizacaoService {

    private LocalizacaoRepository localizacaoRepository;

    public Localizacao salvarLocalizacao(Localizacao localizacao) {
        return localizacaoRepository.save(localizacao);
    }

    public List<Localizacao> listarLocalizacoes() {
        return localizacaoRepository.findAll();
    }

    public Optional<Localizacao> obterLocalizacaoPorId(Long id) {
        return localizacaoRepository.findById(id);
    }

    public void deletarLocalizacao(Long id) {
        localizacaoRepository.deleteById(id);
    }
}

