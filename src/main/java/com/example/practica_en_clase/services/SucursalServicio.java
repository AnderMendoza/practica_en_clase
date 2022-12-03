package com.example.practica_en_clase.services;

import java.util.List;

import com.example.practica_en_clase.entity.Sucursal;

public interface SucursalServicio {
    
    public List<Sucursal> listarTodosLosSucursales();
	
	public Sucursal guardarSucursal(Sucursal sucursal);
	
	public Sucursal obtenerSucursalPorId(Long Cod_Sucursal);
	
	public Sucursal actualizarSucursal(Sucursal sucursal);
	
	public void eliminarSucursal(Long id);

}
