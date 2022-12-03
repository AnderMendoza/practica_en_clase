package com.example.practica_en_clase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.practica_en_clase.entity.Usuario;
import com.example.practica_en_clase.services.UsuarioServicio;




@Controller
@RequestMapping("/inicio")
public class UsuarioController {
    
    @Autowired
	private UsuarioServicio servicio;

	@GetMapping({ "/inicio", "/usuarios" })
	public String listarUsuarios(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarTodosLosUsuarios());
		return "usuarios";
	}

	@GetMapping("/usuarios/nuevo")
	public String mostrarFormularioDeRegistrtarUsuario(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("usuario", usuario);
		return "crear_usuario";
	}

	@PostMapping("/usuarios")
	public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		servicio.guardarUsuario(usuario);
		return "redirect:/inicio/usuarios";
	}

	@GetMapping("/usuarios/editar/{Cod_Usuario}")
	public String mostrarFormularioDeEditar(@PathVariable Long Cod_Usuario, Model modelo) {
		modelo.addAttribute("usuario", servicio.obtenerUsuarioPorId(Cod_Usuario));
		return "editar_usuario";
	}

	@PostMapping("/usuarios/{Cod_Usuario}")
	public String actualizarUsuario(@PathVariable Long Cod_Usuario, @ModelAttribute("usuario") Usuario usuario,
			Model modelo) {
		Usuario usuarioExistente = servicio.obtenerUsuarioPorId(Cod_Usuario);
		usuarioExistente.setCod_Usuario(usuario.getCod_Usuario());
		usuarioExistente.setNombre(usuario.getNombre());
		usuarioExistente.setUser(usuario.getUser());
		usuarioExistente.setPassword(usuario.getPassword());
        usuarioExistente.setCod_Sucursal(usuario.getCod_Sucursal());

		servicio.actualizarUsuario(usuarioExistente);
		return "redirect:/inicio/usuarios";
	}

	@GetMapping("/usuarios/{Cod_Usuario}")
	public String eliminarUsuario(@PathVariable Long Cod_Usuario) {
		servicio.eliminarUsuario(Cod_Usuario);
		return "redirect:/inicio/usuarios";
	}

}
