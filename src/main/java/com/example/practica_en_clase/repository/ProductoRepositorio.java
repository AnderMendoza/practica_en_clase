package com.example.practica_en_clase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practica_en_clase.entity.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
    
}
