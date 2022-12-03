package com.example.practica_en_clase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica_en_clase.entity.Producto;
import com.example.practica_en_clase.repository.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio {

    @Autowired
	private ProductoRepositorio repositorio;

	@Override
	public List<Producto> listarTodosLosProductos() {
		return repositorio.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override
	public Producto obtenerProductoPorId(Long Cod_Producto) {
		return repositorio.findById(Cod_Producto).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override
	public void eliminarProducto(Long Cod_Producto) {
		repositorio.deleteById(Cod_Producto);

	}
    
}
