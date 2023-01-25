package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionRepo {

	public void insertar(Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion buscar(Integer id);
	public void borrar(Integer id);
}
