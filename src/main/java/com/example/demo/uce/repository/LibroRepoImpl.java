package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class LibroRepoImpl implements ILibroRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

}
