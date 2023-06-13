package com.websemantica.carrito.entity;

import com.websemantica.carrito.dto.UsuarioDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "seg_usuario")
public class Usuario {
    @Id
    private String id;

    @Field("idusuario")
    private int usuarioId;
    @Field("usuario")
    private String user;
    private String contrasenia;
    private String apellido;
    private String nombre;
    @Field("documentoregistro")
    private String documentoRegistro;
    private String email;
    private String celular;
    private String avatar;
    private String token;

    public Usuario(){}

    public Usuario(String id,  int usuarioId, String user, String contrasenia, String apellido, String nombre, String documentoRegistro, String email, String celular, String avatar, String token) {
        this.id = id;
        this.usuarioId= usuarioId;
        this.user = user;
        this.contrasenia = contrasenia;
        this.apellido = apellido;
        this.nombre = nombre;
        this.documentoRegistro = documentoRegistro;
        this.email = email;
        this.celular = celular;
        this.avatar = avatar;
        this.token = token;
    }

    public Usuario(UsuarioDTO usuarioDTO) {
        this.id = usuarioDTO.getId();
        this.usuarioId = usuarioDTO.getUsuarioId();
        this.user = usuarioDTO.getUser();
        this.contrasenia = usuarioDTO.getContrasenia();
        this.apellido = usuarioDTO.getApellido();
        this.nombre = usuarioDTO.getNombre();
        this.documentoRegistro = usuarioDTO.getDocumentoRegistro();
        this.email = usuarioDTO.getEmail();
        this.celular = usuarioDTO.getCelular();
        this.avatar = usuarioDTO.getAvatar();
        this.token = usuarioDTO.getToken();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoRegistro() {
        return documentoRegistro;
    }

    public void setDocumentoRegistro(String documentoRegistro) {
        this.documentoRegistro = documentoRegistro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
