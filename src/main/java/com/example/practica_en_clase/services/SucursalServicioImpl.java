package com.example.practica_en_clase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practica_en_clase.entity.Sucursal;
import com.example.practica_en_clase.repository.SucursalRepositorio;

@Service
public class SucursalServicioImpl implements SucursalServicio {
    
    @Autowired
	private SucursalRepositorio repositorio;

	@Override
	public List<Sucursal> listarTodosLosSucursales() {
		return repositorio.findAll();
	}

	@Override
	public Sucursal guardarSucursal(Sucursal sucursal) {
		return repositorio.save(sucursal);
	}

	@Override
	public Sucursal obtenerSucursalPorId(Long Cod_Sucursal) {
		return repositorio.findById(Cod_Sucursal).get();
	}

	@Override
	public Sucursal actualizarSucursal(Sucursal sucursal) {
		return repositorio.save(sucursal);
	}

	@Override
	public void eliminarSucursal(Long Cod_Sucursal) {
		repositorio.deleteById(Cod_Sucursal);

	}

}
