package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Ciudadano;

public interface ICiudadanoService {
	public void guardar(Ciudadano ciudadano);
	public void modificar(Ciudadano ciudadano);
	public Ciudadano encontrar(Integer id);
	public void eliminar(Integer id);
}
