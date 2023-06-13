package com.websemantica.carrito.service;

import com.websemantica.carrito.entity.Usuario;
import com.websemantica.carrito.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findByUsuarioId(int usuarioId) {
        return usuarioRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public Usuario saveOrUpdateUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuarioById(String id) {
        usuarioRepository.deleteById(id);
    }
}
