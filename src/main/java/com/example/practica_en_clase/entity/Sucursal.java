package com.example.practica_en_clase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sucursal")
public class Sucursal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Cod_Sucursal;
	
	@Column(name = "Nombre",nullable = false,length = 50)
	private String Nombre;

    @Override
    public String toString() {
        return "Sucursal [Cod_Sucursal=" + Cod_Sucursal + ", Nombre=" + Nombre + "]";
    }

    public Sucursal(Long cod_Sucursal, String nombre) {
        super();
        this.Cod_Sucursal = cod_Sucursal;
        this.Nombre = nombre;
    }

    public Sucursal(String nombre) {
        super();
        this.Nombre = nombre;
    }

    public Long getCod_Sucursal() {
        return Cod_Sucursal;
    }

    public void setCod_Sucursal(Long cod_Sucursal) {
        Cod_Sucursal = cod_Sucursal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Sucursal() {
        
    }

}
