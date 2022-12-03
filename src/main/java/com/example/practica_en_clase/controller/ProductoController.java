package com.example.practica_en_clase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.practica_en_clase.entity.Producto;
import com.example.practica_en_clase.services.ProductoServicio;

@Controller
@RequestMapping("/inicio")
public class ProductoController {
    
    @Autowired
	private ProductoServicio servicio;

	@GetMapping({ "/inicio", "/productos" })
	public String listarProductos(Model modelo) {
		modelo.addAttribute("productos", servicio.listarTodosLosProductos());
		return "productos";
	}

	@GetMapping("/productos/nuevo")
	public String mostrarFormularioDeRegistrtarProducto(Model modelo) {
		Producto producto = new Producto();
		modelo.addAttribute("producto", producto);
		return "crear_producto";
	}

	@PostMapping("/productos")
	public String guardarProducto(@ModelAttribute("producto") Producto producto) {
		servicio.guardarProducto(producto);
		return "redirect:/productos";
	}

	@GetMapping("/productos/editar/{Cod_Producto}")
	public String mostrarFormularioDeEditar(@PathVariable Long Cod_Producto, Model modelo) {
		modelo.addAttribute("producto", servicio.obtenerProductoPorId(Cod_Producto));
		return "editar_producto";
	}

	@PostMapping("/productos/{Cod_Producto}")
	public String actualizarProducto(@PathVariable Long Cod_Producto, @ModelAttribute("producto") Producto producto,
			Model modelo) {
		Producto productoExistente = servicio.obtenerProductoPorId(Cod_Producto);
		productoExistente.setCod_Producto(producto.getCod_Producto());
		productoExistente.setNombre(producto.getNombre());
        productoExistente.setPrecio(producto.getPrecio());

		servicio.actualizarProducto(productoExistente);
		return "redirect:/productos";
	}

	@GetMapping("/productos/{Cod_Producto}")
	public String eliminarProducto(@PathVariable Long Cod_Producto) {
		servicio.eliminarProducto(Cod_Producto);
		return "redirect:/productos";
	}

}
