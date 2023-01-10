package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {

	public void crear(Estudiante estudiante);
	public void modificar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void eliminar(Integer id);
}
