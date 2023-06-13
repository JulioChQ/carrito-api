package com.websemantica.carrito.controller;

import com.websemantica.carrito.dto.UsuarioDTO;
import com.websemantica.carrito.entity.Usuario;
import com.websemantica.carrito.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public List<UsuarioDTO> getAllUsuarios(){
        List<UsuarioDTO> usuarioDTOList = new ArrayList<>();
        usuarioService.findAll().forEach(x -> usuarioDTOList.add(new UsuarioDTO(x)));
        return usuarioDTOList;
    }

    @GetMapping(value = "/{usuarioId}")
    public UsuarioDTO getUsuarioByUsuarioId(@PathVariable("usuarioId") int usuarioId) {
        System.out.println(usuarioId);
        System.out.println(usuarioService.findByUsuarioId(usuarioId));
        return new UsuarioDTO(usuarioService.findByUsuarioId(usuarioId));
    }

    @PostMapping()
    public ResponseEntity<?> saveOrUpdateUsuario(@RequestBody UsuarioDTO usuarioDTO){
        usuarioService.saveOrUpdateUsuario(new Usuario(usuarioDTO));
        return new ResponseEntity("Usuario añadido exitosamente", HttpStatus.OK);
    }
    @DeleteMapping(value = "/{idUsuario}")
    public ResponseEntity<?> deleteUsuarioByIdUsuario(@PathVariable("idUsuario") int idUsuario) {
        usuarioService.deleteUsuarioById(usuarioService.findByUsuarioId(idUsuario).getId());
        return new ResponseEntity("Producto eliminado satisfactoriamente",HttpStatus.OK);
    }
}
