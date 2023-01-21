package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.repository.ICiudadanoRepo;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepo iCiudadanoRepo;
	
	@Override
	public void guardar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.iCiudadanoRepo.insertar(ciudadano);
	}

}
