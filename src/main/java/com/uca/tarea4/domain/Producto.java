package com.uca.tarea4.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Producto {
	
	@NotEmpty(message = "Please fill blank space")
	@Size(min=12,max=12, message ="size must be 12")
	private String codigo;
	
	@NotEmpty(message = "Please fill blank space")
	@Size(min=1, max=100)
	private String nombre;
	
	@NotEmpty(message = "Please fill blank space")
	@Size(min=1, max=100)
	private String marca;
	
	@NotEmpty(message = "Please fill blank space")
	@Size(min=1, max=500)
	private String descripcion;
	
	@NotEmpty(message = "Please fill blank space")
	@Digits(integer=10, fraction=0, message = "only full numbers")
	private String existencias;
	
	@NotEmpty(message = "Please fill blank space")
	@Pattern(regexp = "(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}", message = "please enter a valid dd/mm/yyyy date")
	private String fingreso;
	
	public Producto() {
		
	}
	
	public Producto(String codigo, String nombre, String marca, String descripcion, String existencias,
			String fingreso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.existencias = existencias;
		this.fingreso = fingreso;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencias() {
		return existencias;
	}
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
	public String getFingreso() {
		return fingreso;
	}
	public void setFingreso(String fingreso) {
		this.fingreso = fingreso;
	}
	
	
}
