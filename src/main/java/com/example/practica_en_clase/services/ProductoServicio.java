package com.example.practica_en_clase.services;

import java.util.List;

import com.example.practica_en_clase.entity.Producto;

public interface ProductoServicio {
    
    public List<Producto> listarTodosLosProductos();
	
	public Producto guardarProducto(Producto producto);
	
	public Producto obtenerProductoPorId(Long Cod_Producto);
	
	public Producto actualizarProducto(Producto producto);
	
	public void eliminarProducto(Long id);

}
