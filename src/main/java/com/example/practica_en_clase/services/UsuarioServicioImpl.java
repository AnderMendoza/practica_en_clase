package com.example.practica_en_clase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica_en_clase.entity.Usuario;
import com.example.practica_en_clase.repository.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {
    
    @Autowired
	private UsuarioRepositorio repositorio;

	@Override
	public List<Usuario> listarTodosLosUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public Usuario obtenerUsuarioPorId(Long Cod_Usuario) {
		return repositorio.findById(Cod_Usuario).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public void eliminarUsuario(Long Cod_Usuario) {
		repositorio.deleteById(Cod_Usuario);

	}
    
}
