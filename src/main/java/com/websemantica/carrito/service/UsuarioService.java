package com.websemantica.carrito.service;

import com.websemantica.carrito.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findByUsuarioId(int usuarioId);
    Usuario saveOrUpdateUsuario(Usuario usuario);
    void deleteUsuarioById(String id);
}
