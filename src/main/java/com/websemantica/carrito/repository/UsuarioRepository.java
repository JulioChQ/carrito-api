package com.websemantica.carrito.repository;

import com.websemantica.carrito.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario,String> {
    Usuario findByUsuarioId(int usuarioId);
}
