package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_sec")
	@SequenceGenerator(name = "vehi_sec", sequenceName = "vehi_sec", allocationSize = 1)
	@Column(name="vehi_id")
	private Integer id;
	@Column(name="vehi_precio_dia")
	private BigDecimal precioDia;
	@Column(name="vehi_marca")
	private String marca;
	@Column(name="vehi_categoria")
	private String categoria;
	@Column(name="vehi_numero_series")
	private String numeroSerie;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "renta",
			joinColumns = @JoinColumn(name="vecl_id_auto"),
			inverseJoinColumns = @JoinColumn(name="vecl_id_cliente")
			)
	private Set<Cliente> clientes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(BigDecimal precioDia) {
		this.precioDia = precioDia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", precioDia=" + precioDia + ", marca=" + marca + ", categoria=" + categoria
				+ ", numeroSerie=" + numeroSerie + "]";
	}
}
