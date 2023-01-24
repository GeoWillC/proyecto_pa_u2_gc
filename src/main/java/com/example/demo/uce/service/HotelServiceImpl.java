package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.IHotelRepo;

@Service
public class HotelServiceImpl implements IHotelService{

	@Autowired
	private IHotelRepo iHotelRepo; 
	
	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.iHotelRepo.insertar(hotel);
	}

	@Override
	public void modificar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.iHotelRepo.actualizar(hotel);
	}

	@Override
	public Hotel encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iHotelRepo.borrar(id);
	}

}
