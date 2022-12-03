package com.example.practica_en_clase.services;

import java.util.List;

import com.example.practica_en_clase.entity.Usuario;

public interface UsuarioServicio {
    
    public List<Usuario> listarTodosLosUsuarios();
	
	public Usuario guardarUsuario(Usuario usuario);
	
	public Usuario obtenerUsuarioPorId(Long Cod_Usuario);
	
	public Usuario actualizarUsuario(Usuario usuario);
	
	public void eliminarUsuario(Long id);

}
