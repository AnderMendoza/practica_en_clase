package com.example.practica_en_clase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practica_en_clase.entity.product;

@Repository
public interface productRepository extends JpaRepository<product, Long> {
    
}