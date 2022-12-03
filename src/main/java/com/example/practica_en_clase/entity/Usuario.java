package com.example.practica_en_clase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Cod_Usuario;
	
	@Column(name = "Nombre",nullable = false,length = 50)
	private String Nombre;
	
	@Column(name = "User",nullable = false,length = 50)
	private String User;
	
	@Column(name = "Password",nullable = false,length = 50)
	private String Password;

    @Column(name = "Cod_Sucursal",nullable = false,length = 50)
	private String Cod_Sucursal;
	
	@Override
    public String toString() {
        return "Usuario [Cod_Usuario=" + Cod_Usuario + ", Nombre=" + Nombre + ", User=" + User + ", Password="
                + Password + ", Cod_Sucursal=" + Cod_Sucursal + "]";
    }

    public Usuario(Long cod_Usuario, String nombre, String user, String password, String cod_Sucursal) {
        super();
        this.Cod_Usuario = cod_Usuario;
        this.Nombre = nombre;
        this.User = user;
        this.Password = password;
        this.Cod_Sucursal = cod_Sucursal;
    }

    public Usuario(String nombre, String user, String password, String cod_Sucursal) {
        super();
        this.Nombre = nombre;
        this.User = user;
        this.Password = password;
        this.Cod_Sucursal = cod_Sucursal;
    }

    public Long getCod_Usuario() {
        return Cod_Usuario;
    }

    public void setCod_Usuario(Long cod_Usuario) {
        Cod_Usuario = cod_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCod_Sucursal() {
        return Cod_Sucursal;
    }

    public void setCod_Sucursal(String cod_Sucursal) {
        Cod_Sucursal = cod_Sucursal;
    }

    public Usuario() {
		
	}
    
}
