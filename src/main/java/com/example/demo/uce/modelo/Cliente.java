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
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clie_sec")
	@SequenceGenerator(name = "clie_sec", sequenceName = "clie_sec", allocationSize = 1)
	@Column(name="clie_id")
	private Integer id;
	@Column(name="clie_cedula")
	private String cedula;
	@Column(name="clie_tarjeta_credito")
	private String tarjetaCredito;
	@Column(name="clie_nombre")
	private String nombre;
	@Column(name="clie_apellido")
	private String apellido;
	
	@ManyToMany(mappedBy = "clientes",cascade = CascadeType.ALL)
	private Set<Vehiculo> vehiculos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

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

	public Set<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Set<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cedula=" + cedula + ", tarjetaCredito=" + tarjetaCredito + ", nombre=" + nombre
				+ ", apellido=" + apellido + "]";
	}
	
}
