package com.example.practica_en_clase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Cod_Producto;
	
	@Column(name = "Nombre",nullable = false,length = 50)
	private String Nombre;

    @Column(name = "Precio",nullable = false,length = 50)
	private String Precio;

    @Override
    public String toString() {
        return "Producto [Cod_Producto=" + Cod_Producto + ", Nombre=" + Nombre + ", Precio=" + Precio + "]";
    }

    public Producto(Long cod_Producto, String nombre, String precio) {
        Cod_Producto = cod_Producto;
        Nombre = nombre;
        Precio = precio;
    }

    public Long getCod_Producto() {
        return Cod_Producto;
    }

    public void setCod_Producto(Long cod_Producto) {
        Cod_Producto = cod_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public Producto() {

    }

}
