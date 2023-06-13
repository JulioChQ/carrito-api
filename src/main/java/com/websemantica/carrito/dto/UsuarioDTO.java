package com.websemantica.carrito.dto;

import com.websemantica.carrito.entity.Usuario;

public class UsuarioDTO {

    private String id;
    private int usuarioId;
    private String user;
    private String contrasenia;
    private String apellido;
    private String nombre;
    private String documentoRegistro;
    private String email;
    private String celular;
    private String avatar;
    private String token;

    public UsuarioDTO(){}

    public UsuarioDTO(String id, int usuarioId, String user, String contrasenia, String apellido, String nombre, String documentoRegistro, String email, String celular, String avatar, String token) {
        this.id = id;
        this.usuarioId = usuarioId;
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
    public UsuarioDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.usuarioId = usuario.getUsuarioId();
        this.user = usuario.getUser();
        this.contrasenia = usuario.getContrasenia();
        this.apellido = usuario.getApellido();
        this.nombre = usuario.getNombre();
        this.documentoRegistro = usuario.getDocumentoRegistro();
        this.email = usuario.getEmail();
        this.celular = usuario.getCelular();
        this.avatar = usuario.getAvatar();
        this.token = usuario.getToken();
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
