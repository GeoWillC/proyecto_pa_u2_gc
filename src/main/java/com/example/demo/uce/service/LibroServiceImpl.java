package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.repository.ILibroRepo;

@Service
public class LibroServiceImpl implements ILibroService{

	
	@Autowired
	private ILibroRepo iLibroRepo;
	
	@Override
	public void agregar(Libro Libro) {
		// TODO Auto-generated method stub
		this.iLibroRepo.insertar(Libro);
	}

}
