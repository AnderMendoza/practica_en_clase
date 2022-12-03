package com.example.practica_en_clase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.practica_en_clase.entity.Sucursal;
import com.example.practica_en_clase.services.SucursalServicio;

@Controller
@RequestMapping("/inicio")
public class SucursalController {
    
    @Autowired
	private SucursalServicio servicio;

	@GetMapping({ "/inicio", "/sucursales" })
	public String listarSucursales(Model modelo) {
		modelo.addAttribute("sucursales", servicio.listarTodosLosSucursales());
		return "sucursales";
	}

	@GetMapping("/sucursales/nuevo")
	public String mostrarFormularioDeRegistrtarSucursal(Model modelo) {
		Sucursal sucursal = new Sucursal();
		modelo.addAttribute("sucursal", sucursal);
		return "crear_sucursal";
	}

	@PostMapping("/sucursales")
	public String guardarSucursal(@ModelAttribute("sucursal") Sucursal sucursal) {
		servicio.guardarSucursal(sucursal);
		return "redirect:/sucursales";
	}

	@GetMapping("/sucursales/editar/{Cod_Sucursal}")
	public String mostrarFormularioDeEditar(@PathVariable Long Cod_Sucursal, Model modelo) {
		modelo.addAttribute("sucursal", servicio.obtenerSucursalPorId(Cod_Sucursal));
		return "editar_sucursal";
	}

	@PostMapping("/sucursales/{Cod_Sucursal}")
	public String actualizarSucursal(@PathVariable Long Cod_Sucursal, @ModelAttribute("sucursal") Sucursal sucursal,
			Model modelo) {
		Sucursal sucursalExistente = servicio.obtenerSucursalPorId(Cod_Sucursal);
		sucursalExistente.setCod_Sucursal(sucursal.getCod_Sucursal());
		sucursalExistente.setNombre(sucursal.getNombre());

		servicio.actualizarSucursal(sucursalExistente);
		return "redirect:/sucursales";
	}

	@GetMapping("/sucursales/{Cod_Sucursal}")
	public String eliminarSucursal(@PathVariable Long Cod_Sucursal) {
		servicio.eliminarSucursal(Cod_Sucursal);
		return "redirect:/sucursales";
	}

}
