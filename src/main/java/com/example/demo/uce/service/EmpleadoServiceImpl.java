package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.repository.IEmpleadoRepo;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired 
	private IEmpleadoRepo iEmpleadoRepo;

	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.iEmpleadoRepo.insertar(empleado);
	}

	@Override
	public void modificar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.iEmpleadoRepo.actualizar(empleado);
	}

	@Override
	public Empleado encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iEmpleadoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iEmpleadoRepo.borrar(id);
	}



	

}
