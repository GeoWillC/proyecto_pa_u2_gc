package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2GcApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2GcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu=new Estudiante();
		estu.setNombre("Willian");
		estu.setApellido("Conlago");
		estu.setCedula("175125125");
		estu.setGenero("M");
		estu.setCiudad("Quito");
		this.estudianteService.crear(estu);
//		estu.setApellido("Cueva");
//		estu.setCedula("1751242668");
//		this.estudianteService.modificar(estu);
//		
//		Estudiante buscado=this.estudianteService.buscar(2);
//		System.out.println(buscado);
		
		//this.estudianteService.eliminar(1);
		
	}

}
