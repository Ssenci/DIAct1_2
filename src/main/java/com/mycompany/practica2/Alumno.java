/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author josee
 */
public class Alumno {
    String nombre, apellido, email, telefono;
	int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Alumno() {
	}

	public Alumno(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Alumno(String nombre, String apellido, String email, int edad, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.edad = edad;
                this.telefono = telefono;
	}

	public boolean mayoriaEdad() {

		if (edad >= 18) {
			return true;
		}
		return false;
	}
}
