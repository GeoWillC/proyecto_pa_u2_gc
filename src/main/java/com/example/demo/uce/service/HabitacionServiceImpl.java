package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.repository.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService{

	@Autowired
	private IHabitacionRepo iHabitacionRepo;
	
	@Override
	public void guardar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.insertar(habitacion);
	}

	@Override
	public void modificar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.actualizar(habitacion);
	}

	@Override
	public Habitacion encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.borrar(id);
	}

}
