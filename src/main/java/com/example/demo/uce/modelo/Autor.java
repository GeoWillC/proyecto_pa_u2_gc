package com.example.demo.uce.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_sec")
	@SequenceGenerator(name = "auto_sec", sequenceName = "auto_sec", allocationSize = 1)
	@Column(name="auto_id")
	private Integer id;
	@Column(name="auto_nombre")
	private String nombre;
	
	@ManyToMany(mappedBy = "autores",cascade = CascadeType.ALL)//Se mapea con el conjunto de autores en la clase libro
	private Set<Libro> libros;
	

	//GET Y SET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Set<Libro> getLibros() {
		return libros;
	}
	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}
	
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
