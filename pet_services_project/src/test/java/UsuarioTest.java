package com.example.petservices.Service;


import com.example.petservices.Models.Usuario;
import com.example.petservices.Service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UsuarioTest {

    @Autowired
    private UsuarioService usuarioService;

    @Test
    public void testCreateUsuario() {
        Usuario usuario = new Usuario(null, "João", "senha123", "joao@email.com", "999888777", null);
        Usuario savedUsuario = usuarioService.save(usuario);
        assertNotNull(savedUsuario.getId());
    }
}


