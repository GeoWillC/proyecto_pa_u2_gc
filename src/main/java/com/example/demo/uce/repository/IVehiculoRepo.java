package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Vehiculo;

public interface IVehiculoRepo {
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(Integer id);
	public void borrar(Integer id);
}
